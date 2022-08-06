// importing the java.util package so we can generate random numbers
import java.util.*;

public class Array5
{
	public static void main(String[] args) 
	{
		int [] numbers = new int[10];
		
		// creating an object of the Random class
		Random r = new Random();
		
		
		for(int i = 0; i < numbers.length; i++)
		{
			// assigning a random number between 1 and 50 an array
			numbers[i] = r.nextInt(50) + 1;
			System.out.println("Random Number: " + numbers[i]);
		}
		
		System.out.println("Number of items in array: " + numbers.length);
	}

}
