
public class Array4 {

	public static void main(String[] args) 
	{
		// creating a double array that will store 8 numbers with decimal values
		double [] rates = new double[8];
		
		rates[0] = 2.5; // 1st number
		rates[1] = 4.1; // 2nd number
		rates[2] = 3.2; // 3rd number
		rates[3] = 5.7; // 4th number
		rates[4] = 6.3; // 5th number
		rates[5] = 8.4; // 6th number
		rates[6] = 7.8; // 7th number
		rates[7] = 9.6; // 8th number
		
		// displaying the items of the array using a for loop
		for(int i = 0; i < rates.length;i++)
		{
			System.out.println("Rate: " + rates[i]);
		}
		
		System.out.println("Number of items in array: " + rates.length);
	}
}
