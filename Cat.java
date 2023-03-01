/**
 * Class Cat which is a subclass of Pet class
 * program Cat.java in folder Pet
 */
public class Cat extends Pet {
    // it has already name and age
    // specific variable
    private String hair;

    // constructors
    public Cat() {
        System.out.println("Subclass constructor is called");
    }

    public Cat(String name, int age) {
        // reuse constructor of superclass Pet
        super(name, age);
        System.out.println("Subclass constructor is called");
    }

    // constructor with specific variable
    public Cat(String name, int age, String hair) {
        // reuse constructor of Pet
        super(name, age);
        // add assignment to specific variable
        this.hair = hair;
        System.out.println("Subclass constructor is called");
    }

    // get method for a specific variable, two get methods are
    // already here
    public String getHair() {
        return hair;
    }

    // set method for a specific variable, two others are already
    // here
    public void setHair(String hair) {
        this.hair = hair;
    }

    @Override
    public void speak(String sound) {
        System.out.println("My pet " + name + " says " + sound);
    }

    // custom method are inherited
    @Override
    public String toString() {
        return super.toString() + ". Hair " + hair;
    }
}
