/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * November 19 2021
 * CSCE 145
 * hollow diamond maker
 */
/*
 
* Written by JJ Shepherd
 */
import java.util.Scanner;
public class DiamondDrawer {
	public static void main(String[]args)
	{
		System.out.println("Welcome to the diamond drawer!");
		Scanner keyboard = new Scanner(System.in);
		boolean quit = false;
		while(!quit)
		{
			//Prompt the user
			System.out.println("Enter 1. To Draw a Diamond\nEnter 2. To Quit");
			int input = keyboard.nextInt();
			keyboard.nextLine();
			if(input == 2)
				break;
			System.out.println("Enter the diamond's width. This value must be an odd number that is at least 3 or greater.");
			//Get the inputs
			int width = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println("Enter the horizontal spacing");
			int hSpace = keyboard.nextInt();
			keyboard.nextLine();
			//Draw the diamond			
			Shape d = new HollowDiamond(hSpace,width);
			System.out.println("Drawing the diamond with width: "+((HollowDiamond)d).getWidth()+" and horizontal spacing: "+d.getHSpace());
			d.drawShape();
		}
		System.out.println("Goodbye!");
	}
}