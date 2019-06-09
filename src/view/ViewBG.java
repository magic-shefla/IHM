package view;
import view.panes.CenterPanel;

import javax.swing.*;
import java.awt.*;

public class ViewBG extends JFrame {
  JFrame frame;
  JButton button;
  CenterPanel p1;


  public ViewBG(){
    super();
    this.setPreferredSize(new Dimension(800, 600));
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.getContentPane().setLayout(new GridLayout(0,2));
    //this.frame.add(new ViewEtape());
    //this.frame.add(new ViewEtape());
    //this.frame.add
    //this.frame.add(new ViewEtape());
    p1 = new CenterPanel();
    this.add(p1);
    this.pack();



    this.setVisible(true);
  }




  public static void main(String args[]){
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ViewBG();
      }
    });
  }
}
