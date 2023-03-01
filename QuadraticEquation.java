import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation{
  
  public static void main(String[] args){
    
    //create an instance of the Scanner
    Scanner keyboard = new Scanner(System.in); 
    //create an instance of DecimalFormat
    //output with 3 digits after decimal point
    
    DecimalFormat dec = new DecimalFormat("#0.000");
    
    //prompt the user to enter coefficients a, b, c
    System.out.println("Enter coefficient a:");
    double a = keyboard.nextDouble();
    
    System.out.println("Enter coefficient b:");
    double b = keyboard.nextDouble();
    
    System.out.println("Enter coefficient c:");
    double c = keyboard.nextDouble();
    
    //calculate discriminant D
    double D = Math.pow(b,2) - 4*a*c;
    
    //evaluate D and calculate the roots
    //using selection statements
    double x1 = 0.0;
    double x2 = 0.0;  
    
    if(D == 0){    
      x1 = (-b)/(2*a);  
      System.out.println("Equation has two identical roots: " +
                         "x1 = x2 = " + dec.format(x1));
    }
    else if(D > 0){     
      x1 = (-b)/(2*a) + Math.sqrt(D)/(2*a);
      x2 = (-b)/(2*a) - Math.sqrt(D)/(2*a);
      System.out.println("Equation has two real roots: " +
                         "x1 = " + dec.format(x1) + ", x2 = " + dec.format(x2));
    }
    else
       System.out.println("Equation has two complex roots\n\n");
      
    
  }//end main()
}//end class