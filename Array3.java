
public class Array3 {

	public static void main(String[] args) 
	{
		// creating an int array that will store 5 numbers
		int [] numbers = new int[5];
		
		numbers[0] = 2; // 1st number
		numbers[1] = 3; // 2nd number
		numbers[2] = 5; // 3rd number
		numbers[3] = 6; // 4th number
		numbers[4] = 9; // 5th number
		
		// displaying the items of the array using a for loop
		for(int i = 0; i < numbers.length;i++)
		{
			System.out.println("Number: " + numbers[i]);
		}
		
		System.out.println("Number of items in array: " + numbers.length);
	}
}
