package view;

import controller.*;
import view.panes.*;

import model.Appli;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame  {

    private JPanel bottom;
    private PanelBottom paneB;
    private PanelBottomHome paneBH;
    private PanelBottomSettings paneBS;
    private PanelBottomUrgence paneBU;

    private JPanel paneC;
    private PanelCategorie paneCCat;
    private PanelActivity paneCAct;
    private PanelEtapes paneCEta;
    private PanelCenterEmergency paneCE;
    private PanelSettings paneCS;

    private PanelTop paneT = new PanelTop(new HomeButtonController(this), new EmergencyButtonController(this));

    private PaneCenter lastPane;

    private JScrollPane scroll;

    private Appli model = new Appli();

    private int currentCat;
    private int currentAct;


    public MainFrame(){
        super("Application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    public void initComponents(){
        this.setPreferredSize(new Dimension(750,1000));
        this.setResizable(false);

        this.scroll = new JScrollPane();
        scroll.setVerticalScrollBarPolicy(scroll.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(scroll.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.setLayout(new BorderLayout());


        this.paneB = new PanelBottom(new ButtonBackEtapeController(this),
                new HomeButtonController(this), new ButtonNextEtapeController(this));
        this.paneBH = new PanelBottomHome(new SettingsButtonController(this));
        this.paneBS = new PanelBottomSettings(new HomeButtonController(this));
        this.paneBU = paneBU = new PanelBottomUrgence(new HomeButtonController(this));

        this.paneCE = new PanelCenterEmergency(new EmergencyCallButtonController(this));
        this.paneCS = new PanelSettings();

        this.bottom = paneBH;
        this.generateModel();
        this.add(paneC, BorderLayout.CENTER);
        this.add(bottom, BorderLayout.SOUTH);
        this.add(paneT, BorderLayout.NORTH);

        this.pack();
        this.setVisible(true);
    }

    public void generateModel(){
        this.paneCCat = new PanelCategorie(model.getCategories(),this);
        this.paneCAct = new PanelActivity(model.getCategories().get(this.currentCat).getActivites(), new SettingsButtonController(this),
                new PlayButtonActivityController(this), new MoreButtonController(this));

        switchPane(PaneCenter.CATEGORIES);
    }

    public void setLastPane(){
        if (this.paneC == null){
            this.paneC = this.paneCCat;
        }
        if (this.paneC.equals(this.paneCEta)){
            this.lastPane = PaneCenter.ETAPE;
        }
        else if (this.paneC.equals(this.paneCAct)){
            this.lastPane = PaneCenter.ACTIVITE;
        }
        else {
            this.lastPane = PaneCenter.CATEGORIES;
        }
    }

    public PaneCenter getLastPane() {
        return lastPane;
    }

    public void switchPane(PaneCenter p){
        setLastPane();
        switch (p){
            case CATEGORIES:

                this.remove(paneC);
                this.paneCCat = new PanelCategorie(model.getCategories(),this);
                this.paneC = this.paneCCat;
                this.add(paneC, BorderLayout.CENTER);

                this.remove(bottom);
                this.paneBH = new PanelBottomHome(new SettingsButtonController(this));
                this.bottom = this.paneBH;
                this.add(bottom, BorderLayout.SOUTH);
               break;

            case ACTIVITE:
                this.remove(paneC);
                this.paneCAct = new PanelActivity(model.getCategories().get(this.currentCat).getActivites(),new SettingsButtonController(this),
                        new PlayButtonActivityController(this), new MoreButtonController(this));
                this.paneC = this.paneCAct;
                this.add(paneC, BorderLayout.CENTER);

                this.remove(bottom);
                this.paneBU = new PanelBottomUrgence(new HomeButtonController(this));
                this.bottom = this.paneBU;
                this.add(bottom, BorderLayout.SOUTH);
                System.out.println("cat :" + this.getCurrentCat());
                break;

            case ETAPE:
                this.remove(paneC);
                this.paneCEta = new PanelEtapes(model.getCategories(),getCurrentCat(),getCurrentAct());
                this.paneC = this.paneCEta;
                this.add(paneC, BorderLayout.CENTER);

                this.remove(bottom);
                this.paneB = new PanelBottom(new ButtonBackEtapeController(this),
                        new HomeButtonController(this), new ButtonNextEtapeController(this));
                this.bottom = this.paneB;
                this.add(bottom, BorderLayout.SOUTH);
                System.out.println("cat :" + this.getCurrentCat()+ "\nact :" +this.getCurrentAct());

                break;

            case SETTINGS:
                this.remove(paneC);
                this.paneCS = new PanelSettings();
                this.paneC = this.paneCS;
                this.add(paneC, BorderLayout.CENTER);

                this.remove(bottom);
                this.paneBS = new PanelBottomSettings(new HomeButtonController(this));
                this.bottom = this.paneBS;
                this.add(bottom, BorderLayout.SOUTH);
                break;


            case EMERGENCY:
                this.remove(paneC);
                this.paneCE = new PanelCenterEmergency(new EmergencyCallButtonController(this));
                this.paneC = this.paneCE;
                this.add(paneC, BorderLayout.CENTER);

                this.remove(bottom);
                this.paneBU = new PanelBottomUrgence(new HomeButtonController(this));
                this.bottom = this.paneBU;
                this.add(bottom, BorderLayout.SOUTH);
                break;
        }
    }


    public void switchEtape(int nbr){
        System.out.println("nbr : " + nbr);
        try {
            this.paneCEta.switchEtape(nbr, currentCat, currentAct);
        }
        catch (IndexOutOfBoundsException e){
            if (nbr < 0){
                this.paneCEta.switchEtape(0, currentCat, currentAct);
            }
            else {
                this.paneCEta.switchEtape(this.paneCEta.getActSize(), currentCat, currentAct);
            }
        }
        this.remove(paneC);
        this.paneC = this.paneCEta;
        this.add(paneC);
    }

    public int getCurrentEtaNbr(){
        return this.paneCEta.getCurrent().getNum();
    }

    public int getCurrentCat() {
        return currentCat;
    }

    public void setCurrentCat(int currentCat) {
        this.currentCat = currentCat;
    }

    public int getCurrentAct() {
        return currentAct;
    }

    public void setCurrentAct(int currentAct) {
        this.currentAct = currentAct;
    }

    public String getActDescription(int numAct){
        return this.model.getCategories().get(currentCat).get(numAct).getDescription();
    }



}
