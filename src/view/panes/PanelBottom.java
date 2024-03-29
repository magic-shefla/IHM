/**
* @author SCHLOSSER M, LE FEUNTEUN F, KHALIFA Y
*/

package view.panes;

import controller.*;
import view.buttons.BackButton;
import view.buttons.HomeButton;
import view.buttons.NextButton;

import javax.swing.*;
import java.awt.*;

public class PanelBottom extends JPanel{
  public JButton back, home, next;


  public PanelBottom(ButtonBackEtapeController backController, HomeButtonController homeController, ButtonNextEtapeController playController){

    this.back = new BackButton();
    this.back.addActionListener((backController));

    this.home = new HomeButton();
    this.home.addActionListener(homeController);

    this.next = new NextButton();
    this.next.addActionListener(playController);

    //this.back. AJOUTER UN ActionListener

    this.initComponents();
  }

  public void initComponents(){
    this.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
    this.setLayout(new BorderLayout());
    this.add(back, BorderLayout.WEST);
    this.add(home, BorderLayout.CENTER);
    this.add(next, BorderLayout.EAST);
  }

  public JButton getBack() {
    return back;
  }

  public void setBack(JButton back) {
    this.back = back;
  }

  public JButton getHome() {
    return home;
  }

  public void setHome(JButton home) {
    this.home = home;
  }

  public JButton getNext() {
    return next;
  }

  public void setNext(JButton next) {
    this.next = next;
  }
}
