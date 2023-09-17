/*
 * Nolan Blevins
 * CSCE 146
 * Febuary 9 2022
 * Showcase Showdown
 */

import java.util.Scanner;
public class ShowShowdownFE {
	private static ShowShowdownBE SSB = new ShowShowdownBE();
	public static void createPrizeList()
	{
		SSB.readPrizeFile();
	}
	public static void main(String[] args) 
	{
		Scanner kB = new Scanner(System.in);
		boolean running = true;
		boolean oRunning = true;
		System.out.println("Welcome to Nolans Showcase Showdown");
	while(oRunning)
	{
		running = true;
		System.out.println("The rules are simple");
		System.out.println("I will give you a list of 5 prizes");
		System.out.println("You must then guess the total price of those items");
		System.out.println("If you are within 3500$ below or equal to the total price, you WIN!!!");
		System.out.println("Otherwise you LOSE!!!");
		while(running) 
		{
		System.out.println("Are you ready to play yes(1) quit(2)");
		int Choices = kB.nextInt();
		kB.nextLine();
		if (Choices == 1)
		{
			createPrizeList(); //creates the array of prizes
			System.out.println("The items are: ");
			SSB.randPrize(); //creates the array of 5 random prizes
			System.out.println("Enter your guess total price for these items: ");
			int uGuess = kB.nextInt(); // takes user input guess
			kB.nextLine(); //helper
			if(SSB.userGuess(uGuess)) // using boolean method to check if the user guessed correctly
			{
				System.out.println("Congratulations you WON!!!");

			}
			else
			{
				System.out.println("Sorry you lost");
			}
			
			System.out.println("Would you like to play again? yes (1) or no (2)");
			int playAgain = kB.nextInt();
			
			if(playAgain == 1)
			{
				running = false;
			}
			if(playAgain == 2)
			{
				running = false;
				oRunning = false;
			}
			
			
			
		}
		
		
		if (Choices == 2)
		{
			running = false;
			oRunning = false;
		}

		}
		
	}
		System.out.println("Thank you for playing Nolans Showcase Showdown");

	}
}
