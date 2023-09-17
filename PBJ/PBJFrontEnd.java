/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 25 2021
 * CSCE 145
 * PB&J
 */
import java.util.Scanner;

public class PBJFrontEnd {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// instance variables
		boolean running = true;
		PBJSandwich PBJ = new PBJSandwich( null, null, null, null);
		PBJSandwich PBJ2 = new PBJSandwich( null, null, null, null);
		System.out.println("Welcome to the PBJ Sandwich Maker");
		
		//PBJ #1
		
		//PBJ#1 top slice
		while (running) {
		System.out.println("to begin enter the values for the PBJ's top slice of bread (Name,Calories,Brand)");
		String PBJTS = keyboard.nextLine();
		String arr[] = PBJTS.split(",");
		String PBJTSN = (arr[0]);
		int PBJTSC = Integer.parseInt(arr[1]);
		String PBJTSB = (arr[2]);
		PBJ.setTopSlice(PBJTSN, PBJTSC, PBJTSB);
		
		//PBJ#1 Peanut Butter 
		System.out.println("enter the values for the PBJ's Peanut Butter (Name,Calories,Whether it is crunchy(yes or no)");
		String PBJPB = keyboard.nextLine();
		String PB1[] = PBJPB.split(",");
		String PBJPBN = (PB1[0]);
		int PBJPBC = Integer.parseInt(PB1[1]);
		boolean PBJPBIC = (PB1[2]) != null;
		PBJ.setPeanutButter(PBJPBN, PBJPBC, PBJPBIC);
		
		//PBJ#1 Jelly
		System.out.println("enter the values for the PBJ's Jelly (Name,Calories,Fruit Type");
		String PBJJ = keyboard.nextLine();
		String J1[] = PBJJ.split(",");
		String PBJJN = (J1[0]);
		int PBJJC = Integer.parseInt(J1[1]);
		String PBJJFT = (J1[2]);
		PBJ.setJelly(PBJJN, PBJJC, PBJJFT);
		
		//PBJ#1 Bottom Slice
		System.out.println("enter the values for the PBJ's Bottom Slice of bread (Name,Calories,Brand)");
		String PBJBS = keyboard.nextLine();
		String BS1[] = PBJBS.split(",");
		String PBJBSN = (BS1[0]);
		int PBJBSC = Integer.parseInt(BS1[1]);
		String PBJBSB = (BS1[2]);
		PBJ.setTopSlice(PBJBSN, PBJBSC, PBJBSB);
		
		
		System.out.println("Time to make your second sandwich");
		//PBJ #2
		//PBJ#2 top slice
		System.out.println("to begin enter the values for the PBJ's top slice of bread (Name,Calories,Brand)");
		String PBJTS2 = keyboard.nextLine();
		String arr2[] = PBJTS2.split(",");
		String PBJTSN2 = (arr2[0]);
		int PBJTSC2 = Integer.parseInt(arr2[1]);
		String PBJTSB2 = (arr2[2]);
		PBJ2.setTopSlice(PBJTSN2, PBJTSC2, PBJTSB2);
				
		//PBJ#2 Peanut Butter 
		System.out.println("enter the values for the PBJ's Peanut Butter (Name,Calories,Whether it is crunchy(yes or no)");
		String PBJPB2 = keyboard.nextLine();
		String PB2[] = PBJPB2.split(",");
		String PBJPBN2 = (PB2[0]);
		int PBJPBC2 = Integer.parseInt(PB2[1]);
		boolean PBJPBIC2 = (PB2[2]) != null;
		PBJ2.setPeanutButter(PBJPBN2, PBJPBC2, PBJPBIC2);
				
		//PBJ#2 Jelly
		System.out.println("enter the values for the PBJ's Jelly (Name,Calories,Fruit Type");
		String PBJJ2 = keyboard.nextLine();
		String J2[] = PBJJ2.split(",");
		String PBJJN2 = (J2[0]);
		int PBJJC2 = Integer.parseInt(J2[1]);
		String PBJJFT2 = (J2[2]);
		PBJ2.setJelly(PBJJN2, PBJJC2, PBJJFT2);
				
		//PBJ#2 Bottom Slice
		System.out.println("enter the values for the PBJ's Bottom Slice of bread (Name,Calories,Brand)");
		String PBJBS2 = keyboard.nextLine();
		String BS2[] = PBJBS2.split(",");
		String PBJBSN2 = (BS2[0]);
		int PBJBSC2 = Integer.parseInt(BS2[1]);
		String PBJBSB2 = (BS2[2]);
		PBJ2.setTopSlice(PBJBSN2, PBJBSC2, PBJBSB2);
		
		//displaying Sandwiches
		System.out.println("Displaying your first PBJ");
		System.out.print("Your first PBJ's top slice of bread has values of: " +PBJ.getTopSlice());
		System.out.print("\n Your first PBJ's Jelly has values of: " +PBJ.getJelly());
		System.out.print("\n Your first PBJ's Peanut Butter has values of: " +PBJ.getPeanutButter());
		System.out.print("\n Your first PBJ's Bottom Slice of bread has values of: "+PBJ.getBottomSlice()+"\n");
		System.out.println("\n Displaying your second PBJ");
		System.out.print("\n Your second PBJ's top slice of bread has values of: " +PBJ2.getTopSlice());
		System.out.print("\n Your second PBJ's Jelly has values of: " +PBJ2.getJelly());
		System.out.print("\n Your second PBJ's Peanut Butter has values of: " +PBJ2.getPeanutButter());
		System.out.print("\n Your second PBJ's Bottom Slice of bread has values of: "+PBJ2.getBottomSlice());
		System.out.println("\n Checking if your sandwiches share the same values");
		System.out.println("\n it is " + PBJ.equals(PBJ2)+ " that " +PBJ+ " and "+PBJ2+ " share the same properties");
		System.out.println("\n would you like to run the program again? (yes) or (no)");
		String run = keyboard.next();
		if (run.equalsIgnoreCase("no")){
			running = false;
		}
		
		
		
	}
}
}


