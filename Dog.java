/** subclass of Pet class. It can directly use
  * public, protected variables and methods*/

public class Dog extends Pet{
  //specific variable
  private String breed;
  
  //constructor
  public Dog(){
    super();
    System.out.println("Subclass constructor is called");
  }
  public Dog(String name, int age){
    super(name, age);
  }
  public Dog(String name, int age, String breed){
    super(name, age);
    this.breed = breed; //assignment for the specific variable
  }
  //get and set for specific variable
  public String getBreed(){
    return breed;
  }
  public void setBreed(String breed){
    this.breed = breed;
  }
  public String toString(){
    return super.toString() + "\nBreed: " + breed;
  }
}
  