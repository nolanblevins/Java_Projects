/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * November 19 2021
 * CSCE 145
 * FleetOfVehicles
 */

public class Vehicle {
// instance variables
	private String manufacturersNames;
	private int numberOfCylinders;
	private String ownersName;
	// initializing variables
	public Vehicle () 
	{
		this.manufacturersNames = "none";
		this.numberOfCylinders = 1;
		this.ownersName = "none";
	}
	// parameterized
	public Vehicle(String mN, int nC, String oN) 
	{
		this.setManName(mN);
		this.setNumOfCyl(nC);
		this.setOwnName(oN);
	}
	// getters
	public String getManName() 
	{
		return this.manufacturersNames;
	}
	public int getNumOfCyl() 
	{
		return this.numberOfCylinders;
	}
	public String getOwnName() 
	{
		return this.ownersName;
	}
	// setters
	public void setManName(String mN) {
		if(mN != null) 
		{
			this.manufacturersNames = mN; 
		}
		else
		{
			this.manufacturersNames = "none";
		}
	}
	public void setNumOfCyl(int nC) 
	{
		if(nC > 0)
		{
			this.numberOfCylinders = nC;
		}
		else
		{
			this.numberOfCylinders = 1;
		}
	}
	public void setOwnName(String oN)
	{
		if(oN != null)
		{
			this.ownersName = oN;
		}
		else
		{
			this.ownersName = "none";
		}
	}
	// equals method: returns true if all values are the same
	public boolean equals(Vehicle aV)
	{
		return aV != null &&
				this.manufacturersNames.equals(aV.getManName())&&
				this.numberOfCylinders == (aV.getNumOfCyl())&&
				this.ownersName.equals(aV.getOwnName());
	}
	// toString to return string of concatenated values
	public String toString()
	{
		return " Manufacturers Name: "+this.manufacturersNames+" Number of Cylinders: "+this.numberOfCylinders+" Owners Name: "+this.ownersName;
	}
}
