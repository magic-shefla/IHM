/**
* @author SCHLOSSER M, LE FEUNTEUN F, KHALIFA Y
*/

package view.panes;

import javax.swing.*;
import java.awt.*;

import controller.SettingsButtonController;
import view.*;
//import controller.*;
//import model.*;

public class PanelBottomHome extends JPanel{
  public JButton settings;
  protected static String name, firstName;


  public PanelBottomHome(SettingsButtonController settingsButton){

    this.settings = new JButton("Settings");
    this.settings.addActionListener(settingsButton);
    try {
      this.settings.setIcon(new ImageIcon(getClass().getResource("../../resources/Settings.png")));
    }
    catch (NullPointerException e){
      e.printStackTrace();
    }
    this.settings.setPreferredSize(new Dimension(100, 100));

    this.settings.setVerticalTextPosition(AbstractButton.BOTTOM);
    this.settings.setHorizontalTextPosition(AbstractButton.CENTER);

    //this.settings. AJOUTER UN ActionListener

    this.initComponents();
  }

  public void initComponents(){
    this.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
    this.setLayout(new BorderLayout());
    this.add(settings, BorderLayout.WEST);
  }


}
