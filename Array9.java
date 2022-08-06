import java.util.*;

public class Array9 
{
	public static void main(String[] args) 
	{
		int [] numbers = new int[10];
		Scanner sc = new Scanner(System.in);
		
		// using for loop to assign 10 numbers entered by the user to the array
		for(int i = 0;i < numbers.length;i++)
		{
			System.out.print("Enter Number: ");
			numbers[i] = sc.nextInt(); // each number entered by the user is assigned to each index of the array
		}
		
		// using for loop to display all the numbers in the array that were entered by the user
		for(int j = 0; j < numbers.length;j++)
		{
			System.out.println("Number: " + numbers[j]);
		}
		
		// displaying the total number of items in the array
		System.out.println("Total Numbers: " + numbers.length);	
	}
}
