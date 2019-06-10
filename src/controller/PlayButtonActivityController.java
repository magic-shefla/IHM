package controller;

import view.MainFrame;
import view.PaneCenter;
import view.buttons.PlayButtonActivity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonActivityController implements ActionListener {
    private MainFrame frame;

    public PlayButtonActivityController(MainFrame frame) {
        this.frame = frame;
    }


    public void actionPerformed(ActionEvent e) {
        System.out.println("PlayActivityClicked");
        frame.setCurrentAct(((PlayButtonActivity)(e.getSource())).getNumAct());

        frame.switchPane(PaneCenter.ETAPE);
        frame.validate();
        System.out.println(((PlayButtonActivity)(e.getSource())).getNumAct());
    }
}


