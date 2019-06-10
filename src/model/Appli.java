package model;
import java.util.ArrayList;

public class Appli{
  private ArrayList<Categorie> categories;



  public Appli(){
    this.categories = new ArrayList<Categorie>();
    //this.fill(4,3,10);
    this.initApp();

  }

  public ArrayList<Categorie> getCategories() {
    return categories;
  }

  public void fill(int nbCat, int nbAct, int nbEta){
    int globalJ = 0;
    for (int i = 0 ; i < nbCat ; i++){
      Categorie cat = new Categorie("Cat " + i, "desc");
      for (int j= 0 ; j < nbAct ; j++){
        Activite act = new Activite("Act " + globalJ, "desc");
        for (int k = 0 ; k < nbEta ; k++){
          act.add(new Etape("Etape " + k,"./", k));
        }
        cat.add(act);
        globalJ++;
      }
      this.categories.add(cat);
    }
  }

  public void initApp(){
    Etape e1 = new Etape("Trouver un verre", "../../resources/PrendreUnVerre.png",0);
    Etape e2 = new Etape("Sortir le verre","../../resources/PrendreUnVerre.png",1);
    Activite a1 = new Activite("Prendre un verre", "Sortir un verre du placard","../../resources/PrendreUnVerre.png");
    a1.add(e1);
    a1.insert(e2);

    Etape e3 = new Etape ("Prendre le verre","../../resources/remplirVerreDEau.jpg",0);
    Etape e4 = new Etape ("Placer le verre sous le robinet","../../resources/remplirVerreDEau.jpg",1);
    Etape e5 = new Etape ("Ouvrir le robinet","../../resources/remplirVerreDEau.jpg",2);
    Etape e6 = new Etape ("Quand le verre est rempli au niveau souhaite, fermer le robinet","../../resources/remplirVerreDEau.jpg",3);

    Activite a2 = new Activite("Se servir un verre d'eau","Remplir un verre d'eau", "../../resources/remplirVerreDEau.jpg");
    a2.add(e3);
    a2.add(e4);
    a2.add(e5);
    a2.add(e6);

    Categorie c1 = new Categorie("Medication", "Decrit plusieurs activites relatives à la medication", "../../resources/Medication.jpg");
    c1.add(a1);
    c1.add(a2);
    this.categories.add(c1);
  }
}
