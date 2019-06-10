package view.buttons;

import controller.EmergencyButtonController;

import javax.swing.*;
import java.awt.*;


public class EmergencyButton extends JButton {
    private String path;
    private Image img;

    public EmergencyButton(EmergencyButtonController emergencyButton){
        super("");
        this.path = "../../resources/Home.png";
        try {
            this.setIcon(new ImageIcon(getClass().getResource(this.path)));
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        this.addActionListener(emergencyButton);
        this.setPreferredSize(new Dimension(100,100));
        this.setVerticalTextPosition(AbstractButton.CENTER);
        this.setHorizontalTextPosition(AbstractButton.CENTER);
    }


}

