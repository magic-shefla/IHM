package controller;

import view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsButtonController implements ActionListener {
    private MainFrame frame;

    public SettingsButtonController(MainFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("SettingsClicked");
    }
}
