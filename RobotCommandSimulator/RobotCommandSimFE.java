/*
 * Nolan Blevins
 * March 16 2022
 * CSCE 146
 * Robot Command Simulator
 */


import java.util.Scanner;

public class RobotCommandSimFE 
{
	public static Scanner kB = new Scanner(System.in);
	public static String boardFile;
	public static String moveFile;
	public static final String DEF_BOARD_FILE = "./src/board.txt";
	public static final String DEF_MOVE_FILE = "./src/robotCommands.txt";
	public static RobotCommandSim Sim = new RobotCommandSim();
	public static final String QUIT = "quit";
	
	public static void main(String[] args)
	{
		boolean run = true;
		while(run)
		{
			System.out.println("Welcome to Nolan Blevins Robot Command Simulator");
			Sim.resetMoves();
			
			boolean simOver = false;
			
			while(!simOver)
			{
				System.out.println("First you must select the files you would like to run the simulation with");
				System.out.println("Would you like to use the default files?");
				String defChoice = kB.nextLine();
				switch(defChoice.toLowerCase()) 
				{
				case "yes":
					Sim.readBoardFile(DEF_BOARD_FILE);
					System.out.println("1");

					Sim.readMoveFile(DEF_MOVE_FILE);
					System.out.println("2");

					Sim.movePlayer();
					

					break;
					
				case "no":
					System.out.println("Enter the file path for the board you would lile to use: ");
					boardFile = kB.nextLine();
					Sim.readBoardFile(boardFile);
					System.out.println("Enter the file path for the move set you would like to use: ");
					moveFile = kB.nextLine();
					Sim.readMoveFile(moveFile);
					Sim.movePlayer();
					break;
				}
				simOver = true;
			}
			System.out.println("Would you like to quit or restart");
			String userQuit = kB.nextLine();
			if(userQuit.equalsIgnoreCase(QUIT))
			{
				run = false;
			}
		}
		System.out.println("Thank you for using Nolan Blevins Robot Command Simulator");
	}

}
