package controller;

import view.MainFrame;
import view.PaneCenter;
import view.buttons.PlayButtonCategorie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonCategorieController implements ActionListener {
    MainFrame frame;

    public PlayButtonCategorieController(MainFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("PlayButtonCategorieClicked");
        frame.setCurrentCat(((PlayButtonCategorie)(e.getSource())).getNumCat());

        frame.switchPane(PaneCenter.ACTIVITE);
        frame.validate();
    }
}
