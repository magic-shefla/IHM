package model;
import view.components.ViewEtape;

public class Etape {
  private String instruction;
  private String imgPath;
  private int num;


  public Etape(String i, String p, int n){
    this.instruction = i;
    this.imgPath = p;
    this.num = n;
  }

  public Etape(String i, int n){
    this.instruction = i;
    this.imgPath = "../resources/faireVaiselle.png\n";
    this.num = n;
  }




  public String getInstruction(){
    return this.instruction;
  }

  public String getImgPath(){
    return this.imgPath;
  }

  public void setNum(int val){
    this.num = val;
  }

  public int getNum(){
    return this.num;
  }


  public String toString(){
    String ret = "Etape n°" + this.num +"\n\t> instruction : " + this.instruction +"\n\t > path to image : " + this.imgPath+"\n";
    return ret;
  }

}
