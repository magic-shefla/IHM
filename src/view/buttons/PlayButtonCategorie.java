package view.buttons;

import controller.PlayButtonActivityController;

import javax.swing.*;

public class PlayButtonCategorie extends JButton {
    private int numCat;

    public PlayButtonCategorie( int nc, String path){
        super();
        try {
            this.setIcon(new ImageIcon(getClass().getResource(path)));
        }
        catch (NullPointerException e){

        }
        this.numCat = nc;
    }

    public int getNumCat() {
        return numCat;
    }
}
