/*
 * Nolan Blevins
 * March 16 2022
 * CSCE 146
 * Robot Command Simulator
 */

import java.io.File;
import java.util.Scanner;

public class RobotCommandSim 
{
	// Variables for board and player
	public static final int BOARD_SIZE = 10;
	private char [][] board; 
	public static final char EMPTY = '_';
	public static final char OBST = 'X';
	public static final char PLAYER = 'O';
	public static final char PATH = '#';
	public int[] currLoc;
	
	public String BoardFile;
	public String MoveFile;
	
	// Variables for commands
	public static final String UP = "Move Up";
	public static final String DOWN = "Move Down";
	public static final String LEFT = "Move Left";
	public static final String RIGHT = "Move Right";
	public static final String CRASH = "Crash";
	
	private QueueI<String> moves;
	public RobotCommandSim()
	{
		moves = new QueueLL<String>();
	}
	
	public void readMoveFile(String aString) // method reads file for players moves
	{
		
		try
		{
			Scanner fileScanner = new Scanner(new File(aString));
			
			while(fileScanner.hasNextLine())
			{
				String fileMove = fileScanner.nextLine();
				moves.enqueue(fileMove); // enqueues moves
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void readBoardFile(String aString) // method reads board file for sim board
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(aString));
			board = new char[BOARD_SIZE][BOARD_SIZE]; // index 0 = y, 1 = x
			while(fileScanner.hasNextLine())
			{
				
				for(int i = 0; i < BOARD_SIZE; i++)
				{
					String fillBoard = fileScanner.nextLine();
					String fileLine = fillBoard;

					for(int j = 0; j < board[i].length; j++)
					{
						board [i] [j] = (fileLine.charAt(j)); // adds char to board 
					}
							
				}
				//fileScanner.nextLine();
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	public void printBoard()
	{
		for(int i = 0; i < BOARD_SIZE; i++)
		{
			for(int j = 0; j < BOARD_SIZE; j++)
			{
				System.out.print(board[i][j]); // prints the board with any added indices
			}
			System.out.println();	
		}
		System.out.println();	

	}
	private boolean isValid(int index)
	{
		return index >= 0 && index < board.length;
	}
	public void resetMoves()
	{
		moves.reset(); // resets move queue
	}
	public void movePlayer()
	{
		board[0][0] = PLAYER;
		printBoard();
		currLoc = new int[] {0,0}; 
		int currY = currLoc[0];
		int currX = currLoc[1];
		boolean crash = true;
		while(crash)
		{
		for(int i = 0; i < moves.size(); i++)
		{
			
			String nextMove = moves.dequeue(); // dequeues move and sets string equal to dequeued move
			switch(nextMove)
			{
			case DOWN:
				if(isValid(currY + 1) && board[currY + 1][currX] != OBST) // increases y val by one if move down
				{
					board[currY][currX] = EMPTY;
					board[currY + 1][currX] = PLAYER;
					currY = currY + 1;
					printBoard();
					break;
				}
				else
				{
					System.out.println(CRASH);
					crash = false;
					return;
				}
			case UP:
				if(isValid(currY - 1) && board[currY + 1][currX] != OBST) // decrease y by one if move up
				{
					board[currY][currX] = EMPTY;
					board[currY - 1][currX] = PLAYER;
					currY = currY - 1;
					printBoard();
					break;
				}
				else
				{
					System.out.println(CRASH);
					crash = false;
					return;
				}
			case RIGHT:
				if(isValid(currX + 1) && board[currY][currX + 1] != OBST) // increase x by one if move right
				{
					board[currY][currX] = EMPTY;
					board[currY][currX + 1] = PLAYER;
					currX = currX + 1;

					printBoard();
					
					break;
				}
				else
				{
					System.out.println(CRASH);
					crash = false;
					return;
					
				}
			case LEFT:
				if(isValid(currX - 1) && board[currY][currX - 1] != OBST) // decrease x by one if move left
				{
					board[currY][currX] = EMPTY;
					board[currY][currX - 1] = PLAYER;
					currX = currX - 1;

					printBoard();
					break;
				}
				else
				{
					System.out.println(CRASH);
					crash = false;
					return;
				}
			}
			}
		}

		
		
	}

}
