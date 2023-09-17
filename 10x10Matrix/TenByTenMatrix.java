/*
 * Nolan Blevins
 * CSCE 145 sec 17
 * October 10 2021
 * 10x10 Matrix Flip
 */
import java.util.Random;

public class TenByTenMatrix {
	public static void main(String[] args) {
	Random random = new Random();
	int[][] Matrix = new int [10][10]; // setting size of initial matrix
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			Matrix [i][j] = random.nextInt(10); // generates random integers for matrix
			System.out.print(Matrix[i][j]); // prints initial matrix
			System.out.print(" ");
		}
		System.out.print("\n");

	}
	System.out.print("\n");
	System.out.println("the horizontally flipped Matrix:  ");
	System.out.print("\n");

	
	for (int i =0; i < Matrix.length; i++) { // creates size of new flipped matrix
		int k = Matrix.length - 1; // reduces length of the new integer size in order to shift
		for (int j = 0; j < Matrix.length; j++) { // creates size of rows
			int temp = Matrix[i][j];
			Matrix[i][j] = Matrix [i][k];
			Matrix [i][k] = temp;
			k--; // shifts matrix
			System.out.print(Matrix[i][j]); //prints flipped matrix
			System.out.print(" ");
			
		}// enf of for loop 2
	System.out.print("\n");


	} // end of for loop 1

		
		
		
}// end of pub stat void
}// end of main class
