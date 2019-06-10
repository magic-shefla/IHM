/**
* @author SCHLOSSER M, LE FEUNTEUN F, KHALIFA Y
*/

package view.panes;
import javax.swing.*;
import java.awt.*;
import view.*;
import java.util.*;
import java.text.*;
//import controller.*;
//import model.*;

public class PanelSettings extends JPanel{
  private JLabel name, realName, firstName, realFirstName,tel, fuseauHoraire, medecin, personInCharge;
  private JButton    b;
  private JRadioButton rb;
  private JTextField realTel, nameDoc, firstNameDoc, telDoc, nameInCharge, firstNameInCharge, telInCharge;
  private JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9;

  public PanelSettings(){

    //init Panel
    this.p1 = new JPanel();
    this.p2 = new JPanel();
    this.p3 = new JPanel();
    this.p4 = new JPanel();
    this.p5 = new JPanel();
    this.p6 = new JPanel();
    this.p7 = new JPanel();
    this.p8 = new JPanel();
    this.p9 = new JPanel();

    //init JLabel
    this.name = new JLabel("Nom : ");
    Font font = new Font("Arial", Font.BOLD, 14);
    this.name.setFont(font);
    this.name.setVerticalAlignment(JLabel.CENTER);
    this.name.setHorizontalAlignment(JLabel.CENTER);

    this.realName = new JLabel(/*User.getName()*/);
    this.realName.setFont(font);
    this.realName.setVerticalAlignment(JLabel.CENTER);
    this.realName.setHorizontalAlignment(JLabel.CENTER);

    this.firstName = new JLabel("Prénom : ");
    this.firstName.setFont(font);
    this.firstName.setVerticalAlignment(JLabel.CENTER);
    this.firstName.setHorizontalAlignment(JLabel.CENTER);

    this.realFirstName  = new JLabel(/*User.getFirstName()*/);
    this.realFirstName.setFont(font);
    this.realFirstName.setVerticalAlignment(JLabel.CENTER);
    this.realFirstName.setHorizontalAlignment(JLabel.CENTER);

    this.tel = new JLabel("Téléphone : ");
    this.tel.setFont(font);
    this.tel.setVerticalAlignment(JLabel.CENTER);
    this.tel.setHorizontalAlignment(JLabel.CENTER);

    this.fuseauHoraire = new JLabel("Fuseau Horaire : ");
    Font font1 = new Font("Arial", Font.BOLD, 15);
    this.fuseauHoraire.setFont(font1);
    this.fuseauHoraire.setVerticalAlignment(JLabel.CENTER);
    this.fuseauHoraire.setHorizontalAlignment(JLabel.CENTER);

    this.medecin = new JLabel("Coordonnées du medecin : ");
    this.medecin.setFont(font1);
    this.medecin.setVerticalAlignment(JLabel.CENTER);
    this.medecin.setHorizontalAlignment(JLabel.CENTER);

    this.personInCharge = new JLabel("Personne en charge de\n l'utilisateur : ");
    this.personInCharge.setFont(font1);
    this.personInCharge.setVerticalAlignment(JLabel.CENTER);
    this.personInCharge.setHorizontalAlignment(JLabel.CENTER);

    //init JTextField
    this.realTel = new JTextField();
    this.nameDoc = new JTextField();
    this.firstNameDoc = new JTextField();
    this.telDoc = new JTextField();
    this.nameInCharge = new JTextField();
    this.firstNameInCharge = new JTextField();
    this.telInCharge = new JTextField();

    //Panel 1
    p1.setLayout(new GridLayout(0,2));
    p1.add(name);
    p1.add(realName);

    //Panel 2
    p2.setLayout(new GridLayout(0,2));
    p2.add(firstName);
    p2.add(realFirstName);

    //Panel 3
    p3.setLayout(new GridLayout(0,2));
    p3.add(tel);
    p3.add(realTel);

    //Panel 4
    p4.add(fuseauHoraire);

    //Panel 5
    p5.add(new JList());

    //Panel 6
    p6.add(medecin);

    //Panel 7
    p7.setLayout(new GridLayout(0,3));
    p7.add(nameDoc);
    p7.add(firstNameDoc);
    p7.add(telDoc);

    //Panel 8
    p8.add(personInCharge);

    //Panel 9
    p9.setLayout(new GridLayout(0,3));
    p9.add(nameInCharge);
    p9.add(firstNameInCharge);
    p9.add(telInCharge);

    //setLayout
    this.setLayout(new GridLayout(0,1));

    this.add(new JLabel());
    this.add(p1);
    this.add(new JLabel());
    this.add(new JLabel());
    this.add(p2);
    this.add(new JLabel());
    this.add(new JLabel());
    this.add(p3);
    this.add(new JLabel());
    this.add(new JLabel());
    this.add(p4);
    this.add(new JLabel());
    this.add(new JLabel());
    this.add(p5);
    this.add(new JLabel());
    this.add(new JLabel());
    this.add(p6);
    this.add(new JLabel());
    this.add(new JLabel());
    this.add(p7);
    this.add(new JLabel());
    this.add(new JLabel());
    this.add(p8);
    this.add(new JLabel());
    this.add(new JLabel());
    this.add(p9);
    this.add(new JLabel());



  }
}
