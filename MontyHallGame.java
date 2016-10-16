import java.util.Scanner;

public class MontyHallGame 
{
/* Created By: Dhruv Govil
   Version#: 1
   Play the classic Monty Hall Game-show game
   Program is well abstracted -- each method performs an independant task to create a functional game


**/
	public static void main (String[] args) 
	{	
		//welcome message
		welcome();
		game();
		
		
		
	}


	public static void welcome() //displays welcome message with instructions for the user
	{
		System.out.println("Monty Hall Game.");
		System.out.println("Pick a door number first.");
		System.out.println("You will have a chance to switch, after a door has been revealed.");
	
	}
	
	
	public static void game() //generates random number for car, and asks user for door input and if they want to switch doors
	{
		Scanner keyboard = new Scanner(System.in);
		int car = (int) (Math.random() * 3 + 1);
		
		System.out.print("Please choose a door (1, 2, or 3): ");
		int user_pick = keyboard.nextInt();
		keyboard.nextLine();
		
		int reveal = doorToReveal(car, user_pick); //pass parameters car and user_pick to the door to reveal function
		
		//testing
		System.out.println("You chose door #: " + user_pick);
		System.out.println("Open door #: " + reveal); //testing
		
		System.out.print("Do you want to switch?: ");
		String answer = keyboard.nextLine();
		
		System.out.println("The user wants to switch " + answer); //testing
		
		if(answer.equals("yes"))
		{ 
			user_pick = doorToReveal(user_pick, reveal);
		}
		if ( car == user_pick)  //prints game results
			System.out.println("YOU WIN! You got a car!");
		else
			System.out.println("Sorry! You Lose, You got a goat.");
	}
	
	public static int doorToReveal(int c, int u) //returns which door to reveal by using logic operators
	{
		int i;
		for (i = 1; i < 4; i++)
		{
			if (i != c && i != u)
				return i;
		}
			
		
		
		return -1;
	}
	
	
	
	

	public static int doorToReveal1(int c, int u) //returns door number to reveal by utilizing logical operators
	{
			int r = (int) (Math.random() * 3 + 1);
			while ( r == c || r == u)
			{
					r = (int) (Math.random() * 3 + 1);
				
				
			}
			return r;
		
		
		
		
		
		
	}
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	