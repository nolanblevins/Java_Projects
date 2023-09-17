
 /* 
 * Nolan Blevins
 * CSCE 145 Sec 17
 * September 21 2021
 * Rock Paper Scissors game against comp
 */


import java.util.Random;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Welcome to Nolans Rock, Paper Scissors game.");
		boolean playing = true;
		while(playing) {
			int compScore = 0;
			int userScore = 0;
		do {
			System.out.println("Would you like to pick rock, paper or scissors?");
			String userInput = keyboard.nextLine();
			int comp = rand.nextInt(2);
			
			
			if(comp == 0 && userInput.equals("rock")) {
				System.out.println("its a tie");
				System.out.println("the score is " + "Computer Score is " +compScore+ " and " + "your score is " +userScore);
			}// tie rock
			
			if(comp == 1 && userInput.equals("paper")) {
				System.out.println("its a tie");
				System.out.println("the score is " + "Computer Score is " +compScore+ " and " + "your score is " +userScore);
			}// tie paper
			
			if(comp == 2 && userInput.equals("scissors")) {
				System.out.println("its a tie");
				System.out.println("the score is " + "Computer Score is " +compScore+ " and " + "your score is " +userScore);
			}// tie scissors
			
			if(comp == 0 && userInput.equals("paper")) {
				System.out.println("you won paper beats rock");
				userScore = userScore +1;
				System.out.println("the score is " + "Computer Score is " +compScore+ " and " + "your score is " +userScore);
			}// user win paper rock
			
			if(comp == 1 && userInput.equals("rock")) {
				System.out.println("the computer won paper beats rock");
				compScore = compScore +1;
				System.out.println("the score is " + "Computer Score is " +compScore+ " and " + "your score is " +userScore);
			}// computer win paper rock
			
			if(comp == 0 && userInput.equals("scissors")) {
				System.out.println("the computer won rock beats scissors");
				compScore = compScore +1;
				System.out.println("the score is " + "Computer Score is " +compScore+ " and " + "your score is " +userScore);
			}// computer win scissors rock
			
			if(comp == 2 && userInput.equals("rock")) {
				System.out.println("you won rock beats scissors");
				userScore = userScore +1;
				System.out.println("the score is " + "Computer Score is " +compScore+ " and " + "your score is "  +userScore);
			}//user win scissors rock
			
			if(comp == 2 && userInput.equals("paper")) {
				System.out.println("the computer won scissors beats paper");
				compScore = compScore +1;
				System.out.println("the score is " + "Computer Score is " +compScore+ " and " + "your score is " +userScore);
			}// computer win scissors paper
			
			if(comp == 1 && userInput.equals("scissors")) {
				System.out.println("you won scissors beats paper");
				userScore = userScore +1;
				System.out.println("the score is " + "Computer Score is " +compScore+ " and " + "your score is " +userScore);
			}// user win scissors paper
			
			if(compScore == 2) {
				System.out.println("unfortunately the computer won, better luck next time");
			}// computer wins if
			
			if(userScore == 2) {
				System.out.println("Congratulations you beat the computer!!!");
			} //user wins if
			
		} while(userScore < 2 && compScore < 2); // end of do while with game
		System.out.println("would you like to play again? yes or no?");
		String playAgain = keyboard.nextLine();
		if (playAgain.equals ("no")){
			playing = false;
		System.out.println("thanks for playing!");
		
}// end of play again while	
}// end of while containing game
}// end of public static void
}// end of main class
