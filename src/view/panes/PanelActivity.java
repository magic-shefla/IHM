package view.panes;

import controller.HomeButtonController;
import controller.MoreButtonController;
import controller.PlayButtonActivityController;
import controller.SettingsButtonController;
import model.Activite;
import model.Appli;
import model.Categorie;
import view.components.ViewActivity;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelActivity extends JPanel {
    private ArrayList<ViewActivity> activities;

    public PanelActivity(ArrayList<Activite> acts, SettingsButtonController settingsButton, PlayButtonActivityController playButton, MoreButtonController moreButton){
        super();
        this.activities = new ArrayList<>();

        this.setLayout(new GridLayout(0,2));

        initComponents(acts ,settingsButton, playButton, moreButton);
    }

    public void initComponents(ArrayList<model.Activite> acts, SettingsButtonController settingsButton, PlayButtonActivityController playButton, MoreButtonController moreButton){
        int i = 0;
        for (Activite act : acts){
            ViewActivity viewAct = new ViewActivity(settingsButton, playButton, moreButton, i, act);
            this.activities.add(viewAct);
            this.add(viewAct);
            i++;
        }

    }
}
