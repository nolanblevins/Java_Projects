/*
 * Nolan Blevins
 * CSCE 145 sec 17
 * September 27 2021
 * sorting circles
 */


import java.util.Scanner;
public class SortingCircles {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("how many circles would you like to enter?");
		int arraySize = keyboard.nextInt(); // int to take size of array
		double [] radius = new double [arraySize]; // radius of circle array
		double [] circleArea = new double[arraySize]; // array to input areas from multiples radius values
		System.out.println("enter the " +arraySize+ " radius values");
		for (int i = 0 ; i < radius.length; i++) {
			radius[i] = keyboard.nextInt(); // takes radius value
			double area = (radius[i]* radius[i] * 22)/7; // calculates area of circles
			circleArea [i] = area;
		}
		keyboard.nextLine();
		System.out.println("would you like to sort the circle areas in ascending or descending order");
		String AscOrDecs = keyboard.nextLine();
		if(AscOrDecs.equals("ascending")) {
			for (int x = 0; x < circleArea.length-1; x++) {
				for (int j = x + 1; j < circleArea.length; j++) {
					double temp = 0;
					if(circleArea[x] > circleArea[j]) {
						temp = circleArea[x];
						circleArea[x] = circleArea[j];
						circleArea[j] = temp;	
		}
		}
		} // end of ascending bubble sort
			
			
		System.out.println("the areas in ascending order: ");
		for (int z = 0; z < circleArea.length; z++) {
			System.out.println(circleArea[z]);
		}
		}
		else if(AscOrDecs.equals("descending")) {
		
			for (int t = 0; t < circleArea.length-1; t++) {
				for (int g = t + 1; g < circleArea.length; g++) {
					double tmp = 0;
					if(circleArea[t] < circleArea[g]) {
						tmp = circleArea[t];
						circleArea[t] = circleArea[g];
						circleArea[g] = tmp;	
		}
		}
		} // end of descending bubble sort
		System.out.println("the areas in descending order: ");
		for (int l = 0; l < circleArea.length; l++) {
			System.out.println(circleArea[l]);
		}
		}
		else;
		System.out.println("invalid input");
} // end of pub stat void
} // end of main class
