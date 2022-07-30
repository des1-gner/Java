public class Runcar {
        public static void main(String [] args)
        {
            // create object or instance of the car class
            
            Car c1=new Car(); // calling default constructor
            System.out.println(c1);
            
            Car c2 = new Car("Toyota","Land cruiser",2020);
            //System.out.println(c2);
            
            c2.setmake("Honda");
            System.out.println(c2);
            
            System.out.println("make of car c1 " +c1.getmake());
            System.out.println("make of car c2 " +c2.getmake());
            
        }
    
}