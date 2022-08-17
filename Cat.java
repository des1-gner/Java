/** subclass of Pet class. It can directly use
  * public, protected variables and methods*/

public class Cat extends Pet{
  //specific variable
  private String hair;
  
  //constructor
  public Cat(){
    super();
   
  }
  public Cat(String name, int age){
    super(name, age);
  }
  public Cat(String name, int age, String hair){
    super(name, age);
    this.hair = hair; //assignment for the specific variable
  }
  //get and set for specific variable
  public String getHair(){
    return hair;
  }
  public void setHair(String hair){
    this.hair = hair;
  }
  public String toString(){
    return super.toString() + "\nHair: " + hair;
  }
}