import java.util.Scanner;
public class LAB3A2 {
    public static void main(String [] args)
    {
        Scanner c =new Scanner(System.in);
        int mark;
        System.out.println("Enter your mark: ");
        mark = c.nextInt();
        if(mark >= 80 && mark <= 100)
        System.out.print("HD");
        if(mark >= 70 && mark < 80)
        System.out.print("DI");
        if(mark >= 60 && mark < 70)
        System.out.print("CR");
        if(mark >= 50 && mark < 60)
        System.out.print("P");
        if(mark >= 0 && mark < 50)
        System.out.print("F");
        c.close(); 
    }
    
}
