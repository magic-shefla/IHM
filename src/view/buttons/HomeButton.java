package view.buttons;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class HomeButton extends JButton{
    private String path;
    private Image img;

    public HomeButton(String p){
        this.path = p;
        try {
            img = ImageIO.read(new File(this.path));
        }
        catch ( IOException e) {
            e.printStackTrace();
        }

    }

    public HomeButton(){
        super("");
        this.path = "../../resources/Home.png";
        try {
            this.setIcon(new ImageIcon(getClass().getResource(this.path)));
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        this.setPreferredSize(new Dimension(100,100));
        this.setVerticalTextPosition(AbstractButton.CENTER);
        this.setHorizontalTextPosition(AbstractButton.CENTER);
    }





}

