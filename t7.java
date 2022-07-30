import java.util.Scanner;
public class t7 {
     public static void main(String [] args)
    {   
      Scanner s = new Scanner(System.in);
      String sname ="null"; int num=0;int highestScore=0;
      System.out.println(" Enter Total number of students");
      int Num_of_students=s.nextInt();
      for(int i=1;i<=Num_of_students;i++)
      {
          
          System.out.println("Enter name of "+ i +" student " );
           String name=s.next();
          System.out.println("Enter number of "+ i +" student " );
          num=s.nextInt();
          if(num>highestScore)
          {
              highestScore=num;
              sname=name;
          }
          
      }
      System.out.println("name of student :" +sname+ " with Highest Number"+highestScore);
    }
}
