/*ConditionalOperator.java
 * use when simple if-else
 */
import java.util.Scanner;

public class ConditinalOperator{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //prompt
    while(true){
     System.out.println("Enter an integer or 0 to exit");
     int num = input.nextInt();
     if(num == 0)
       break;
     System.out.println( num%2==0? " " + num + " is even " : num + " is odd ");
    }
  }//main
}//class