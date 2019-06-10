package model;

//import view.ViewActivite;

import java.util.ArrayList;

public class Activite{
  private String name;
  private String imgPath;
  private ArrayList<Etape> etapes;
  private String description;


  public Activite(String n, String d){
    this.name = n;
    this.description = d;
    this.etapes = new ArrayList<Etape>();
    this.imgPath = "../../resources/firstAid.jpg";
  }

  public Activite(String n, String d, ArrayList<Etape> e, String p){
    this.name = n;
    this.description = d;
    this.etapes = e;
    this.imgPath = p;
  }


  public Activite(String n, String d, String p){
    this.name = n;
    this.description = d;
    this.etapes = new ArrayList<>();
    this.imgPath = p;
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

  public Etape get(int i ){
    return this.etapes.get(i);
  }

  public ArrayList<Etape> getEtapes(){
    return this.etapes;
  }

  public String getName() {
    return name;
  }

  public String getImgPath() {
    return imgPath;
  }

  public String getDescription() {
    return description;
  }

  public int getSize(){
    return this.etapes.size();
  }

  public String toString(){
    String ret = "Activite : " + this.name + "\n\t\tDescription : " + this.description + "\n";
    for (Etape e : this.etapes){
      ret += "\t> " + e.toString() + "\n";
    }
    return ret;
  }
}
