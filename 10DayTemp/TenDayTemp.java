/*
 * Nolan Blevins
 * CSCE 145 sec 17
 * September 27 2021
 * 10 day temp calc
 */

import java.util.Scanner;
public class TenDayTemp {
	public static void main(String[] args) {
		Scanner keyboard =new Scanner(System.in);
		double [] temp = new double [10]; // array of 10 values
		double totalTemp = 0.0; // initialization of total temp var
		for(int i = 0; i < 10; i++) { // for loop to allow for user input of day temp
			System.out.println("enter the temperature of day " + (i+1));
			temp[i] = keyboard.nextDouble(); // takes the value that the user enters and stores it as a part of the index
		}
		for(int i = 0; i < 10; i++) { // for loop to run 10 times
			totalTemp += temp[i]; // adds of all of the values in the array together to find the total temp
		}
		double avgTemp = (totalTemp/temp.length); // avg temp calc by dividing the total temp by the size of the array
		System.out.println("the average temperature over the 10 day period is " + avgTemp);
		System.out.println("the days with below average temperature are: ");
		
		if(temp [0] < avgTemp) { // checks if first index is below the average temp
			System.out.println("day 1 with: " + temp[0]);
		}
		if(temp [1] < avgTemp) { // checks if second index is below the average temp
			System.out.println("day 2 with: " + temp[1]);
		}
		if(temp [2] < avgTemp) { // checks if third index is below the average temp
			System.out.println("day 3 with: " + temp[2]);
		}
		if(temp [3] < avgTemp) { // checks if fourth index is below the average temp
			System.out.println("day 4 with: " + temp[3]);
		}
		if(temp [4] < avgTemp) { // checks if fifth index is below the average temp
			System.out.println("day 5 with: " + temp[4]);
		}
		if(temp [5] < avgTemp) { // checks if sixth index is below the average temp
			System.out.println("day 6 with: " + temp[5]);
		}
		if(temp [6] < avgTemp) { // checks if seventh index is below the average temp
			System.out.println("day 7 with: " + temp[6]);
		}
		if(temp [7] < avgTemp) { // checks if eighth index is below the average temp
			System.out.println("day 8 with: " + temp[7]);
		}
		if(temp [8] < avgTemp) { // checks if ninth index is below the average temp
			System.out.println("day 9 with: " + temp[8]);
		}
		if(temp [9] < avgTemp) { // checks if tenth index is below the average temp
			System.out.println("day 10 with: " + temp[9]);
		}// end of if statements
		
		
} // end of pub stat void	
} // end of main class