/**
* @author SCHLOSSER M, LE FEUNTEUN F, KHALIFA Y
*/

package view.panes;

import controller.BackButtonController;
import controller.HomeButtonController;
import view.buttons.BackButton;
import view.buttons.HomeButton;

import javax.swing.*;
import java.awt.*;

public class PanelBottomUrgence extends JPanel{
  public JButton back, home;
  protected static String name, firstName;


  public PanelBottomUrgence(HomeButtonController homeController){



    this.home = new HomeButton();
    this.home.setPreferredSize(new Dimension(100,100));
    this.home.setVerticalTextPosition(AbstractButton.CENTER);
    this.home.setHorizontalTextPosition(AbstractButton.CENTER);
    this.home.addActionListener(homeController);


    this.initComponents();
  }

  public void initComponents(){
    this.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
    this.setLayout(new BorderLayout());
    this.add(home, BorderLayout.CENTER);
  }


}
