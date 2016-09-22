public static MontyHallGame 
{
	public static void main (String[] args) 
	{	
		//welcome message
		welcome();
		game();
		
		
		
	}


	public static void welcome()
	{
		System.out.println("Monty Hall Game.");
		System.out.print("Pick a door number first.");
		System.out.println("You will have a chance to switch, after a door has been revealed.");
	
	}
	
	
	public static void game()
	{
		Scanner keyboard = new Scanner(System.in);
		int car = (int) (Math.random() * 3 + 1);
		
		System.out.print("Please choose a door (1, 2, or 3): ");
		int user_pick = keyboard.nextInt();
		
		int reveal = doorToReveal(car, user_pick);
		
		
		
	}
	
	public static int doorToReveal(int c, int u)
	{
		for (int i; i < 4; i++)
		{
			if (i != c && i != u)
				return i;
		}
			
		
		
		return -1;
	}
	
	
	
	}
