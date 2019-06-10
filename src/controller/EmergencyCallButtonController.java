package controller;

import view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmergencyCallButtonController  implements ActionListener {
    MainFrame frame;

    public EmergencyCallButtonController(MainFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("EmergencyCallClicked");
    }
}
