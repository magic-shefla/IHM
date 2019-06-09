package model;
import java.util.ArrayList;
import view.components.ViewCategorie;

public class Categorie{
  private ArrayList<Activite> activites;
  private String name;
  private String description;
  private Activite current;
  private ViewCategorie view;


  public Categorie(String n, String d, ViewCategorie v){
    this.name = n;
    this.description = d;
    this.activites = new ArrayList<Activite>();

    this.view = v;
  }

  public Categorie(String n, String d){
    this.name = n;
    this.description = d;
    this.activites = new ArrayList<Activite>();

  }

  public Activite getCurrent() {
    return current;
  }

  public void setCurrent(Activite current) {
    this.current = current;
  }

  public ViewCategorie getView(){
    return this.view;
  }

  public ArrayList<Activite> get(int i ){
    return this.activites;
  }

  public void add(Activite act){
    this.activites.add(act);
  }

  public void remove(Activite act){
    this.activites.remove(act);
  }
  public String toString(){
    String ret ="Categorie : " + this.name + "\nDescription : " + this.description+"\n\n";
    for (Activite act : this.activites){
      ret += "\t>" + act.toString() + "\n";
    }
    return ret;
  }
}
