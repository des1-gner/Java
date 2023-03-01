 
import java.util.Scanner;
  

public class SumOfDigits{
  
   public static int sumDigits(int n) {
     int num = n;
     int sum = 0;
     while (num != 0) {
       int digit = num % 10;
       sum += digit;
       num = num / 10;
     }
     return sum;
   }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num  = input.nextInt();

    System.out.println("The sum of digits for " + num +
      " is " + sumDigits(num));
  }
}