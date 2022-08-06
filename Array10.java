
public class Array10 
{
	public static void main(String[] args) 
	{
		// creating 4 integer variables that will be used in the while loops to display each item from the arrays.
		int i = 0, j = 0, k = 0, m = 0;    
		
		// creating integer array with 8 items
		int [] numbers  = {1, 2, 5, 8, 11, 14, 18, 23};
		
		// creating double array with 6 items
		double [] rates = new double[6];
		rates[0] = 4.3;
		rates[1] = 6.5;
		rates[2] = 2.8;
		rates[3] = 5.4;
		rates[4] = 3.9;
		rates[5] = 9.2;
		
		// creating char array with 8 items
		char [] characters  = new char[8];
		characters[0] = '&';
		characters[1] = '*';
		characters[2] = '4';
		characters[3] = 'A';
		characters[4] = '@';
		characters[5] = 'Q';
		characters[6] = '8';
		characters[7] = '?';
		
		// creating String array with 6 items
		String [] animals = {"Lion","Tiger","Zebra","Elephant", "Giraffe","Panda"};
		
		// using while loop to display items of the integer array
		while(i < numbers.length)
		{
			System.out.println("Number: " + numbers[i]);
			i++;
		}
		
		System.out.println("Total numbers: " + numbers.length);
		System.out.println("--------------------------------------------");
		
		// using while loop to display items of the double array
		while(j < rates.length)
		{
			System.out.println("Rate: " + rates[j]);
			j++;
		}
		
		System.out.println("Total Rates: " + rates.length);
		System.out.println("--------------------------------------------");
		
		// using while loop to display items of the char array
		while(k < characters.length)
		{
			System.out.println("Character: " + characters[k]);
			k++;
		}
		
		System.out.println("Total characters: " + characters.length);
		System.out.println("--------------------------------------------");
		
		// using while loop to display items of the String array
		while(m < animals.length)
		{
			System.out.println("Animal: " + animals[m]);
			m++;
		}
		
		System.out.println("Total animals: " + animals.length);
		System.out.println("--------------------------------------------");
	}
}
