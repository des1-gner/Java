public class RunPets{
  public static void main(String[] args){
    //instance of Pet class
    Pet pet = new Pet("Tina", 2);
    pet.speak("Hello");
    pet.eat("sausage");
    //instance of subclass Dog
    Dog dog1 = new Dog("Korr", 5);
    dog1.speak("Woof");
    dog1.eat("meat");
    System.out.println(dog1.getName());
    dog1.setBreed("cross");
    System.out.println(dog1.toString());
    
    //another instance of Dog declared as Pet
    Pet dog2 = new Dog("Charmer", 6, "buldog");
    System.out.println(dog2.toString());
    
    Dog dog3 = new Dog();
    System.out.println(dog3.toString());
    
    Cat cat1 = new Cat("Puss", 3, "long");
    cat1.speak("Meow");
     System.out.println(cat1.toString());
    
  }
}