/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 25 2021
 * CSCE 145
 * PB&J
 */
public class Bread 
{
	// instance variables
	private String name;
	private int calories;
	private String type;
	
	
	public Bread ()
	{
		this.name = "none";
		this.calories = 50;
		this.type = "Whole Grain";
	}
	public Bread (String aN, int aC, String aT) 
	{
		this.setName(aN);
		this.setType(aT);
		this.setCalories(aC);
	}
	public String getName() //getter method
	{
		return this.name;
	}
	public int getCalories() //getter method
	{
		return this.calories;
	}
	public String getType() //getter method
	{
		return this.type;
	}
	public void setName(String aN) //setter method
	{
		if(aN != null)
		{
			this.name = aN;
		}
		else
		{
			this.name = "none";
		}
	}
	public void setType(String aT) //setter method
	{
		if	(aT == "Honey Wheat")
		{
			this.type = aT;
		}
		else if (aT == "White")
		{
			this.type = aT;
		}
		else if (aT == "Whole Grain")
		{
			this.type = aT;
		}
		else if (aT == "Whole Wheat");
		{
			this.type = aT;
		}
		 
		{
			this.type = "Whole Grain";
		}
	}
	public void setCalories(int aC) //setter method
	{
		if(aC >= 50 && aC <= 250) 
		{
			this.calories = aC;
			
		}
		else {
			this.calories = 50;
		}
	}
	public boolean equals(Bread aB) // equals expression
	{
		return aB != null &&
				this.type.equals(aB.getType()) &&
				this.name.equals(aB.getName()) &&
				this.calories == aB.getCalories();
	}
	public String toString()
	{
		return this.name+" "+this.type+" "+this.calories;
		
	}
	
	
	}
