/**
 * Class Dog which is a subclass of Pet class
 * program Dog.java in folder Pet
 */
public class Dog extends Pet {
  // it has already name and age
  // specific variable
  private String breed;

  // constructors
  public Dog() {
    System.out.println("Subclass constructor is called");
  }

  // constructor with specific variable
  public Dog(String name, String address, int phone, String email, boolean male) {
    // reuse constructor of Pet
    super(name, address, phone, email, male);
    // add assignment to specific variable
    this.breed = breed;
    System.out.println("Subclass constructor is called");
  }

  // get method for a specific variable, two get methods are
  // already here
  public String getBreed() {
    return breed;
  }

  // set method for a specific variable, two others are already
  // here
  public void setBreed(String breed) {
    this.breed = breed;
  }

  @Override
  public void speak(String sound) {
    System.out.println("My pet " + name + " says " + sound);
  }

  // custom method are inherited
  @Override
  public String toString() {
    return super.toString() + ". Breed " + breed;
  }
}
