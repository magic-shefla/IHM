package controller;

import view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonBackEtapeController implements ActionListener {
    MainFrame frame;

    public ButtonBackEtapeController(MainFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("BackEtapeClicked");
        this.frame.switchEtape(this.frame.getCurrentEtaNbr()-1);
        this.frame.validate();
    }
}
