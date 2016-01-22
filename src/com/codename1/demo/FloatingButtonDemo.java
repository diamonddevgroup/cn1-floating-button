package com.codename1.demo;

import com.codename1.ui.Command;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.floatingbutton.codename1.FloatingButton;
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
        //showTestSingleCommandsForm();
        showTestMultiCommandsForm();
    }

    private void showTestSingleCommandsForm() {
        Form hi = new Form("Test Single Command");

        FloatingButton fb = new FloatingButton(new Command("") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                Dialog.show("Test", "I am a test dialog innitiated from floating button", "Ok", null);
            }
        }, FloatingButton.FONTICON_PLUS);

        fb.addToForm(hi, FloatingButton.BOTTOM_RIGHT);

        hi.show();
    }

    private void showTestMultiCommandsForm() {
        Form hi = new Form("Test Multi Command");

        Map<Command, Character> param = new HashMap<>();
        param.put(new Command("Write") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                Dialog.show("Test", "I am a test dialog innitiated from floating command", "Ok", null);
            }
        }, FloatingButton.FONTICON_PENCIL);
        param.put(new Command("Camera") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                Dialog.show("Test", "I am a test dialog innitiated from floating command", "Ok", null);
            }
        }, FloatingButton.FONTICON_CAMERA_2);
        param.put(new Command("Friends") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                Dialog.show("Test", "I am a test dialog innitiated from floating command", "Ok", null);
            }
        }, FloatingButton.FONTICON_USERS_2);

        FloatingButton fb = new FloatingButton(new Command("") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                Dialog.show("Test", "I am a test dialog innitiated from floating button", "Ok", null);
            }
        }, FloatingButton.FONTICON_PLUS, param);

        fb.addToForm(hi, FloatingButton.BOTTOM_RIGHT);

        hi.show();
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }

    public void destroy() {
    }
}
