import java.util.Scanner;
import java.util.Random;

public class Lottery {
  public static void main(String[] args) {
    // Generate a lottery
    Random r = new Random();
    //int lottery = (int)(Math.random() * 100);//one digit number is included
    int lottery = r.nextInt(99 -10 + 1) + 10; //two digits number
    System.out.println(lottery);
    // Prompt the user to enter a guess
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (two digits): ");
    int guess = input.nextInt();

    // Check the guess
    if (guess == lottery)
      System.out.println("Exact match: you won $10,000");
    else if (guess % 10 == lottery / 10
        && guess / 10 == lottery % 10)
      System.out.println("Match all digits: you won $3,000");
    else if (guess % 10 == lottery / 10 || guess % 10 == lottery % 10
        || guess / 10 == lottery / 10 || guess / 10 == lottery % 10)
      System.out.println("Match one digit: you win $1,000");
    else
      System.out.println("Sorry, no match");
  }
}
