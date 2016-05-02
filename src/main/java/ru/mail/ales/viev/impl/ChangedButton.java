package ru.mail.ales.viev.impl;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 * Created by USER on 02.05.2016.
 */
public class ChangedButton extends Button {

    private Pane control;

    public ChangedButton(Pane control) {
        this.control = control;
    }

    public Pane getControl() {
        return control;
    }
}
