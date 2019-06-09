package controller;

import view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveButtonController implements ActionListener {
    MainFrame frame;

    public SaveButtonController(MainFrame frame) {
        this.frame = frame;

    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("SaveButtonPressed");
    }
}

