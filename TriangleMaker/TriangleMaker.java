/* 
 * Nolan Blevins
 * CSCE 145 Sec 17
 * September 22 2021
 * triangle creator using *
 */
import java.util.Scanner;
public class TriangleMaker {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter a whole number to determine the size of your triangle");
		int tri = keyboard.nextInt();
		if (tri > 0) {
			for (int row = 1; row <= tri; row ++) {
				for(int blanks = (tri - row); blanks > 0; blanks -- ) {
					System.out.print(" ");
					
}// creates blanks on side of triangle
				
			for (int leftside = row; leftside > 0; leftside --) {
				System.out.print("*");
				
}// creates the left side of triangle
			
			for (int rightside = 2; rightside <= row; rightside ++) {
				System.out.print("*");
				
}//creates right side of triangle
			
			System.out.println();
			
}// end of initial for loop
}// end of if statement that determines if value is positive
		
		else {
			System.out.println("that is an invalid value");
			
}//end of else		
}// end of PubStatVoid	
}// End of Main Class
