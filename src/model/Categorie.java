package model;
import java.util.ArrayList;
import view.components.ViewCategorie;

public class Categorie{
  private ArrayList<Activite> activites;
  private String name;
  private String description;
  private String path;
  private Activite current;


  public Categorie(String n, String d, String p){
    this.name = n;
    this.description = d;
    this.path = p;
    this.activites = new ArrayList<Activite>();

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


  public Activite get(int i ){
    return this.activites.get(i);
  }
  public ArrayList<Activite> getActivites(){
    return this.activites;
  }

  public void add(Activite act){
    this.activites.add(act);
  }

  public void remove(Activite act){
    this.activites.remove(act);
  }

  public String getPath() {
    return path;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String toString(){
    String ret ="Categorie : " + this.name + "\nDescription : " + this.description+"\n\n";
    for (Activite act : this.activites){
      ret += "\t>" + act.toString() + "\n";
    }
    return ret;
  }
}
