package view.panes;

import controller.PlayButtonActivityController;
import controller.SettingsButtonController;
import model.Categorie;
import view.MainFrame;
import view.components.ViewCategorie;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelCategorie extends JPanel {
    private ArrayList<ViewCategorie> categories;

    public PanelCategorie(ArrayList<Categorie> cats, MainFrame frame){
        this.categories = new ArrayList<>();
        this.setLayout(new GridLayout(0,2));
        initComponents(cats, frame);
    }

    public void initComponents(ArrayList<Categorie> cats, MainFrame frame){
        for (Categorie cat : cats){
            ViewCategorie viewCat = new ViewCategorie(new PlayButtonActivityController(frame), new SettingsButtonController(frame));
            this.categories.add(viewCat);
            this.add(viewCat);
        }

    }
}
