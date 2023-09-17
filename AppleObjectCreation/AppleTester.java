
/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 21 2021
 * CSCE 145
 * Apple Lab
 */

public class AppleTester {

	public static void main(String[] args) {
		Apple apple1; // declaring apple 1
		Apple apple2; // declaring apple 2
		Apple apple3; // declaring apple 3
		apple1 = new Apple();
		apple2 = new Apple();
		apple3 = new Apple();
		// setting apple values
		apple1.setType("Granny Smith");
		apple1.setPrice(0.99);
		apple1.setWeight(0.75);
		apple2.setPrice(-200);
		apple2.setType("iPad");
		apple2.setWeight(2.5);
		System.out.println("Welcome to the apple tester");
		System.out.println("Creating a default apple");
		System.out.println("printing the default apple's value");
		System.out.println("Type: " +apple3.getType()+" Weight: "+apple3.getWeight()+" Price: "+apple3.getPrice()); // printing apple 3 values
		System.out.println("\n");
		System.out.println("Creating another apple");
		System.out.println("Setting the new apple's values to the following, valid values");
		System.out.println("Granny Smith, 0.75, 0.99");
		System.out.println("Type: " +apple1.getType()+" Weight: "+apple1.getWeight()+" Price: "+apple1.getPrice()); // printing apple 1 values
		System.out.println("\n");
		System.out.println("Creating another apple");
		System.out.println("Setting the new apple's values to the following, invalid values");
		System.out.println("invalid Values iPad 2.5 -200");
		System.out.println("Printing the newest apple's values which should not have changed from the default values");
		System.out.println("Type: " +apple2.getType()+" Weight: "+apple2.getWeight()+" Price: "+apple2.getPrice()); // printing apple 2 values
		System.out.println("checking if the first and last apple have the same values.");
		System.out.println(apple3.equals(apple2));
	
}
}
