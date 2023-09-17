// Nolan Blevins
// February 1st 2022
// CSCE 146 HW 00 Vector Math

import java.util.Scanner; // scanner import
public class VectorMath {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); // scanner initialization
		
		System.out.println("Welcome to Nolans Vector Math Application");
		
		boolean quit = true;
		while(quit) // overall while loop
		{
		System.out.println("Would you like to add two vectors (1) subtract two vectors (2) find the magnitude of a vector (3) or quit (0)");
		int choice = keyboard.nextInt();
		keyboard.nextLine();
		
		boolean running = true;
		while (running) // inside while loop
		{
		if (choice == 1) // adding vectors choice
		{
		System.out.println("The size of your Vectors must be the same size and greater than 1, please enter the size of your first vector");
		int vectorASize = keyboard.nextInt();
		keyboard.nextLine();

		System.out.println("The size of your Vectors must be the same size and greater than 1, please enter the size of your second vector");
		int vectorBSize = keyboard.nextInt();
		keyboard.nextLine();

		
		if (vectorASize == vectorBSize && vectorBSize > 0)
		{
		// Initializing arrays for vector addition
		double vectA[] = new double[vectorASize];
		double vectB[] = new double[vectorBSize];
		double vectSum[] = new double[vectorASize];
		
		// populating vector 1
		System.out.println("Enter "+vectorASize+" numbers to fill your first vector");
		for(int i = 0; i < vectA.length; i++)
		{
			System.out.println("Enter Value "+i);
			vectA[i] = keyboard.nextInt();
			keyboard.nextLine();

		}
		
		// populating vector 2
		System.out.println("Enter "+vectorBSize+" numbers to fill your second vector");
		for(int i = 0; i < vectB.length; i++)
		{
			System.out.println("Enter Value "+i);
			vectB[i] = keyboard.nextInt();
			keyboard.nextLine();

		}
		// adding two vectors
		for (int i = 0; i < vectSum.length; i++)
		{
			vectSum[i] = vectA[i]+vectB[i];
		}
		System.out.println("Your summed vector:");
		for (int i = 0; i < vectSum.length; i++)
		{
			System.out.println(vectSum[i]);
		}
		running = false;
		} // end of add calc
		
		else // else statement if user enters a number less than 1 or two different sized vectors
		{
			System.out.println("Sorry your vectors have to be the same size and greater than than or equal to 1");
			running = false;
		}
		
		} // end of choice 1
		
		// Subtracting Vectors
		if (choice == 2) // subtracting vectors choice
		{
			System.out.println("The size of your Vectors must be the same size and greater than 1, please enter the size of your first vector");
			int vectorASize = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println("The size of your Vectors must be the same size and greater than 1, please enter the size of your second vector");
			int vectorBSize = keyboard.nextInt();
			keyboard.nextLine();

			
			if (vectorASize == vectorBSize && vectorBSize > 0)
			{
			// Initializing arrays for vector addition
			double vectA[] = new double[vectorASize];
			double vectB[] = new double[vectorBSize];
			double vectDiff[] = new double[vectorASize];
			// populating vector 1
			System.out.println("Enter "+vectorASize+" numbers to fill your first vector");
			for(int i = 0; i < vectA.length; i++)
			{
				System.out.println("Enter Value "+i);
				vectA[i] = keyboard.nextInt();
				keyboard.nextLine();

			}
			
			// populating vector 2
			System.out.println("Enter "+vectorBSize+" numbers to fill your second vector");
			for(int i = 0; i < vectB.length; i++)
			{
				System.out.println("Enter Value "+i);
				vectB[i] = keyboard.nextInt();
				keyboard.nextLine();

			}
			// Subtracting two vectors
			for (int i = 0; i < vectDiff.length; i++)
			{
				vectDiff[i] = vectA[i]-vectB[i]; // subtraction
			}
			System.out.println("Your subtracted vector:");
			for (int i = 0; i < vectDiff.length; i++)
			{
				System.out.println(vectDiff[i]);
			}
			running = false; // end of interior while loop
			} // end of subtraction calc
			
			// else statement if user enters a number less than 1 or two different sized vectors
			else
			{
				System.out.println("Sorry your vectors have to be the same size and greater than than or equal to 1");
				running = false;
			}
		} // end of choice 2
		
		if (choice == 3) // magnitude calculation choice
		{
			double sumNsquare = 0;
			System.out.println("Enter the size of your vector, it must be greater than 1");
			int vectorSize = keyboard.nextInt();
			keyboard.nextLine();
			double vector[] = new double[vectorSize];
			if (vectorSize > 0)
			{
			// populating vector
			System.out.println("Enter "+vectorSize+" numbers to fill your vector");
			for(int i = 0; i < vector.length; i++)
			{
				System.out.println("Enter Value "+i);
				vector[i] = keyboard.nextInt();
				keyboard.nextLine();

			}
			// squaring and summing vector
			for(int i = 0; i < vector.length; i++)
			{
				
				double square =+ vector[i] * vector[i]; // squaring vector
				sumNsquare = sumNsquare + square; // adding squared vector to variable to sum
				System.out.println(sumNsquare);
			}
			// sqrt vector
			double rootSnS = Math.sqrt(sumNsquare); // square root of summed and squared vector
			System.out.println("The maginitude of your vector is: "+rootSnS);
			running = false; // end while loop

			} // end of magnitude calc
			else
			{
				System.out.println("Sorry your vector must have a size greater than or equal to 1");
				running = false; // end of interior while loop
			}
		} // end of choice 3
		if (choice == 0) // quit choice
		{
			System.out.println("Thank you for using Nolans Vector Math Application");
			running = false; // end of interior while loop
			quit = false; // end overall while loop
		} // end of choice 0
		else
		{
			System.out.println("Please pick a valid option");
			running = false;
			
		} // end of choice else
		} // end of running while
		} // end of quit
		} // end of main Method
		} // end of class

