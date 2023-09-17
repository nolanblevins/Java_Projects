/*
 * Nolan Blevins
 * February 16 2022
 * CSCE 146
 * Video Game DataBase
 */
public class VideoGame 
{
	private String Name;
	private String Console;
	
	public VideoGame()
	{
		this.Name = "none";
		this.Console = "none";
	}
	
	public VideoGame(String aName, String aConsole)
	{
		this.setName(aName);
		this.setConsole(aConsole);
	}
	//getters
	public String getName()
	{
		return this.Name;
	}
	public String getConsole()
	{
		return this.Console;
	}
	//setters
	public void setName(String aName)
	{
		if(aName != null)
		{
			this.Name = aName;
		}
		else
		{
			this.Name = "none";
		}
	}
	public void setConsole(String aConsole)
	{
		if(aConsole != null)
		{
			this.Console = aConsole;
		}
		else
		{
			this.Console = "none";
		}
		
	}
	// toString to return concatenated string of VideoGame properties
	public String toString()
	{
		return "Name: " +this.Name+ " Console: " +this.Console;
	}
	public boolean equals(VideoGame aVideoGame)
	{
		return aVideoGame != null&&
				this.Name.equals(aVideoGame.getName())&&
				this.Console.equals(aVideoGame.getConsole());
	}

}
