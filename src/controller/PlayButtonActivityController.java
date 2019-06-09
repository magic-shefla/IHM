package controller;

import view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonActivityController implements ActionListener {
    private MainFrame frame;

    public PlayButtonActivityController(MainFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("PlayClicked");
    }
}


