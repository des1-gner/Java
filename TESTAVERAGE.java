// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class TESTAVERAGE {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
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