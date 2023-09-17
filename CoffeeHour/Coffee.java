
/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 21 2021
 * CSCE 145
 * Coffee Tester
 */

public class Coffee {
	// declaring variables
	private String name;
	private double caffeine;
	
	public Coffee()
	{
		this.name = "none";
		this.caffeine = 50.0;
	}
	public Coffee(String aN, double aC)
	{
		this.setName(aN);
		this.setCaffeine(aC);
		
	}
	public String getName() // gets name of coffee
	{
		return this.name;
	}
	public double getCaffeine() // gets caffeine content of coffee
	{
		return this.caffeine;
		
	}
	public void setName(String aN) // sets name of coffee
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
	public void setCaffeine(double aC) // sets caffeine content of coffee
	{
		if (aC > 50.0)
		{
			this.caffeine = aC;
		}
		else
		{
			this.caffeine = 50.0;
		}
	}
	public boolean equals(Coffee aCF)
	{
		return aCF != null &&
				this.name.equals(aCF.getName()) &&
				this.caffeine == aCF.getCaffeine();
				
	}
	
	public String toString()
	{
		return this.name+"  "+this.caffeine;
	}
	public double riskyAmount() // calculates if caffeine is a risky ammount
	{
		double riskyAmount = (180.0)/((this.caffeine/10)*6);
		return riskyAmount;
	}
}// end of pub class coffee
