package view.buttons;

import javax.swing.*;
import java.awt.*;

public class BackButton extends JButton{
    private String path;
    private Image img;

    public BackButton(){
        super("");
        this.path = "../../resources/arrowLeft.png";
        try {
            this.setIcon(new ImageIcon(getClass().getResource(this.path)));
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        this.setPreferredSize(new Dimension(80,80));
        this.setVerticalTextPosition(AbstractButton.CENTER);
        this.setHorizontalTextPosition(AbstractButton.CENTER);
    }


}
