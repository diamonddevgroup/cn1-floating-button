package com.codename1.demo;

import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.floatingbutton.codename1.FloatingButton;
import com.floatingbutton.codename1.FontIcon;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FloatingButtonDemo {

    private Form current;

    public void init(Object context) {
        try {
            // Pro only feature, uncomment if you have a pro subscription
            // Log.bindCrashProtection(true);
            Resources theme = Resources.openLayered("/theme");
            UIManager.getInstance().setThemeProps(theme.getTheme(theme.getThemeResourceNames()[0]));
        } catch (IOException ex) {
        }
    }

    public void start() {
        if (current != null) {
            current.show();
            return;
        }

        Form hi = new Form("Floating Button Demo", new BoxLayout(BoxLayout.Y_AXIS));

        Button btnTestSingle = new Button("Single Command");
        btnTestSingle.addActionListener((evt) -> {
            showTestSingleCommandsForm(hi);
        });

        Button btnTestMulti = new Button("Multiple Commands");
        btnTestMulti.addActionListener((evt) -> {
            showTestMultiCommandsForm(hi);
        });

        hi.add(btnTestSingle).add(btnTestMulti);

        hi.show();
    }

    private void showTestSingleCommandsForm(Form backForm) {
        Form hi = new Form();

        Toolbar t = new Toolbar();
        hi.setToolbar(t);
        t.setTitleCentered(true);
        t.setTitle("Test Single Command");

        Command back = new Command("", FontIcon.createFontIcon('\ue765', 0xffffff, 3)) {

            @Override
            public void actionPerformed(ActionEvent evt) {
                backForm.showBack();
            }
        };
        back.putClientProperty("TitleCommand", true);
        hi.setBackCommand(back);
        t.addCommandToLeftBar(back);

        FloatingButton floatingButton = new FloatingButton(new Command("") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                Dialog.show("Test", "I am a test dialog innitiated from floating button", "Ok", null);
            }
        }, FontIcon.FONTICON_PLUS);

        floatingButton.addToForm(hi, FloatingButton.BOTTOM_RIGHT);

        hi.show();
    }

    private void showTestMultiCommandsForm(Form backForm) {
        Form hi = new Form();

        Toolbar t = new Toolbar();
        hi.setToolbar(t);
        t.setTitleCentered(true);
        t.setTitle("Test Multi Command");

        Command back = new Command("", FontIcon.createFontIcon('\ue765', 0xffffff, 3)) {

            @Override
            public void actionPerformed(ActionEvent evt) {
                backForm.showBack();
            }
        };
        back.putClientProperty("TitleCommand", true);
        hi.setBackCommand(back);
        t.addCommandToLeftBar(back);

        Map<Command, Character> param = new HashMap<>();
        param.put(new Command("Write") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                Dialog.show("Test", "I am a test dialog innitiated from floating command", "Ok", null);
            }
        }, FontIcon.FONTICON_PENCIL);
        param.put(new Command("Camera") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                Dialog.show("Test", "I am a test dialog innitiated from floating command", "Ok", null);
            }
        }, FontIcon.FONTICON_CAMERA_2);
        param.put(new Command("Friends") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                Dialog.show("Test", "I am a test dialog innitiated from floating command", "Ok", null);
            }
        }, FontIcon.FONTICON_USERS_2);

        FloatingButton floatingButton = new FloatingButton(new Command("") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                Dialog.show("Test", "I am a test dialog innitiated from floating button", "Ok", null);
            }
        }, FontIcon.FONTICON_PLUS, param);

        floatingButton.addToForm(hi, FloatingButton.BOTTOM_RIGHT);

        hi.show();
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }

    public void destroy() {
    }
}
