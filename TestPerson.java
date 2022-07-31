public class TestPerson {
    
    public static void main(String [] args)
    {
        // create instance or object of person class with default constructor
        Person p1 = new Person();
        System.out.println(p1.toString());
        //create instance or object of person class with parameterized constructor
        
        Person p2 = new Person("James", " Doctor" , 32 , "Melbourne");
        System.out.println(p2);
        // if you want to change age of person 2 the use setAge method

        p2.setAge(42);
        System.out.println(p2);
         // if you want to print just age of person 2 then use getAge method
        System.out.println(" age of person 2 is " +p2.getAge());
    }
    
}
    
    