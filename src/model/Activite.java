package model;

//import view.ViewActivite;

import java.util.ArrayList;

public class Activite{
  private String name;
  private String imgPath;
  private ArrayList<Etape> etapes;
  private String description;
  private Etape current;

//  private ViewActivite view;

  public Activite(String n, String d, ArrayList<Etape> e, Object view){
    this.name = n;
    this.description = d;
    this.etapes = e;
//    this.view = view;
  }

  public Activite(String n, String d, ArrayList<Etape> e){
    this.name = n;
    this.description = d;
    this.etapes = e;

//  this.view = new ViewActivite();
  }


  public Activite(String n, String d){
    this.name = n;
    this.description = d;
    this.etapes = new ArrayList<>();
  }

  public void add(Etape e){
    this.etapes.add(e);
  }

  public void insert(Etape e){
    int i = 1;
    for (Etape etape : this.etapes){
      i++;
      if (e.getNum() < etape.getNum()){
        etape.setNum(i);
      }
    }
    this.etapes.add(e.getNum(),e);
  }

  public void remove(Etape e){
    int i = 1;
    for (Etape etape : this.etapes){
      i++;
      if (e.getNum() < etape.getNum()){
        etape.setNum(etape.getNum()-1);
      }
      this.etapes.remove(e);
    }
  }

  public ArrayList<Etape> get(int i ){
    return this.etapes;
  }

  public String toString(){
    String ret = "Activite : " + this.name + "\n\t\tDescription : " + this.description + "\n";
    for (Etape e : this.etapes){
      ret += "\t> " + e.toString() + "\n";
    }
    return ret;
  }
}
