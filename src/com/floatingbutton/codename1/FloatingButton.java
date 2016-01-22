package com.floatingbutton.codename1;

import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Graphics;
import com.codename1.ui.Image;
import com.codename1.ui.animations.CommonTransitions;
import com.codename1.ui.geom.Rectangle;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.LayeredLayout;
import com.codename1.ui.painter.BackgroundPainter;
import java.io.IOException;
import java.util.Map;

/**
 * Google material floating button like class, the color can be changed. It has
 * twitter like multi commands that can receive individual actions.
 *
 * @author Diamond
 */
public class FloatingButton extends Button {

    /**
     * FloatingButton.BOTTOM_RIGHT displays the button at the bottom right
     * corner
     */
    public static final int BOTTOM_RIGHT = 1;

    /**
     * FloatingButton.BOTTOM_RIGHT displays the button at the bottom left corner
     */
    public static final int BOTTOM_LEFT = 2;

    /**
     * FloatingButton.BOTTOM_RIGHT displays the button at the bottom center
     */
    public static final int BOTTOM_CENTER = 3;

    /**
     * Size of the floating button icon, default to 4
     */
    private int size = 4;

    /**
     * Color of the floating button icon, default to 0xffffff
     */
    private int color = 0xffffff;

    /**
     * Position where the floating button should be displayed
     */
    private int position = BOTTOM_RIGHT;

    /**
     * Construct a floating button with pen icon and without multi commands
     *
     * @param defaultCommand the default action the floating button should
     * perform
     */
    public FloatingButton(Command defaultCommand) {
        this(defaultCommand, FontIcon.FONTICON_PENCIL, null);
    }

    /**
     * Construct a floating button with the specified icon
     *
     * @param defaultCommand the default action the floating button should
     * perform
     * @param icon the floating button icon character code, e.g. '\u270E',
     * defaults to FontIcon.FONTICON_PENCIL
     */
    public FloatingButton(Command defaultCommand, Character icon) {
        this(defaultCommand, icon, null);
    }

    /**
     * Construct a floating button with the specified icon and multi commands
     *
     * @param defaultCommand the default action the floating button should
     * perform
     * @param icon the floating button icon character code, e.g. '\u270E',
     * defaults to FontIcon.FONTICON_PENCIL
     * @param floatingCommands optional commands to be shown when floating
     * button is pressed
     */
    public FloatingButton(Command defaultCommand, Character icon, Map<Command, Character> floatingCommands) {
        setUIID("FloatingButton");
        getAllStyles().setAlignment(CENTER);
        setIcon(FontIcon.createFontIcon(icon, color, size));
        drawButton();
        if (defaultCommand == null) {
            throw new IllegalArgumentException("Default command is null");
        }
        if (floatingCommands != null) {
            if (floatingCommands.size() < 1) {
                this.addActionListener(defaultCommand);
            } else {
                this.addActionListener((evt) -> {
                    showFloatingCommands(floatingCommands);
                });
            }
        } else {
            this.addActionListener(defaultCommand);
        }
    }

    /**
     *
     * @return the size of the floating button
     */
    public int getSize() {
        return size;
    }

    /**
     * Set the size of the floating button icon
     *
     * @param size the size of the floating button icon, default to 4
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     *
     * @return the color of the floating button icon
     */
    public int getColor() {
        return color;
    }

    /**
     * Set the color the floating button icon
     *
     * @param color the color of the floating button icon
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     *
     * @return the position of the floating button
     */
    public int getPosition() {
        return position;
    }

    /**
     * Set the position where the floating button should be placed
     *
     * @param position One of BOTTOM_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Draw the button using the background color and transparency of
     * "FloatingButton" uiid
     *
     */
    protected void drawButton() {
        BackgroundPainter p = new BackgroundPainter(this) {

            @Override
            public void paint(Graphics g, Rectangle rect) {
                boolean antiAliased = g.isAntiAliased();
                g.setAntiAliased(true);
                int r = Math.min(rect.getWidth(), rect.getHeight()) / 2;
                int x = rect.getX() + rect.getWidth() / 2 - r;
                int y = rect.getY() + rect.getHeight() / 2 - r;
                int alpha = getStyle().getBgTransparency();
                if (alpha < 0) {
                    alpha = 0xff;
                }
                g.drawImage(getImageFromString("floating_shadow.png"), x - 2, y - 2, 2 * r + 4, 2 * r + 4);
                g.setAlpha(alpha);
                g.setColor(getStyle().getBgColor());
                g.fillArc(x, y, 2 * r - 4, 2 * r - 4, 0, 360);
                //g.setAlpha(0xff);
                g.setAntiAliased(antiAliased);
            }
        };
        int pad = Math.round(size * 2 / 3);
        getAllStyles().setBgPainter(p);
        getAllStyles().setPadding(pad, pad, pad, pad);
    }

