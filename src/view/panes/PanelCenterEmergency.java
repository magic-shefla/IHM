/**
* @author SCHLOSSER M, LE FEUNTEUN F, KHALIFA Y
*/

package view.panes;

import javax.swing.*;
import java.awt.*;

import controller.EmergencyCallButtonController;
import view.*;
//import controller.*;
//import model.*;

public class PanelCenterEmergency extends JPanel{
  private JButton emergencyButton;
  private JLabel emergencyLabel;

  public PanelCenterEmergency(EmergencyCallButtonController emergencyCall){
    this.emergencyButton = new JButton();
    this.emergencyButton.addActionListener(emergencyCall);
    this.emergencyButton.setIcon(new ImageIcon(getClass().getResource("../../resources/EmergencyButton.png")));
    this.emergencyButton.setPreferredSize(new Dimension(250,250));
    this.emergencyButton.setBorderPainted(false);
    this.emergencyButton.setFocusPainted(false);


    this.emergencyLabel = new JLabel("Emergency");
    Font font = new Font("Arial", Font.BOLD,28);
    this.emergencyLabel.setFont(font);
    this.emergencyLabel.setVerticalAlignment(JLabel.CENTER);
    this.emergencyLabel.setHorizontalAlignment(JLabel.CENTER);

    this.setLayout(new BorderLayout());

    this.add(emergencyLabel, BorderLayout.NORTH);
    this.add(emergencyButton, BorderLayout.CENTER);


  }




}
