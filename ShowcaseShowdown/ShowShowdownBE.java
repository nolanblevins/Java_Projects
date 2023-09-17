
/*
 * Nolan Blevins
 * CSCE 146
 * Febuary 9 2022
 * Showcase Showdown
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ShowShowdownBE 
{
	private int finalSum;
	private static final int PRIZELISTAMT = 53;
	private Prizes[] prize = new Prizes[PRIZELISTAMT];
	private Prizes[] randPrizes = new Prizes[5];
	public static final String DELIM  = "\t";
	
	public void addPrize(Prizes aPrize) // method to add prizes to the array, method is called in readPrizeFile method
	{
		if(prize[prize.length - 1] != null)
			return;
		for(int i = 0 ; i < prize.length; i++)
		{
				if(prize[i] == null)
				{
					prize[i] = aPrize;
					break;
				}
		}
	}
	
	public void readPrizeFile() //reads prize file and populates array of prizes
	{
		try 
		{
			
			Scanner fileScanner = new Scanner(new File("./src/prizeList.txt"));
			String fileLine = new String();
			String [] splitLines = fileLine.split(DELIM);
			fileLine = fileScanner.nextLine();
			splitLines = fileLine.split(DELIM);
			String name = splitLines[0];
			int price = Integer.parseInt(splitLines[1]);
			Prizes prize = new Prizes(name, price); 
			this.addPrize(prize);
			// reading file
			while(fileScanner.hasNextLine())
			{
				fileLine = fileScanner.nextLine();
				splitLines = fileLine.split(DELIM);
				
				if(splitLines.length == 2) // checking to make sure the line has delimiter
				{
					
					name = splitLines[0]; // first entry after delimiter
					price = Integer.parseInt(splitLines[1]); // second entry after delimiter
					prize = new Prizes(name, price); // creates prize object with values
					this.addPrize(prize); // adds prize object to array using method
					
					
					//System.out.println(prize);
				}
				else
				{

				}
				
			} 
			fileScanner.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	
	
	}
	public int randPrize() // picks 5 random prizes from array and then sums the prices
	{
		int sum = 0;
		int previousRand = 100;
		for(int i = 0; i < 5; i++)
		{
			Random rand = new Random();
			int randPrize = rand.nextInt(prize.length); // random int from 0-array length
			while(randPrize == previousRand) // checking to make sure random int isnt the same
			{
				randPrize = rand.nextInt(prize.length);
			}
			randPrizes[i] = prize[randPrize];
			previousRand = randPrize;
			String rPrizeNames[] = new String [5];
			rPrizeNames[i] = randPrizes[i].getName();
			System.out.println(rPrizeNames[i]); // prints prize names
			int rPrizePrices[] = new int [5];
			rPrizePrices[i] = randPrizes[i].getPrice();
			sum += rPrizePrices[i]; // sums prize prices
			finalSum = sum; // sum variable that can be used outside of method


		}
		
		return sum;
	}
	
	public boolean userGuess(int aGuess) // boolean method to see if user wins with guess, takes in user guess and compares to sum of prices
	{
		if(aGuess <= finalSum && aGuess >= finalSum - 3500)
		{
			return false;
		}
		return true;
		
	}
	public void printPrizes() // prints prize array
	{
		for(Prizes aPrize : prize)
		{
			if(aPrize == null)
			{
				break;
			}
			System.out.println(aPrize);
		}
	}
}
