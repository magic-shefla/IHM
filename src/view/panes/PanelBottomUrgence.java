/**
* @author SCHLOSSER M, LE FEUNTEUN F, KHALIFA Y
*/

package view.panes;

import view.buttons.BackButton;
import view.buttons.HomeButton;

import javax.swing.*;
import java.awt.*;
//import controller.*;
//import model.*;

public class PanelBottomUrgence extends JPanel{
  public JButton back, home;
  protected static String name, firstName;


  public PanelBottomUrgence(){

    this.back = new BackButton();
    this.back.setPreferredSize(new Dimension(80,80));



    this.home = new HomeButton();
    this.home.setPreferredSize(new Dimension(100,100));
    this.home.setVerticalTextPosition(AbstractButton.CENTER);
    this.home.setHorizontalTextPosition(AbstractButton.CENTER);

    //this.back. AJOUTER UN ActionListener

    this.initComponents();
  }

  public void initComponents(){
    this.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
    this.setLayout(new BorderLayout());
    this.add(back, BorderLayout.WEST);
    this.add(home, BorderLayout.CENTER);
  }


}
