package controller;

import view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonNextEtapeController implements ActionListener {
    MainFrame frame;

    public ButtonNextEtapeController(MainFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("NextEtapeClicked");
        this.frame.switchEtape(this.frame.getCurrentEtaNbr()+1);
        this.frame.validate();
    }
}
