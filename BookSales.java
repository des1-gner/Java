import java.util.*;
import java.text.DecimalFormat;

public class BookSales{
  
  static final double RETAINER = 800.00, COMMISSION = 0.2, 
                             WEEKLY_LIMIT = 1000.00, 
                              MONTHLY_LIMIT = 5000.00, BONUS = 300.00;
  static DecimalFormat dec = new DecimalFormat("00.00");
  
  public static void getWeeklySales( double arr[]) {
    
    Scanner input = new Scanner (System.in);
    System.out.println("Enter weekly sales:");
    
    for(int i = 0; i < 4; i++){
       System.out.print("Week " + (i+1) + ": ");
       arr[i] = input.nextDouble();
        System.out.println();
    }
    
    input.close();
  }
  
  public static double getMonthlySalary(double arr[]) {
    
    double weeklySalary = 0.0;
    double monthlySalary = 0.0;
    double monthlySale = 0.0;
    
    for(int i = 0; i < 4; i++){
      
      monthlySale += arr[i];
      
      weeklySalary = RETAINER;
      if(arr[i] > WEEKLY_LIMIT)
        weeklySalary += COMMISSION*(arr[i] - WEEKLY_LIMIT);
      
      monthlySalary += weeklySalary; 
    }
    
    if(monthlySale > MONTHLY_LIMIT ){
      System.out.println("Congratulations, you receive a bonus of $300 this month!");
      monthlySalary += BONUS;
    }
    
    return monthlySalary;
    
  }
  
  public static void main(String[] args){
    
    double sales[] = new double[4];
    
    getWeeklySales(sales);
    double salary = getMonthlySalary(sales);
    
    System.out.println("Your salary is $" + dec.format(salary));
    
  }
  
  }
      
    
    
    
    