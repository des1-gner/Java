public class RunCar {
    
    public static void main(String [] args)
    {
        // create instance or object of Car class with default constructor
        Car c1 = new Car();
        System.out.println(c1.toString());
        //create instance or object of Car class with parameterized constructor
        
        Car c2 = new Car("Mitsibushi", " Lancer" , 2017);
        System.out.println(c2);
        // if you want to change age of Car 2 the use setAge method

        c2.setYear(2006);
        System.out.println(c2);
         // if you want to print just age of Car 2 then use getAge method
        System.out.println(" age of Car 2 is " +c2.getYear());
    }
    
}
    
    