package controller;

import view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoreButtonController implements ActionListener {
    private MainFrame frame;

    public MoreButtonController(MainFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("MoreClicked");
    }
}
