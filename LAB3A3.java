import java.util.Scanner;
public class LAB3A3 {
    public static void main(String [] args)
    {
        Scanner d = new Scanner(System.in);
        int temp;
        System.out.println("Temp: ");
        temp = d.nextInt();
        if(temp == 20)
        System.out.print("t-shirt");
        if(temp == 15)
        System.out.print("long sleeves");
        if(temp == 10)
        System.out.print("jumper");
        if(temp == 5)
        System.out.print("bed");
        d.close(); 
    }
    
}
