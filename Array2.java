
public class Array2 
{
	public static void main(String[] args) 
	{
		// creating a String array with 6 items 
		String [] movies = {"The Godfather","Titanic","John Wick","Star Wars","Deadpool","Braveheart"};
		
		// displaying the items of the array using a for loop
		for(int i = 0;i < movies.length;i++)
		{
			System.out.println("Movie: " + movies[i]);
		}
		
		System.out.println("Total Movies: " + movies.length);
	}
}