    //Considering using Google material icons, but icons here are limited and can't be expanded.
    /*private Image createMaterialIcon(Character icon) {
    Style style = new Style(getAllStyles().getBgColor(), getAllStyles().getFgColor(), getAllStyles().getFont(), (byte) 0);
    Image image = FontImage.createMaterial(icon, style);
    System.out.println(image);
    if (image != null) {
    return image;
    }
    return null;
    }*/
    /**
     * Show twitter android style floating commands, animation needs a lot of
     * work
     *
     * @param floatingCommands the commands to be shown when floating button is
     * pressed
     */
    private void showFloatingCommands(Map<Command, Character> floatingCommands) {
        Container commandsCont = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        for (Map.Entry<Command, Character> entry : floatingCommands.entrySet()) {
            Button btn = new Button(entry.getKey().getCommandName());
            btn.addActionListener(entry.getKey());
            btn.setUIID("FloatingCommand");

            FontIcon.setActualSize(FontIcon.convertSize(size) * 4 / 5);
            Button btnIcon = new Button(FontIcon.createFontIcon(entry.getValue(), 0xffffff));
            btnIcon.addActionListener(entry.getKey());
            btnIcon.setUIID("FloatingButton");

            BackgroundPainter p = new BackgroundPainter(btnIcon) {
                @Override
                public void paint(Graphics g, Rectangle rect) {
                    boolean antiAliased = g.isAntiAliased();
                    g.setAntiAliased(true);
                    int r = Math.min(rect.getWidth(), rect.getHeight()) / 2;
                    int x = rect.getX() + rect.getWidth() / 2 - r;
                    int y = rect.getY() + rect.getHeight() / 2 - r;
                    int alpha = getStyle().getBgTransparency();
                    if (alpha < 0) {
                        alpha = 0xff;
                    }
                    g.drawImage(getImageFromString("floating_shadow.png"), x - 2, y - 2, 2 * r + 4, 2 * r + 4);
                    g.setAlpha(alpha);
                    g.setColor(getStyle().getBgColor());
                    g.fillArc(x, y, 2 * r - 4, 2 * r - 4, 0, 360);
                    //g.setAlpha(0xff);
                    g.setAntiAliased(antiAliased);
                }
            };

            int pad = Math.round(size * 2 / 3);
            btnIcon.getAllStyles().setBgPainter(p);
            btnIcon.getAllStyles().setPadding(pad, pad, pad, pad);
            
            btnIcon.getAllStyles().setMargin(0, 0, 0, 0);

            Container bl = new Container(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER_ABSOLUTE));
            commandsCont.add(FlowLayout.encloseRightBottom(bl.add(BorderLayout.CENTER, btn)));

            switch (position) {
                case BOTTOM_LEFT:
                    bl.add(BorderLayout.WEST, btnIcon);
                    break;
                case BOTTOM_CENTER:
                    bl.add(BorderLayout.WEST, btnIcon);
                    break;
                default:
                    bl.add(BorderLayout.EAST, btnIcon);
                    break;
            }
        }
        Dialog dlg = new Dialog();
        dlg.setDialogUIID("Container");
        switch (position) {
            case BOTTOM_LEFT:
                dlg.setTransitionInAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, false, 200, false));
                dlg.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, true, 200, false));
                break;
            case BOTTOM_CENTER:
                dlg.setTransitionInAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_VERTICAL, true, 200, false));
                dlg.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_VERTICAL, false, 200, false));
                break;
            default:
                dlg.setTransitionInAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, true, 200, false));
                dlg.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, false, 200, false));
                break;
        }
        dlg.add(commandsCont);

        int marginLeft = getStyle().getMarginValue(true, Component.LEFT);
        int marginRight = getStyle().getMarginValue(true, Component.RIGHT);
        commandsCont.getStyle().setPaddingUnit(this.getStyle().getMarginUnit());
        commandsCont.getStyle().setPadding(0, 0, marginLeft, marginRight);

        dlg.showPopupDialog(this);
    }

    /**
     * Add floating button to specified position
     *
     * @param f the form to add the floating button to
     * @param position the position where the floating button should be placed.
     * One of FloatingButton.BOTTOM_RIGHT, FloatingButton.BOTTOM_LEFT,
     * FloatingButton.BOTTOM_CENTER
     */
    public void addToForm(Form f, int position) {
        if (!(f instanceof Form)) {
            throw new IllegalArgumentException("FloatingButton can only be added to a form");
        }

        Container cnt = f.getLayeredPane();
        if (cnt.getComponentCount() > 0) {
            throw new IllegalArgumentException("Form already has a component in its layered pane");
        }

        int marginBottom = getStyle().getMarginValue(true, Component.BOTTOM);
        cnt.setLayout(new LayeredLayout());
        cnt.getStyle().setPaddingUnit(this.getStyle().getMarginUnit());
        cnt.getStyle().setPadding(Component.BOTTOM, marginBottom);

        setPosition(position);
        switch (this.position) {
            case BOTTOM_LEFT:
                cnt.add(FlowLayout.encloseBottom(this));
                break;
            case BOTTOM_CENTER:
                cnt.add(FlowLayout.encloseCenterBottom(this));
                break;
            default:
                cnt.add(FlowLayout.encloseRightBottom(this));
                break;
        }
    }

    /**
     * Add floating button to default bottom right position
     *
     * @param f the form to add the floating button to
     */
    public void addToForm(Form f) {
        this.addToForm(f, position);
    }

    /**
     * Get an Image from the "src" folder
     *
     * @param name the name of the image
     * @return an image if exist or null
     */
    private Image getImageFromString(String name) {
        try {
            return Image.createImage(Display.getInstance().getResourceAsStream(getClass(), "/" + name));
        } catch (IOException ioe) {
        }
        return null;
    }
}
