import java.util.IntSummaryStatistics;
import java.util.Scanner;
public class Week2 {  
public static void main(String args[]){  
          Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");  
          String name = in.nextLine();  
          System.out.println("Name is: " + name);             
  
          
    double a;
    double b;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What is the value of a?");
    a = keyboard.nextDouble();
    System.out.println("What is the value of b?");
    b = keyboard.nextDouble();
    keyboard.close();

    double c = Math.sqrt(a * a + b * b);

    System.out.println("c = " + c);

    int course1;
    int course2;
    int course3;
    Scanner gay = new Scanner(System.in);
    System.out.println("Marks for course1?: ");
    course1 = gay.nextInt();
    System.out.println("Marks for course2?: ");
    course2 = gay.nextInt();
    System.out.println("Marks for course3?: ");
    course3 = gay.nextInt();
    gay.close();

    int av = ((course1 + course2 + course3) / 3);

    System.out.println("av = " + av);
  }
}
