/* 
 * Lottery_2 allows the user to play many times
 * It also uses a static method int matchGuess(int rNum) 
 * to find a match
*/

package lottery_2;

import java.util.Random;
import java.util.Scanner;

public class Lottery_2 {


    public static void main(String[] args) {

        // Generate a random number
        Random r = new Random();
        
        int again;
        
        do{
            
            //random number in the range 10 - 99
            // r.nextInt(max - min + 1) + min;  max = 99, min = 10   
            int lottery = r.nextInt(99 - 10 + 1) + 10;
                        
            System.out.println(lottery);
        
            //calling static method
            int prise = matchGuess(lottery);
        
            // Check the guess
            switch(prise){
                case 10000: System.out.println("Exact match: you won $10,000");
                break;
                case 3000:  System.out.println("Match all digits: you won $3,000");
                break;
                case 1000:  System.out.println("Match one digit: you win $1,000");
                break;
                case 0:     System.out.println("Sorry, no match");
            }
            
            Scanner input1 = new Scanner(System.in);
            System.out.print("Enter 1 to guess another lottery or 0 to exit");
            again = input1.nextInt();
            
        }while(again != 0);
       
    }
    
    public static int matchGuess(int rNum){
        
        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();
        
        int reward;
        
        // Check the guess
        if (guess == rNum) {
            reward = 10000;
        } else if (guess % 10 == rNum / 10
                && guess / 10 == rNum % 10) {
            reward = 3000;
        } else if (guess % 10 == rNum / 10 || guess % 10 == rNum % 10
                || guess / 10 == rNum / 10 || guess / 10 == rNum % 10) {
            reward = 1000;
        } else {
            reward = 0;
        }
         return reward;   
    }
}
