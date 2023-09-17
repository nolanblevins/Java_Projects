/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 25 2021
 * CSCE 145
 * Moving Circle
 */
/*
 * Written by JJ Shepherd
 */
import java.util.Scanner;
public class CircleSimulator {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("---------------------------\nWelcome to the Circle Collision Simulator!\n---------------------------");
		boolean quit = false;
		while(!quit)
		{
			System.out.println("Enter the data for Circle01. X, Y, Diameter, Velocity X, and Velocity Y");
			MovingCircle c1 = new MovingCircle(keyboard.nextDouble(),
									keyboard.nextDouble(),
									keyboard.nextDouble(),
									keyboard.nextDouble(),
									keyboard.nextDouble());
			System.out.println("Enter the data for Circle02. X, Y, Diameter, Velocity X, and Velocity Y");
			MovingCircle c2 = new MovingCircle(keyboard.nextDouble(),
									keyboard.nextDouble(),
									keyboard.nextDouble(),
									keyboard.nextDouble(),
									keyboard.nextDouble());
			System.out.println(c1+"\n"+c2+"\n");
			for(int i=0;i<100;i++)
			{
				c1.move();
				c2.move();
				System.out.println(c1+"\n"+c2+"\n");
				if(c1.isColliding(c2))
				{
					System.out.println("Collision!\n");
					break;
				}
			}
			System.out.println("Would you like to run the simulation again? True or False?");
			quit = !keyboard.nextBoolean();
		}
		System.out.println("Goodbye!");
	}
}