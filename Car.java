package com.mycompany.car;

public class Car
{
  private String make; // instance variables
  private String model;
  private int year;
  
  public Car() // default constructor
  {
  /*   make ="Holden";
     model="commodore";
     year=2010; */
      
  }    
    public Car(String make,String model,int year)// parameterized constructor
     {
      this.make = make; 
      this.model=model;
      this.year = year;
     }
   public void setmake(String make)
     {
       this.make =make;
     }
    public String getmake()
      {
        return make;
      }
    
    public String toString()
      {
        return " make of the car : " +make+ "\n"+
                "Model of the car: " +model+ "\n"+
                "Year of the car : "+year+ "\n"+
                "__________________________";
      }
    
    
}