/**
* @author SCHLOSSER M, LE FEUNTEUN F, KHALIFA Y
*/

package view.panes;

import controller.HomeButtonController;
import view.Appli;

import javax.swing.*;
import java.awt.*;

import java.util.*;
import java.text.*;
//import controller.*;
//import model.*;

public class PanelTop extends JPanel{
  private JLabel name, firstName, hourMinute, dayNum, day, year, month;
  private JButton firstAid, logo;
  private JPanel p1, p2, p3;
  private Calendar c;
  private int monthNum;
  private final String[] MONTHS = {"January", "February", "March", "April",
      "May", "June", "July", "August", "September", "October", "November",
      "December"};


  public PanelTop(HomeButtonController homeButton){
    this.initComponents(homeButton);
  }

  public void initComponents(HomeButtonController homeButton){
    //initPanel
    this.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
    this.setLayout(new GridLayout(1,3));
    p1 = new JPanel();
    p2 = new JPanel();
    p3 = new JPanel();

    //Panel 1

    this.logo = new JButton("Logo");
    try {
      this.logo.setIcon(new ImageIcon(getClass().getResource("../resources/Icon.jpg")));
    }
    catch (NullPointerException e){
      e.printStackTrace();
    }

    this.logo.addActionListener((homeButton));
    this.logo.setPreferredSize(new Dimension(80,80));
    this.logo.setVerticalTextPosition(AbstractButton.BOTTOM);
    this.logo.setHorizontalTextPosition(AbstractButton.CENTER);
    //this.logo. AJOUTER UN ActionListener

    p1.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
    p1.setLayout(new BorderLayout());
    p1.add(logo, BorderLayout.CENTER);
    this.add(p1);

    //Panel 2
    c = Calendar.getInstance(TimeZone.getDefault());
    SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE");



    p2.setLayout(new GridLayout(2,4));
    this.hourMinute = new JLabel(Integer.toString(c.get(Calendar.HOUR_OF_DAY)) +" : " + Integer.toString(c.get(Calendar.MINUTE)) );
    this.dayNum = new JLabel("      " + Integer.toString(c.get(Calendar.DAY_OF_MONTH)));
    this.day = new JLabel(dateFormat.format(c.getTime()));
    this.year = new JLabel(Integer.toString(c.get(Calendar.YEAR)));
    this.month = new JLabel(this.MONTHS[c.get(Calendar.MONTH)]);
    this.monthNum = c.get(Calendar.MONTH);

    this.name = new JLabel(Appli.getName());
    this.firstName = new JLabel(Appli.getFirstName());

    p2.add(this.day);
    p2.add(this.dayNum);
    p2.add(this.month);
    p2.add(this.year);
    p2.add(this.name);
    p2.add(this.firstName);
    p2.add(new JLabel());
    p2.add(this.hourMinute);

    this.add(p2);

    //Panel 3

    this.firstAid = new JButton("First Aid");
    try{
    this.firstAid.setIcon(new ImageIcon(getClass().getResource("../resources/firstAid.jpg")));
    }
    catch (NullPointerException e){
      e.printStackTrace();
    }
    this.firstAid.setPreferredSize(new Dimension(40,100));
    this.firstAid.setVerticalTextPosition(AbstractButton.BOTTOM);
    this.firstAid.setHorizontalTextPosition(AbstractButton.CENTER);
    //this.firstAid. AJOUTER UN ActionListener



    p3.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
    p3.setLayout(new BorderLayout());
    p3.add(firstAid, BorderLayout.CENTER);
    this.add(p3);
  }

  /**
   * set the month
   * @param numMonth the number of the month
   */
  public void setTheCalendarMonth(int numMonth) {
      if ((numMonth < 12) && (numMonth >= 0)) {
          this.monthNum = numMonth;
          this.c.set(Calendar.MONTH, this.monthNum);
          this.month.setText(this.MONTHS[this.monthNum]);
      }else{
          System.out.println("ERROR: wrong month number\nClass: PanelTop, "+
          "Method: setTheCalendarMonth");
      }
  }


}
