/*
 * Nolan Blevins
 * February 16 2022
 * CSCE 146
 * Video Game DataBase
 */
import java.io.*;
import java.util.Scanner;
public class VideoGameManager 
{
	public static final String DELIM = "\t";
	public String FileName;
	
	private GenLL<VideoGame> vG;
	private GenLL<VideoGame> SearchVg;
	
	public VideoGameManager()
	{
		vG = new GenLL<VideoGame>();
		SearchVg = new GenLL<VideoGame>();
	}
	public void addVideoGame(VideoGame aVG) // adds object to video game linked list
	{
		vG.add(aVG);
	}
	public void addSearchVideoGame(VideoGame aVG) // adds object to search linked list
	{
		SearchVg.add(aVG);
	}

	public void searchName(String aVG) // uses video game linked list and searches based on video game name
	{
		vG.reset();
		while(vG.hasMore())
		{
			if(vG.getCurrent().getName().toLowerCase().contains(aVG.toLowerCase()))
			{
				SearchVg.add(vG.getCurrent());

			}
			vG.goToNext();
		}
	}
	public void searchConsole(String aVG) // uses video game linked list and searches based on video game console
	{
		vG.reset();
		while(vG.hasMore())
		{
			if(vG.getCurrent().getConsole().toLowerCase().contains(aVG.toLowerCase()))
			{
				SearchVg.add(vG.getCurrent());
			}
			vG.goToNext();
		}
	}
	public void clearSearchLL() //clears search LL
	{
		if(SearchVg != null)
		{
		SearchVg.reset();
		while(SearchVg.hasMore())
		{
			SearchVg.removeCurrent();
		}
		}
		else
		{
			
		}
			
		
	}
	public void clearVgLL() //clears video game LL
	{
		vG.reset();
		while(vG.hasMore())
		{
			vG.removeCurrent();
		}
	}
	public void readVgFile(String aName) // reads the file and adds tab delimited lines to linked list
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(aName));
			
			while(fileScanner.hasNextLine()) // moves through file
			{


				String fileLine = fileScanner.nextLine();
				String [] splitLines = fileLine.split(DELIM); // splits lined based on delimiter
				if(splitLines.length == 2)
				{
					String name = splitLines[0];
					String console = splitLines[1];
					VideoGame aVG = new VideoGame(name,console); // creates obj
					this.addVideoGame(aVG); // adds obj
				}
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void writeVgFile(String aName) // overwrites file contents with new contents
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aName));
			SearchVg.reset();
			while(SearchVg.hasMore())
			{
				VideoGame aVG = SearchVg.getCurrent();
				fileWriter.println(aVG.getName() +DELIM+ aVG.getConsole());
				SearchVg.goToNext();
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void appendVgFile(String aName) // adds contents to existing contents of file
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aName, true));
			SearchVg.reset();
			while(SearchVg.hasMore())
			{
				VideoGame aVG = SearchVg.getCurrent();
				fileWriter.println(aVG.getName() +DELIM+ aVG.getConsole());
				SearchVg.goToNext();
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void printSearch() // prints search ll
	{
		SearchVg.print();
	}
	public void printVG() // prints videogame ll
	{
		vG.print();
	}

	

}
