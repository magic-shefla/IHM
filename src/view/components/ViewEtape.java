/**
* @author SCHLOSSER M, LE FEUNTEUN F, KHALIFA Y
*/

package view.components;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import model.Etape;
import view.*;
//import controller.*;
//import model.*;

public class ViewEtape extends JPanel{
  private JLabel activityLabel, etapeLabel, imgLabel;
  private TextArea instruction;
  private JPanel stringPanel, imgPanel;

  public ViewEtape(String actName, Etape e){
    this.stringPanel = new JPanel();
    this.imgPanel = new JPanel();

    this.activityLabel = new JLabel(actName);


    this.etapeLabel = new JLabel(((Integer)(e.getNum())).toString());


    this.imgLabel = new JLabel();
    try {
      this.imgLabel.setIcon(new ImageIcon(getClass().getResource(e.getImgPath())));
    }
    catch (Exception ex){

    }



    this.instruction = new TextArea(">"+actName + " :\n\t-Etape "+ e.getNum()+1 + ":\n\t"+e.getInstruction()  ,0,0,TextArea.SCROLLBARS_NONE);
    this.instruction.setPreferredSize(new Dimension(10,100));
    this.instruction.setMaximumSize(new Dimension(10,100));

//    this.instruction.setVerticalTextPosition(TextArea.CENTER_ALIGNMENT);

    stringPanel.setLayout(new GridLayout(2,1));
    JPanel paneAct = new JPanel();
    paneAct.setLayout(new BorderLayout());
    paneAct.add(new JLabel(), BorderLayout.WEST);
    paneAct.add(activityLabel, BorderLayout.CENTER);
    paneAct.add(new JLabel(), BorderLayout.EAST);

    stringPanel.add(paneAct);
    stringPanel.add(etapeLabel);

    imgPanel.setLayout(new GridLayout(1,3));
    imgPanel.add(new JLabel());
    imgPanel.add(imgLabel);
    imgPanel.add(new JLabel());


    this.setLayout(new BorderLayout());
    this.add(stringPanel,BorderLayout.NORTH);
    this.add(imgPanel,BorderLayout.CENTER);
    this.add(instruction,BorderLayout.SOUTH);
  }

  public void initComponents(){

    Font font = new Font("Arial", Font.BOLD,34);
    this.activityLabel.setFont(font);
    this.activityLabel.setVerticalAlignment(JLabel.CENTER);
    this.activityLabel.setHorizontalAlignment(JLabel.CENTER);

    Font font1 = new Font("Arial", Font.BOLD,24);
    this.etapeLabel.setFont(font1);
    this.etapeLabel.setVerticalAlignment(JLabel.TOP);
    this.etapeLabel.setHorizontalAlignment(JLabel.CENTER);

    this.imgLabel.setPreferredSize(new Dimension(400,400));
    this.imgLabel.setMinimumSize(new Dimension(200,200));
    this.imgLabel.setMaximumSize(new Dimension(600,600));
    this.imgLabel.setVerticalAlignment(JLabel.CENTER);
    this.imgLabel.setHorizontalAlignment(JLabel.CENTER);

    Font font2 = new Font("Arial", Font.BOLD, 16);
    this.instruction.setFont(font2);
    this.instruction.setEditable(false);
  }
}
