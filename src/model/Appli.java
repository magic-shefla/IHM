package model;
import java.util.ArrayList;

public class Appli{
  private ArrayList<Categorie> categories;



  public Appli(){
    this.categories = new ArrayList<Categorie>();
    this.fill(4,3,10);

  }

  public ArrayList<Categorie> getCategories() {
    return categories;
  }

  public void fill(int nbCat, int nbAct, int nbEta){
    for (int i = 0 ; i < nbCat ; i++){
      Categorie cat = new Categorie("Cat " + i, "desc");

      for (int j = 0 ; j < nbAct ; j++){
        Activite act = new Activite("Act " + j, "desc");

        for (int k = 0 ; k < nbEta ; k++){
          act.add(new Etape("Etape " + k,"./", k));
        }
        cat.add(act);
      }
      this.categories.add(cat);
    }
  }
}
