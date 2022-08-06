
public class Array8
{
	public static void main(String[] args) 
	{
		double [] rates = new double[4];
		
		rates[0] = 3.8;
		rates[1] = 5.12;
		rates[2] = 7.35;
		rates[3] = 10.2;
		
		System.out.println("1st item: " + rates[0]);
		System.out.println("2nd item: " + rates[1]);
		System.out.println("3rd item: " + rates[2]);
		System.out.println("4th item: " + rates[3]);
		
		System.out.println("---------------------------");
		
		// foreach loop
		for(double d: rates)
		{
			System.out.println("Rate:" + d);
		}

		System.out.println("Number of items in array: " + rates.length);
		
	}

}
