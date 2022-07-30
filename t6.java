import java.util.*;
public class t6{
   public static void main(String[]args){
    double amount = 0.0, rate = 0.0, value=0.0;
    int years =0;
    Scanner scan = new Scanner(System.in);
   System.out.println("Enter amount to invest:");
   amount = scan.nextDouble();
      System.out.println("Enter interest rate: " );
      rate =  scan.nextDouble();
      System.out.println("Enter number of years:");
      years = scan.nextInt();
      value = amount;
      int i = 1;
   while( i<= years){
    value *= 1+rate/100; // same as value=value+(rate/100)
    System.out.printf("The value after %3d years is", i);
    System.out.printf("%6.2f\n", value);
    i++;

   }
   }}
