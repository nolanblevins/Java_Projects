/*
 * Nolan Blevins
 * CSCE 145 Sec 17
 * September 21 2021
 * Six Sided Dice roller with frequency calculations
 */
import java.util.Scanner;
import java.util.Random;
public class SixSidedDiceRoll {
	public static void main(String args[]) {
Scanner keyboard = new Scanner(System.in);
Random rand = new Random();
System.out.println("enter the number of times a six-sided die should be rolled");

int DiceRoll = keyboard.nextInt(); //input from user
//variables
int dice = 0 ;
int D = 0;
int frequencyofside[] = new int[6]; //determines frequency of sides

if(DiceRoll >= 1) { //ensures that the value is at least 1
	while (dice <= DiceRoll) {
	D = 1 + rand.nextInt(6);
	System.out.println(+D);
	
	if(D==1) {
		++frequencyofside[0]; // side 1
	}
	else if(D==2) {
		++frequencyofside[1]; // side 2
	}
	else if(D==3) {
		++frequencyofside[2]; // side 3
	}
	else if(D==4) {
		++frequencyofside[3]; // side 4
	}
	else if(D==5) {
		++frequencyofside[4]; // side 5
	}
	else if(D==6) {
		++frequencyofside[5]; //side 6
	}
	dice++;
}// end of dice roll while statement
}// end of if statement which ensures that the dice roll value is positive
else {
	System.out.println("invalid input");
}// end of invalid input else statement
for(int i = 1; i <= 6; i++) {
	System.out.println("side #" + i + " "+ frequencyofside [i-1]);
}// end of for used to print the frequency
}// end of pub stat void
}// end of main class