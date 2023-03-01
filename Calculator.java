import java.util.*;

public class Calculator{

  public static void main (String[] args){
    int num1=-1, num2=-1, result = 0;
    boolean continueInput = true;
     Scanner input = new Scanner(System.in);
   System.out.println("This program displays result of arithmetic operations on positive integer numbers."+
                        "\nEnter -1 to exit");
   
   while(continueInput){
      System.out.println("Enter a first number or -1 to exit");
       num1 = input.nextInt();
     if(num1!=-1){
       System.out.println("Enter a second number");
       num2 = input.nextInt();
       System.out.println("Enter an operator");
       String opStr = input.next();
       char op = opStr.charAt(0);
    switch (op) {
      case '+': 
        result = num1 + num2;
      break;
      case '-':
        result = num1 - num2;
      break;
      case '*':
        result = num1  * num2;
      break;
      case '/':
       if(num2!=0)
        result = num1/num2;
       else
        System.out.println("Cannot divide by zero");
      break;
      default:
        System.out.println("Wrong operator");
        continueInput= true;
      break;
     }
      if(num2!=0)
      System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }
   else {
     System.out.println("Good bye!"); 
     continueInput = false;
    }
   }
  }
}
