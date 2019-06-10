/**
* @author SCHLOSSER M, LE FEUNTEUN F, KHALIFA Y
*/

package view.components;

import javax.swing.*;
import java.awt.*;

import controller.PlayButtonCategorieController;
import controller.SettingsButtonController;
import model.Categorie;
import view.*;
import view.buttons.PlayButtonCategorie;

import java.util.*;
import java.text.*;
//import controller.*;
//import model.*;

public class ViewCategorie extends JPanel{
  private JButton button;

  public ViewCategorie(PlayButtonCategorieController playButton, SettingsButtonController settingsButton, int numCat, Categorie cat){


    button = new PlayButtonCategorie(numCat, cat.getPath());
    this.button.setText(cat.getName());
    this.button.setMaximumSize(new Dimension(100,100));
    this.button.setVerticalTextPosition(AbstractButton.TOP);
    this.button.setHorizontalTextPosition(AbstractButton.CENTER);
    this.button.addActionListener(playButton);
    this.add(button);

  }

  public void initComponents(){

  }
}
