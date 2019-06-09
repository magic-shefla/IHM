package view;

import controller.*;
import view.panes.*;

import model.Appli;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame  {

    private JPanel bottom;
    private PanelBottom paneB;
    private PanelBottomHome paneBH = new PanelBottomHome();
    private PanelBottomSettings paneBS = new PanelBottomSettings();
    private PanelBottomUrgence paneBU = new PanelBottomUrgence();

    private JPanel paneC;
    private PanelCategorie paneCCat;
    private PanelActivity paneCAct;
    private PanelEtapes paneCEta;

    private PanelTop paneT = new PanelTop(new HomeButtonController(this), new EmergencyButtonController(this));

    private PaneCenter lastPane;

    private JScrollPane scroll;

    private Appli model = new Appli();


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


        this.paneB = new PanelBottom(new ButtonBackEtapeController(this), new HomeButtonController(this), new ButtonNextEtapeController(this));
        this.bottom = paneB;
        this.generateModel();
        this.add(paneC, BorderLayout.CENTER);
        this.add(bottom, BorderLayout.SOUTH);
        this.add(paneT, BorderLayout.NORTH);

        this.pack();
        this.setVisible(true);
    }

    public void generateModel(){
        this.paneCCat = new PanelCategorie(model.getCategories(),this);
        this.paneCAct = new PanelActivity(model.getCategories().get(0).get(0),new SettingsButtonController(this), new PlayButtonActivityController(this), new MoreButtonController(this));
        this.paneC=(paneCAct);
    }

    public void setLastPane(){
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
                this.paneC = this.paneCCat;
                this.add(paneC);
                break;

            case ACTIVITE:
                this.remove(paneC);
                this.paneC = this.paneCAct;
                this.add(paneC);

                break;

            case ETAPE:
                this.remove(paneC);
                this.paneC = this.paneCEta;
                this.add(paneC);
                break;
        }
    }



    public void repaint(){
        this.remove(paneT);
        this.remove(paneC);
        this.remove(bottom);
        this.add(paneC, BorderLayout.CENTER);
        this.add(bottom, BorderLayout.SOUTH);
        this.add(paneT, BorderLayout.NORTH);
    }






    public static void main(String args[]){
        JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
        //name = jop.showInputDialog(null,"Enter your name", JOptionPane.QUESTION_MESSAGE);
        //firstName = jop2.showInputDialog(null,"Enter your firstName", JOptionPane.QUESTION_MESSAGE);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
                    ;

        });
    }

}
