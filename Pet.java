/**
 * Class Pet which will be superclass for Dog and Cat
 * program Pet.java, folder Pet1
 */

public class Pet {
  /*
   * instance variables
   * with protected access to be inherited by subclasses
   */
  protected String name;
  protected String address;
  protected int phone;
  protected String email;
  protected boolean male;

  /* constructors */
  public Pet() {
    System.out.println("Superclass constructor is called");
  }

  public Pet(String name, String address, int phone, String email, boolean male) {
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.male = male;
    System.out.println("Superclass constructor is called");
  }

  /* get or accessor methods */
  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public int getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }

  public boolean getMale() {
    return male;
  }

  /* set or mutator methods */
  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setMale(boolean male) {
    this.male = male;
  }

  @Override
  public String toString() {
    return name + " lives at " + address + " has the phone number; " + phone + "email of " + email + "and is " + male
        + "to the question of being male";
  }

  // custom methods
  public void speak(String sound) {
    System.out.println(sound);
  }

  public void eat(String food) {
    System.out.println("My pet loves " + food);
  }
}
