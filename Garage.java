public class Garage{
  public static void main(String[] args){
    //create array of type of Car
    Car[] cars = new Car[15];
    cars[0] = new Car("Honda", "CR-V", 1999, 4.6);
    cars[1] = new Car("Ford", "Falcon", 2009, 4.8);
    cars[2] = new Car("Toyota", "Camri", 2014, 3.6);
    cars[3] = new Car("Toyota", "Corolla", 2013, 2.4);
    
    cars[1].setIsInGarage(true);
    cars[2].setIsInGarage(true);
    //print array elements which are not nulls
    for(int i = 0; i < cars.length; i++){
      if(cars[i]!=null){
        System.out.println(cars[i].toString());
        System.out.println("Is it in garage? " + 
                           cars[i].getIsInGarage());
      }//if
    }//for
  }//main
}//class
        
    
    