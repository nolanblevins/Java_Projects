/*
 * Nolan Blevins
 * CSCE 145 sec 17
 * October 10 2021
 * Matrix Addition
 */
import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		int x = 0, y = 0;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("please enter the length of the first matrix");
		int lengthOne = keyboard.nextInt(); //takes length of first matrix
		System.out.println("please enter the width of the first matrix");
		int widthOne = keyboard.nextInt(); // takes width of first matrix
		int matOne[][]= new int [lengthOne][widthOne];
		System.out.println("input the values of the first matrix");
		for (x = 0; x < lengthOne; x++) {
			for (y = 0; y < widthOne; y++) {
				matOne[x][y] = keyboard.nextInt(); // takes all of the values of the first matrix
		}
		}
		
		System.out.println("please enter the length of the second matrix");
		int lengthTwo = keyboard.nextInt(); // takes length of second matrix
		System.out.println("please enter the width of the second matrix");
		int widthTwo = keyboard.nextInt(); // takes width of matrix
		int matTwo[][]= new int [lengthTwo][widthTwo];
		System.out.println("input the values of the second matrix");
		for (x = 0; x < lengthTwo; x++) {
			for (y = 0; y < widthTwo; y++) {
				matTwo[x][y] = keyboard.nextInt(); // takes elements of second matrix
		}
		}
		int f = 0, g = 0;
		int matThree[][] = new int [x][y]; // intializing sum matrix
		for (x = 0; x < lengthOne || x < lengthTwo; x++) {
			for(y = 0; y < widthOne || y < widthTwo; y++) {
				matThree[f][g] = matOne[x][y] + matTwo[x][y]; // summing matrices
			}
		}
		System.out.println("the sum of the matrices is:  ");
		for ( x = 0; x < lengthOne || x < lengthTwo; x++) {

			for (y = 0; y < widthOne || y < widthTwo; y++);
				System.out.print(matThree[f][g]+ "\t"); // printing final matrix
			System.out.println();
}		
}// end of pub stat void
}// end of main class
