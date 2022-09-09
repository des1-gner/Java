
import java.util.Scanner;

public class Create {

		public void run( ) {
			boolean flag = true;
			Scanner input = new Scanner(System.in);
			while (flag) {
				System.out.println("")
			}
		}
		
		  public void addCharacter() {
			    Scanner input = new Scanner(System.in);
			    System.out.print("Character Name? ");
			    String Name = input.nextStr();
			    input.nextLine();       
			        System.out.print("Character Type? ");
			        String Type = input.nextStr();
			        input.nextLine();       
			        	System.out.print("Character HP? ");
			        	Integer HP = input.nextInt();
			        	input.nextLine();
			        		System.out.print("Character Mana? ");
			        		Integer Mana = input.nextInt();
			        		input.nextLine();
			        			System.out.print("Character Attack? ");
			        			Integer Attack = input.nextInt();
			        			input.nextLine();
			        				System.out.print("Character Speed? ");
			        				Integer Speed = input.nextInt();
			        				input.nextLine();
			        					System.out.print("Character Evil? ");
			        					Boolean Evil = input.nextBoolean();
			        					input.nextLine();
			        			
			        			
			        			Character character = new Character(Name, Type, HP, Mana, Attack, Speed, Evil);
			    
			       characters.add(character);		
		Character character = new Character()
		
	}
}
