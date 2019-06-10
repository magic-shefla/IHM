package controller;

import view.MainFrame;
import view.PaneCenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackButtonController implements ActionListener  {
        private MainFrame frame;

    public BackButtonController(MainFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {

        //this.frame.switchPane(this.frame.getLastPane());
        System.out.println("BackClicked");
        frame.validate();
    }

}
