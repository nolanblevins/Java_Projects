/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 25 2021
 * CSCE 145
 * PB&J
 */
public class PeanutButter 
{
	// instance variables
	private String name;
	private int calories;
	private boolean IsCrunchy;

	public PeanutButter ()
	{
		this.name = "none";
		this.calories = 100;
		this.IsCrunchy = false;
	}
	public PeanutButter (String aN, boolean aIC, int aC) 
	{
		this.setName(aN);
		this.setIsCrunchy(aIC);
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
	public boolean getIsCrunchy() //getter method
	{
		return this.IsCrunchy;
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
	public void setCalories(int aC) //setter method
	{
		if(aC >= 100 && aC <= 300) 
		{
			this.calories = aC;
			
		}
		else {
			this.calories = 100;
		}
	}
	public void setIsCrunchy(boolean aIC) { //setter method
		if (aIC == true) 
		{
			this.IsCrunchy = true;
		}
		else 
		{
			this.IsCrunchy = false;
		}
	}

	public boolean equals(PeanutButter aPB) // equals expression
	{
		return aPB != null &&
				this.IsCrunchy == (aPB.getIsCrunchy()) &&
				this.name.equals(aPB.getName()) &&
				this.calories == aPB.getCalories();
	}
	public String toString()
	{
		return this.name+" "+this.IsCrunchy+" "+this.calories;
		
	
	}
	}
	

