
public class Array 
{
	public static void main(String[] args) 
	{
		// creating a String array that will store 10 items
		String [] cities = new String[10];
		
		cities[0] = "New York";    // 1st item
		cities[1] = "Los Angeles"; // 2nd item
		cities[2] = "Paris";  	   // 3rd item
		cities[3] = "Madrid"; 	   // 4th item
		cities[4] = "Berlin"; 	   // 5th item
		cities[5] = "London";      // 6th item
		cities[6] = "Athens";      // 7th item
		cities[7] = "Rome";        // 8th item
		cities[8] = "Moscow";      // 9th item
		cities[9] = "Dublin";      // 10th item

		// displaying the items of the array using a for loop
		for(int i = 0;i < cities.length;i++)
		{
			System.out.println("City: " + cities[i]);
		}
		
		System.out.println("Total Cities: " + cities.length);
	}

}
