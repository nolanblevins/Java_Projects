/*
 Nolan Blevins
 
 CSCE 145 Adventure Game

 Escape room adventure game with 3 door start

 September 15 2021
 */
import java.util.Scanner; //scanner
public class AdventureGame { // Main Class
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); // scanner intialization
		System.out.println("you wake up in a dark room with 3 doors ahead of you, your goal is to escape the building. which door would you like to enter, door 1, 2 or 3 ?");
		int firstroom = keyboard.nextInt(); // takes input from user for door entered to progress game
		keyboard.nextLine();
		if (firstroom == 1) { // begginning if statement, determines if user is entering door #1
			System.out.println("after entering door number 1 you are once again in a room this time there is a strange man sitting in the corner.");
			System.out.println("would you like to approach him, yes or no?");
			
			String StrangeManDialouge = keyboard.nextLine(); // takes string as input
			if (StrangeManDialouge.equals ("yes")) { // if string is yes executes if statement
				System.out.println("the strange man looks up at you and hands you a note which states: only one of us is getting out of here alive");
				System.out.println("you look at the strange man as he slowly gets up and pulls a knife from his back pocket, you have two options fight or run?");
				String StrangeManChoice = keyboard.nextLine();
				
				if (StrangeManChoice.equals ("fight")) { // decision between fighting and run option
					System.out.println("as the man is getting up you notice a crowbar on the ground, would you like to use it yes or no?");
					String Crowbar = keyboard.nextLine();
					
					if (Crowbar.equals ("yes")) { // if user decides to use crowbar they are faced with multiple other decisions
						System.out.println("you pick up the crowbar and get ready to swing pick the power level of your swing from 1-100");
						int CrowbarPower = keyboard.nextInt();

						if (CrowbarPower > 75 || CrowbarPower < 40) { //boolean in order to determine if power of players swing is effective
						System.out.println("that wasnt very effective unfortunately the strange man wins the fight");
						System.out.println("not only does he win the fight but he also ends your life, nice try");
						}

						else if(CrowbarPower <= 75 || CrowbarPower >= 40) {  //boolean in order to determine if power of players swing is effective
						System.out.println("Wow perfect hit, below where the strange man was sitting there is a hatch");
						System.out.println("you quickly lift the hatch and slide down a shoot to freedom");
						}
					}
					else if (Crowbar.equals ("no")) // if user decides against using crowbar they fail 
					System.out.println("unfortunately you chose to fight without a weapon, the strange man stabs you 3 times and ends your life");
				}
				else if (StrangeManChoice.equals ("run")) { // if player runs from the fight they lose and program finishes
					System.out.println("you bolt towards the door. While grabbing the handle to leave you feel a piercing pain in your back, the strange man stabbed you in the back");
					System.out.println("Unfortunately this is end, nice try");
				}
				else;
				System.out.println("");
			}
			else if (StrangeManDialouge.equals ("no")) { // if string is no executes if statement
				System.out.println("you stand across the room from the strange man as he slowly lifts his head and peers towards you");
				System.out.println("as he begins to stand up you see a knife in his coat and a hatch beneath him");
				System.out.println("you have two options either go for the knife or the hatch, which do you pick hatch or knife?");
				String HatchOrKnife = keyboard.nextLine();
				
				if (HatchOrKnife.equals("knife")) { // if user doesm't want to approached they are faced with 2 decisions 1 leads to failure
					System.out.println("as you go for the knife the strange man quickly pulls the knife out and stabs you");
					System.out.println("unfortunately he hits some of your vital organs and you bleed out");
				}
				else if (HatchOrKnife.equals ("hatch")) { // decision 2 leads to players escape
					System.out.println("as you make your way to the hatch the strange man quickly lunges at you");
					System.out.println("fortunately he misses falling to the floor and letting you escape through the hatch, you slide down the shoot inside the hatch to freedom");
				}
			}
		}
		else if (firstroom == 2) {  // second part of first if statement, determines if user is entering door #1
			System.out.println("after entering door number 2 you see another set of doors but this time there is only 2, which do you pick 1 or 2");
			int secondroom = keyboard.nextInt();

			if (secondroom == 1) { // decision 1 leads to escape
				System.out.println("Congratulations this door leads to a ladder letting you escape");
			}

			else if (secondroom == 2) { // decision 2 leads to failure
				System.out.println("you open door 2 and and a group of 300 snakes all attack you at once");
				System.out.println("unfortunately you arent able to escape and the snakes end your life");
				
			}
		}
		else if (firstroom == 3) { // final part of first if statement, determines if user is entering door 3
			System.out.println("you enter door 3 and notice that it leads you into an elevator you notice that you are on floor 13");
			System.out.println("you are able to travel from floors 1-12, pick a number 1-12");
			int elevator = keyboard.nextInt();

			if (elevator == 1 || elevator == 12) { // elevator escape solution
				System.out.println("congratulations the floor you chose leads directly to an exit and you escape unharmed");
			}

			else if (elevator >= 2 && elevator <= 11) { //boolean to determine if the right floor is chosen for the elevator if the number is between 2-11 player fails to escape
				System.out.println("you arrive at your floor and begin to hear an alarm");
				System.out.println("the elevator suddenly falls to the bottom of the shaft and explodes");
				System.out.println("the explosion ends your life and you fail to escape, nice try");
			}

			else {
			System.out.println("you must pick a number from 1-12 please restart"); // if user doesn't pick a correct value for the elevator and attempts to travel to a floor doesn't exists they are prompted to try again
			}
		}

		else {
			System.out.println("you must select a door to enter, please restart game andtry again"); // if player doesnt pick a correct value for the first door else statement prints
		
		
		} 
		System.out.println("game over, thank you for playing"); // final print statement to signify that the entirity of the program has run and the game is over
	}

}
