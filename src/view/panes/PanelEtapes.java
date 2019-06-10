package view.panes;

import model.Categorie;
import model.Etape;
import view.components.ViewEtape;

import javax.swing.*;
import java.util.ArrayList;

public class PanelEtapes extends JPanel {
    private ArrayList<Categorie> categories;
    private Etape current;
    private ViewEtape view;
    private int numCat, numAct;

    public PanelEtapes(ArrayList<Categorie> cats, int numCat, int numAct){
        this.categories = cats;
        this.numCat = numCat;
        this.numAct = numAct;
        initView();
        this.add(view);
    }

    public void initView(){

        this.current = this.categories.get(numCat).get(numAct).get(0);
        this.view = new ViewEtape(this.categories.get(numCat).get(numAct).getName(), this.current);

    }

    public void switchEtape(int nbr, int numCat, int numAct){
        this.numCat = numCat;
        this.numAct = numAct;
        this.current = this.categories.get(numCat).get(numAct).get(nbr);
        this.remove(view);
        this.view = new ViewEtape(this.categories.get(numCat).get(numAct).getName(), this.current);
        this.add(view);
        this.view.validate();
    }

    public int getEtapeNbr(){
        return this.current.getNum();
    }

    public int getActSize(){
        return this.categories.get(numCat).get(numAct).getSize();
    }

    public Etape getCurrent() {
        return current;
    }
}
