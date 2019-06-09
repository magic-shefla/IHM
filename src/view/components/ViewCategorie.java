package view.components;
import controller.PlayButtonActivityController;
import controller.SettingsButtonController;

import javax.swing.*;
import java.awt.*;

public class ViewCategorie extends JPanel{
  JFrame frame;
  JPanel container;
  JPanel buttonContainer;
  JButton buttonSettings;
  JButton buttonPlay;
  JLabel imgLabel;
  JLabel nameLabel;

  String imgPath;

  public ViewCategorie(PlayButtonActivityController playButton, SettingsButtonController settingsButton){
    this.initComponents(playButton, settingsButton);
  }

  public void initComponents(PlayButtonActivityController playButton, SettingsButtonController settingsButton){
    //this.frame = new JFrame();

    this.container = new JPanel();
    this.buttonContainer = new JPanel();

    this.buttonSettings = new JButton();
    this.buttonSettings.addActionListener(settingsButton);
    this.buttonPlay = new JButton();
    this.buttonPlay.addActionListener(playButton);

    this.imgLabel = new JLabel(new ImageIcon("../../resources/Android_robot.png"));
    this.nameLabel = new JLabel("Nom");
    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //this.container.setLayout(new GridLayout(2,1));
    this.container.setLayout(new GridLayout(3,1));

    this.buttonContainer.setLayout(new GridLayout(1,3));
    this.buttonContainer.add(this.buttonSettings);
    this.buttonContainer.add(this.buttonPlay);
    this.add(this.nameLabel);
    this.add(this.imgLabel);
    this.add(this.buttonContainer);
    this.setPreferredSize(new Dimension(50,50));

    //this.frame.add(this.container);
    //this.frame.pack();
    //frame.setVisible(true);

  }




}
