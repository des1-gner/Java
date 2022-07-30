import java.util.*;
public class LAB3B2 {
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
      int count = 0, numOfStudents = 5, mark=0, sum = 0;
     while (mark!=-1) {
          System.out.println("Enter mark for student or -1 to end" + (count + 1));
          mark = scan.nextInt();
          sum += mark;  // accumulate total
        count++;
     }
       System.out.println("The average is: " + (Integer)sum / numOfStudents);
  }
}
