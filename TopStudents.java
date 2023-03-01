import java.util.*;

public class TopStudents{


	public static double readScore(Scanner input){
		double score=0, temp = 0;
	    do{
		  System.out.print("Enter a student score: ");
		  temp = input.nextDouble();
		}while (temp<0||temp>100);
	      score = temp;
	      return score;
	}

	public static String readName(Scanner input){
		String name=null;
		System.out.print("Enter a student name: ");
		name = input.next();
		return name;
	}

   public static String topName(double topScore, double [] scores, String[] names){
		for(int i = 0; i < scores.length; i++){
			if (topScore == scores[i]){
				return names[i];
			}
		}
		return null;
	}


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the number of students
    System.out.print("Enter the number of students: ");
    int numOfStudents = input.nextInt();

    double [] scores = new double[numOfStudents];
    String [] names = new String[numOfStudents];

    for(int i = 0; i < numOfStudents; i++){
		names[i] = readName(input);
		scores[i]= readScore(input);
	}
	double []unsorted = scores.clone();
	Arrays.sort(scores);

    System.out.println("Top score " + scores[scores.length-1]);

    String topStudent = topName(scores[scores.length-1],  unsorted, names);
    System.out.println("Top student " + topStudent);

}

}
