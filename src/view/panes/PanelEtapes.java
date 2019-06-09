package view.panes;

import model.Etape;
import view.components.ViewEtape;

import javax.swing.*;
import java.util.ArrayList;

public class PanelEtapes extends JPanel {
    private ArrayList<ViewEtape> etapes;
    private ViewEtape current;

    public PanelEtapes(ArrayList<Etape> eta){
        this.etapes = new ArrayList<ViewEtape>();

        for (int i = 0 ; i < eta.size() ; i++){
            this.etapes.add(new ViewEtape());
        }

        this.current = this.etapes.get(0);
    }


}
