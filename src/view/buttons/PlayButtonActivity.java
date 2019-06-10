package view.buttons;

import javax.swing.*;

public class PlayButtonActivity extends JButton {
    private int numAct;

    public PlayButtonActivity(int numAct, String path) {
        super();
        try {
            this.setIcon(new ImageIcon(getClass().getResource(path)));
        }
        catch (NullPointerException e){

        }
        this.numAct = numAct;
    }

    public int getNumAct() {
        return numAct;
    }

    public void setNumAct(int numAct) {
        this.numAct = numAct;
    }
}
