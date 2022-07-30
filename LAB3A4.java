/* Online Java Compiler and Editor */
import java.util.Scanner;
public class LAB3A4{

     public static void main(String []args){
Scanner test = new Scanner(System.in);
   System.out.println("Enter Username");
   String username = test.next();
    System.out.println("Enter Password");
   String password = test.next();
   if (username.equals("Rose")&& password.equals("Red"))
   {
     System.out.println("Welcome to the shop and your access is granted"); 
   }
   if(username.equals("Violet")&& password.equals("Blue"))
     System.out.println("Welcome to the shop and your access is granted");

   if ((username.equals("Rose")) && !(password.equals("Red")))
     System.out.println("sorry Access Denied");

   if ((username.equals("Violet")) && !(password.equals("Blue")))
     System.out.println("sorry Access Denied");
        
    }
    
}