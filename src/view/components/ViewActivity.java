/**
* @author SCHLOSSER M, LE FEUNTEUN F, KHALIFA Y
*/

package view.components;

import javax.swing.*;
import java.awt.*;

import controller.MoreButtonController;
import controller.PlayButtonActivityController;
import controller.SettingsButtonController;
import model.Activite;
import view.*;
import view.buttons.PlayButtonActivity;
//import controller.*;
//import model.*;

public class ViewActivity extends JPanel{

  JPanel container, buttonContainer, generalPanel;
  JButton buttonSettings, buttonPlay, buttonMore;
  JLabel img;
  String imgPath;

  public ViewActivity(SettingsButtonController settingsButton, PlayButtonActivityController playController, MoreButtonController moreButton,int numAct, Activite a){
    this.initComponents(settingsButton, playController, moreButton,numAct, a);
  }

  public void initComponents(SettingsButtonController settingsButton, PlayButtonActivityController playController,
                             MoreButtonController moreButton, int numAct, Activite a){
    this.container = new JPanel();
    this.buttonContainer = new JPanel();
    this.generalPanel = new JPanel();

    this.buttonSettings = new JButton();
    this.buttonSettings.addActionListener(settingsButton);

    try {
      this.buttonSettings.setIcon(new ImageIcon(getClass().getResource("../../resources/Settings.png")));
    }
    catch (NullPointerException e){
      e.printStackTrace();
    }

    this.buttonPlay = new PlayButtonActivity(numAct,"../../resources/Next.png");
    this.buttonPlay.addActionListener(playController);
    this.buttonMore = new JButton("More");
    this.buttonMore.addActionListener(moreButton);

    this.img = new JLabel(a.getName());
    this.img.setHorizontalAlignment(JLabel.CENTER);
    this.img.setVerticalAlignment(JLabel.CENTER);

    try {
      this.img.setIcon(new ImageIcon(getClass().getResource(a.getImgPath())));
    }
    catch (NullPointerException e){
      e.printStackTrace();
    }
    this.img.setPreferredSize(new Dimension(100,100));
    this.img.setVerticalTextPosition(AbstractButton.TOP);
    this.img.setHorizontalTextPosition(AbstractButton.CENTER);

//    this.setLayout(new GridLayout(2,4));
    this.container.setLayout(new GridLayout(2,1));

    this.buttonContainer.setLayout(new GridLayout(1,3));
    this.buttonContainer.add(this.buttonSettings);
    this.buttonContainer.add(this.buttonPlay);
    this.buttonContainer.add(this.buttonMore);

//    this.add(new JPanel());
    this.container.add(this.img);
//    this.add(new JPanel());
//    this.add(new JPanel());
    this.container.add(this.buttonContainer);
//    this.add(new JPanel());
    this.add(this.container);
  //  this.setMinimumSize(new Dimension(360, 480));
    this.setPreferredSize(new Dimension(150,200 ));
//    this.setMaximumSize(new Dimension(360, 480));
//    this.setPreferredSize(new Dimension(50,50));

  }


}
