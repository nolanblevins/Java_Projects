/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 25 2021
 * CSCE 145
 * PB&J
 */
public class Jelly {
	// instance variables
	private String name;
	private int calories;
	private String FruitType;

	public Jelly ()
	{
		this.name = "none";
		this.calories = 100;
		this.FruitType = "none";
	}
	public Jelly (String aN, String aFT, int aC) 
	{
		this.setName(aN);
		this.setFruitType(aFT);
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
	public String getFruitType() //getter method
	{
		return this.FruitType;
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
	public void setCalories(int aC)  //setter method
	{
		if(aC >= 50 && aC <= 200) 
		{
			this.calories = aC;
			
		}
		else {
			this.calories = 100;
		}
	}
	public void setFruitType(String aFT) { //setter method
		if (aFT == "Apple") 
		{
			this.FruitType = aFT;
		}
		else if (aFT == "Blackberry")
		{
			this.FruitType = aFT;
		}
		else if (aFT == "Grape")
		{
			this.FruitType = aFT;
		}
		else if (aFT == "Mango")
		{
			this.FruitType = aFT;
		}
		else if (aFT == "Tomato") 
		{
			this.FruitType = aFT;
		}
	}
	public boolean equals(Jelly aJ) // equals expression
	{
		return aJ != null &&
				this.FruitType.equals(aJ.getFruitType()) &&
				this.name.equals(aJ.getName()) &&
				this.calories == aJ.getCalories();
	}
	public String toString()
	{
		return this.name+" "+this.FruitType+" "+this.calories;
		
	
}
}
