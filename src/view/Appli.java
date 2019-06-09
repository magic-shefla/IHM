/**
* @author SCHLOSSER M, LE FEUNTEUN F, KHALIFA Y
*/

package view;

import controller.HomeButtonController;
import view.panes.PanelBottom;
import view.panes.PanelCenter;
import view.panes.PanelTop;

import javax.swing.*;
import java.awt.*;
//import controller.*;
//import model.*;

public class Appli{
  protected static String name, firstName;

  public Appli(){
    this.initComponents();
  }

  public void initComponents(){

    JFrame frame = new JFrame("Application");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    frame.setTitle("Application");

    frame.setPreferredSize(new Dimension(750,1000));
    frame.setResizable(false);

    //PanelBottomHome unPanelBottom = new PanelBottomHome();

    //PanelBottom unPanelBottom = new PanelBottom();
   // unPanelBottom.home.addMouseListener();
  //  PanelBottomSettings unPanelBottom = new PanelBottomSettings();
  //  PanelBottomUrgence unPanelBottom = new PanelBottomUrgence();

    PanelCenter unPanelCenter = new PanelCenter();
    //PanelTop unPanelTop = new PanelTop(new HomeButtonController(this));

    JScrollPane scroll = new JScrollPane();
    scroll.setVerticalScrollBarPolicy(scroll.VERTICAL_SCROLLBAR_AS_NEEDED);
    scroll.setHorizontalScrollBarPolicy(scroll.HORIZONTAL_SCROLLBAR_AS_NEEDED);



    //frame.getContentPane().setLayout(new BorderLayout());
    //frame.getContentPane().add(unPanelCenter, BorderLayout.CENTER);
    //frame.getContentPane().add(unPanelBottom, BorderLayout.SOUTH);
    //frame.getContentPane().add(unPanelTop, BorderLayout.NORTH);

    frame.add(scroll, BorderLayout.EAST);

    frame.pack();
    frame.setVisible(true);
  }

  public static String getName(){
    return name;
  }

  public static String getFirstName(){
    return firstName;
  }

  public static void main(String args[]){
    JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
    name = jop.showInputDialog(null,"Enter your name", JOptionPane.QUESTION_MESSAGE);
    firstName = jop2.showInputDialog(null,"Enter your firstName", JOptionPane.QUESTION_MESSAGE);

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Appli();
      }
    });
  }

}
