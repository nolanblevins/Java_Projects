/*
 * Nolan Blevins
 * February 16th 2022
 * Process Queue Simulator
 * CSCE 146
 */
public class Process 
{
	private String Name;
	private double CompletionTime;
	
	public Process() //default process properties
	{
		this.Name = "none";
		this.CompletionTime = 0.0;
	}
	public Process(String aName, double aTime) // object creation
	{
		this.setName(aName);
		this.setCompletionTime(aTime);
	}
	// getters for process attributes
	public String getName()
	{
		return this.Name;
	}
	public double getCompletionTime()
	{
		return this.CompletionTime;
	}
	// setters for process attributes
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
	public void setCompletionTime(double aTime)
	{
		if(aTime > 0.0)
		{
			this.CompletionTime = aTime;
		}
		else
		{
			this.CompletionTime = 0.0;
		}
	}
	//  toString to return concatenated values of process obj
	public String toString()
	{
		return "Name: " +this.Name+ " Completion Time: " +this.CompletionTime;
	}
}

