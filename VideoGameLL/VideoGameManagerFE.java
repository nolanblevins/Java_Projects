
/*
 * Nolan Blevins
 * February 16 2022
 * CSCE 146
 * Video Game DataBase
 */
import java.util.Scanner;
public class VideoGameManagerFE 
{
	private static Scanner kB = new Scanner(System.in);
	private static VideoGameManager vGM = new VideoGameManager();
	private static final String DEFAULTFILE = "./src/Collection.txt";
	
	public static void main(String[]args)
	{
		Hello();
		boolean quit = false;
		while(!quit)
		{
			printChoices();
			String choice = kB.nextLine();
			if(choice.equals("*"))
			{
				vGM.printVG(); // prints entire video game file
			}
			else
			{
				
				int intChoice =Integer.parseInt(choice);			
			switch(intChoice)
			{
			case 1:
				readVgFile();
				break;
			case 2:
				readDefaultVgFile();
				break;
			case 3:
				searchByName();
				vGM.printSearch();
				break;
			case 4:
				searchByConsole();
				vGM.printSearch();
				break;
			case 5:
				writeToFile();
				break;
			case 0:
				quit = true;
				break;
				default:
					System.out.println("Invalid Input");
					break;
				}
					
			}
		}
		
	}
	
	
	public static void Hello() // simple greeting
	{
		System.out.println("Welcome to Nolans Video Game Database");
	}
	public static void printChoices() // display user choices
	{
		System.out.println( "\n"
							+"Enter 1 to read a Video Game database file\n"
							+"Enter 2 to read the default Video Game database file\n"
							+"Enter 3 to search the Video Game database by game title\n"
							+"Enter 4 to search the Video Game database by console\n"
							+"Enter 5 to add the search results to a file \n"
							+"Enter * to return all in Video Game database\n"
							+"Enter 0 to quit");
	}
	public static void readVgFile()
	{
		vGM.clearSearchLL(); // clear search ll
		vGM.clearVgLL(); // clear video game linked list
		System.out.println("Enter the file name to read a Video Game database");
		String fileName = kB.nextLine(); // var for file name
		vGM.readVgFile(fileName); // reads file
		System.out.println("File was added to DataBase");

	}
	public static void readDefaultVgFile()
	{
		vGM.clearSearchLL(); // clear search ll
		vGM.clearVgLL(); // clear video game linked list
		vGM.readVgFile(DEFAULTFILE); // reads default file
		System.out.println("File was added to DataBase");
	}
	public static void searchByName()
	{
		vGM.clearSearchLL(); // clear search ll
		System.out.println("Enter the name or partial name of the game title you'd like to search:");
		String gameName = kB.nextLine();
		System.out.println("Printing all games with a title that contains: " +gameName+ "\n");
		vGM.searchName(gameName); // searches based on user input and adds to ll
		//vGM.printSearch();
	}
	public static void searchByConsole()
	{
		vGM.clearSearchLL(); // clear search ll
		System.out.println("Enter the name or partial name of the console you'd like to search:");
		String gameConsole = kB.nextLine();
		System.out.println("Printing all games on the: " +gameConsole+ "\n");
		vGM.searchConsole(gameConsole); // searches based on user input and adds to ll
	}
	public static void writeToFile()
	{
		System.out.println("Enter the filename that you would like to write or append the search results to: ");
		String writeFile = kB.nextLine();
		System.out.println(  "Enter 1 to append to file: \n"
							+"Enter 2 to write to file: ");
		int aOp = kB.nextInt();
		kB.nextLine();
		switch(aOp)
		{
		case 1:
			vGM.appendVgFile(writeFile); // appends contents to file
			break;
		case 2:
			vGM.writeVgFile(writeFile); // overwrites existing contents of file
		}
		
	}
	
}
