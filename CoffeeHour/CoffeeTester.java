
/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 21 2021
 * CSCE 145
 * Coffee Tester
 */



import java.util.Scanner;
public class CoffeeTester {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Coffee coffee1;
		Coffee coffee2;
		coffee1 = new Coffee(); // initializing coffee 1
		coffee2 = new Coffee(); // initializing coffee 2
		boolean running = true;
		while (running) {
		System.out.println("enter the name of your first cup of coffee:");
		String coffee01 = keyboard.next(); // stores coffee 1
		coffee1.setName(coffee01); //sets coffee 1 name
		System.out.println("enter the caffeine content of your first cup of coffee:");
		double caffeine1 = keyboard.nextDouble(); // stores coffee 1 caffeine
		coffee1.setCaffeine(caffeine1); // sets coffee 1 caffeine
		System.out.println("enter the name of your second cup of coffee:");
		String coffee02 =keyboard.next(); //stores coffee 2
		coffee2.setName(coffee02); // sets coffee 2 name
		System.out.println("enter the caffeine content of your second cup of coffee:");
		double caffeine2 = keyboard.nextDouble(); // stores coffee 1 caffeine
		coffee2.setCaffeine(caffeine2); // sets coffee 2 caffeine
		System.out.println("your first coffee is a "+ coffee1.getName()+" "+"with a caffeine content of "+ coffee1.getCaffeine());
		System.out.println("your second coffee is a "+ coffee2.getName()+" "+"with a caffeine content of "+ coffee2.getCaffeine());
		double riskyAmount;
		System.out.println("the risky ammount of coffee for you to consume of "+coffee1.getName()+  " is " + coffee1.riskyAmount()+" cups"); // calc risky ammount for coffee 1
		System.out.println("the risky ammount of coffee for you to consume of "+coffee2.getName()+ " is " + coffee2.riskyAmount()+" cups"); // calc risky ammount for coffe 2
		System.out.println("it is " + coffee1.equals(coffee2)+ " that " +coffee1+ " and "+coffee2+ " share the same properties");
		System.out.println("would you like to run the program again? (yes) or (no)");
		String run = keyboard.next();
		if (run.equalsIgnoreCase("no")){
			running = false;
		}
		
			
} // end of while loop
		System.out.println("thanks for using Nolan Blevins Coffee Tester");
} // end of pub stat void	
} // end of coffeetester class
