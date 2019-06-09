import model.*;
public class Test{
  public static void main(String[] args){
    Etape e1 = new Etape("test1","./",1);
    Etape e2 = new Etape("test2","./",2);
    Etape e3 = new Etape("test3","./",3);
    Etape e4 = new Etape("test4","./",4);
    Etape e5 = new Etape("act22","./",2);
    Etape e6 = new Etape("act21","./",1);
    Etape e7 = new Etape("act23","./",3);
    Etape e8 = new Etape("act32","./",2);
    Etape e9 = new Etape("act31","./",1);


    System.out.println(e1.toString());

    Activite a1 = new Activite("Act1", "description");
    a1.add(e1);
    a1.add(e2);
    a1.add(e4);
    a1.insert(e3);
    Activite a2 = new Activite("Act2", "description");
    a2.add(e5);
    a2.add(e6);
    a2.add(e7);
    Activite a3 = new Activite("Act3", "description");
    a3.add(e8);
    a3.add(e9);

    System.out.println(a1.toString());

    Categorie c1 = new Categorie("Cat1" , "description");
    c1.add(a1);
    c1.add(a2);
    c1.add(a3);


    System.out.println(c1.toString());
  }
}
