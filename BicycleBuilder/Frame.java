/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 25 2021
 * CSCE 145
 * Bicycle Builder
 */
public class Frame {
	// instance variables
	private double size;
	private String type;
	public Frame()
	{
		this.size =18.5;
		this.type = "Diamond";
		
	}
	public Frame(double aS, String aT)
	{
		this.setSize(aS);
		this.setType(aT);
	}
	public double getSize() //getter method
	{
		return this.size;
	}
	public String getType() //getter method
	{
		return this.type;
	}
	public void setSize(double aS) //setter method
	{
		if(aS >= 18.5 && aS <= 60)
		{
			this.size = aS;
			
		}
		else {
			this.size = 18.5;
		}
	}
	public void setType(String aT) //setter method
	{
	if (aT == "Diamond") 
	{
		this.type = aT;
	}
	else if (aT == "Step-Through")
	{
		this.type = aT;
	}
	else if (aT == "Truss")
	{
		this.type = aT;
	}
	else if (aT == "Penny-Farthing")
	{
		this.type = aT;
	}
	else 
	{
		this.type = "Diamond";
	}
}
	public boolean equals(Frame aF) // equals method to see if two objects share the same values
	{
		return aF != null &&
				this.size == (aF.getSize())&&
				this.type == (aF.getType());
	}
	public String toString()
	{
		return "Size:" +this.size+" Type:"+this.type;
	}
}
