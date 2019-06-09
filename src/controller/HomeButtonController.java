package controller;

import view.MainFrame;
import view.PaneCenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeButtonController implements ActionListener {
    private MainFrame frame;

    public HomeButtonController(MainFrame f){
        this.frame = f;
    }

    public void actionPerformed(ActionEvent e) {
        frame.switchPane(PaneCenter.CATEGORIES);
        System.out.println("HomeClicked");
        frame.validate();
        frame.setVisible(true);
        frame.repaint();
    }
}
