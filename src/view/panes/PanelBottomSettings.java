/**
* @author SCHLOSSER M, LE FEUNTEUN F, KHALIFA Y
*/

package view.panes;

import javax.swing.*;
import java.awt.*;
import view.*;
//import controller.*;
//import model.*;

public class PanelBottomSettings extends JPanel{
  public JButton back, home, save;
  protected static String name, firstName;


  public PanelBottomSettings(){

    this.back = new JButton("Back");
    try {
      this.back.setIcon(new ImageIcon(getClass().getResource("../resources/arrowLeft.png")));
    }
    catch (NullPointerException e ){
      e.printStackTrace();
    }
    this.back.setPreferredSize(new Dimension(80,80));
    this.back.setVerticalTextPosition(AbstractButton.CENTER);
    this.back.setHorizontalTextPosition(AbstractButton.CENTER);


    this.home = new JButton("");
    try {
      this.home.setIcon(new ImageIcon(getClass().getResource("../resources/Home.png")));
    }
    catch (NullPointerException e ){
      e.printStackTrace();
    }
    this.home.setPreferredSize(new Dimension(90,90));
    this.home.setVerticalTextPosition(AbstractButton.CENTER);
    this.home.setHorizontalTextPosition(AbstractButton.CENTER);

    this.save = new JButton("");
    try
    {
      this.save.setIcon(new ImageIcon(getClass().getResource("../resources/Save.png")));
    }
    catch (NullPointerException e ){
      e.printStackTrace();
    }
    this.save.setPreferredSize(new Dimension(80,80));
    this.save.setVerticalTextPosition(AbstractButton.CENTER);
    this.save.setHorizontalTextPosition(AbstractButton.CENTER);

    //this.back. AJOUTER UN ActionListener

    this.initComponents();
  }

  public void initComponents(){
    this.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
    this.setLayout(new BorderLayout());
    this.add(back, BorderLayout.WEST);

    JPanel homeSave = new JPanel();
    homeSave.setLayout(new GridLayout(1,2));
    homeSave.add(home);
    homeSave.add(save);

    this.add(homeSave, BorderLayout.CENTER);
  }



}
