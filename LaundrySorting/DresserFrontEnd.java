/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * November 4 2021
 * CSCE 145
 * Laundry Sorting
 */

import java.util.Scanner;

public class DresserFrontEnd {
	public static void main(String[] args) {
		
		boolean running = true;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Nolan Blevins Laundry Sorter");
		Clothing Item = new Clothing();
		String Color = new String();
		String Type = new String();
		Dresser Dresser = new Dresser();
		while(running){ // while loop to run app multiple times
		System.out.println("\n");
		System.out.println("Would you like to (add) an item, (remove) an item or (quit)");
		String Choice = keyboard.nextLine();
		if(Choice.equals("add")) // adds item
		{
			System.out.println("Input the garment type and color to add it to the dresser");
			Type = keyboard.nextLine();
			Color = keyboard.nextLine();
			Item.setType(Type);
			Item.setColor(Color);
			Dresser.Add(Item);
			Dresser.Print();
			
		}
		else if(Choice.equals("remove")) // removes item
		{
			System.out.println("Input the garment type and color to remove it from the dresser");
			Type = keyboard.nextLine();
			Color = keyboard.nextLine();
			Item.setType(Type);
			Item.setColor(Color);
			Dresser.Remove(Item);
			Dresser.Print();
		}
		
		else if(Choice.equals("quit")) { // ends app
			running = false;
		}
		
		
		
		}
	}

}
