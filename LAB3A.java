import java.util.Scanner;
public class LAB3A {
    public static void main(String [] args)
    {
        Scanner b =new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age = b.nextInt();
        if(age <= 18)
        System.out.print("$10");
        if(age >= 18 && age <= 65)
        System.out.print("$20");
        if(age >= 65)
        System.out.print("$15");
        else
        System.out.print("ERROR");
        b.close();  

    }
    
}
