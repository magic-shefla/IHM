package view.components;
import javax.swing.*;
import java.awt.*;

public class ViewEtape extends JPanel{
  JFrame frame;
  JPanel container;
  JPanel bottomContainer;
  JLabel imgLabel;
  JLabel instructionLabel;

  public ViewEtape(){
    this.initComponents();
  }

  public void initComponents(){
    this.frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    this.container = new JPanel();
    this.container.setLayout(new GridLayout(2,1));


    this.bottomContainer = new JPanel();
    this.bottomContainer.setLayout(new GridLayout(1,3));


    this.imgLabel = new JLabel(new ImageIcon("../resources/Android_robot.png"));
    this.instructionLabel = new JLabel("instructions");

    this.bottomContainer.add(this.instructionLabel);

    this.container.add(this.imgLabel);
    this.container.add(this.bottomContainer);

    this.frame.add(this.container);
    this.frame.pack();
    frame.setVisible(true);

  }




  public static void main(String args[]){
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ViewEtape();
      }
    });
  }


}
