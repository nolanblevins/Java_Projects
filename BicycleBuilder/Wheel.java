/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 25 2021
 * CSCE 145
 * Bicycle Builder
 */
public class Wheel {
	// instance variables
	private double diameter;
	private double width;
	public Wheel()
	{
		this.diameter = 16;
		this.width = 1.0;
		
	}
	public Wheel(double d, double aW)
	{
		this.setDiameter(d);
		this.setWidth(aW);
	}
	public double getDiameter() //getter method
	{
		return this.diameter;
	}
	public double getWidth() //getter method
	{
		return this.width;
	}
	public void setDiameter(double d) //setter method
	{
		if(d >= 16 && d <= 55)
		{
			this.diameter = d;
			
		}
		else {
			this.diameter = 16;
		}
	}
	public void setWidth(double aW) //setter method
	{
		if(aW >= 1.0 && aW <= 2.5)
			this.width = aW;
	}
	 {
		this.width = 1.0;
	}
	public boolean equals(Wheel aWH) // equals method to see if two objects share the same values
	{
		return aWH != null &&
				this.diameter == (aWH.getDiameter())&&
				this.width == (aWH.getWidth());
	}
	public String toString()
	{
		return this.diameter+" "+this.width;
	}
}
