
/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 21 2021
 * CSCE 145
 * Apple Lab
 */

public class Apple {
	private String type;
	private double weight;
	private double price;

	public Apple()
	{
		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}
	public Apple(String aT, double aW, double aP) // declared variables for apple
	{
		this.setType(aT);
		this.setWeight(aW);
		this.setPrice(aP);
	}
	public String getType() // gets type value
	{
		return this.type;
	}
	public double getWeight() // gets weight value
	{
		return this.weight;
	}
	public double getPrice() // gets price value
	{
		return this.price;
	}
	public void setType(String aT) // setting type values
	{
		if(aT == "Gala")
		{
			this.type = aT;
		}
		else if(aT == "Red Delicious")
		{
			this.type = aT;
		}
		else if(aT == "Golden Delicious")
		{
			this.type = aT;
		}
		else if(aT == "Granny Smith")
		{
			this.type = aT;
		}
		else
		{
			this.type = "Gala";
		}
	}
	public void setWeight(double aW) // setting weight values
	{
		if(aW > 0.0 && aW < 2.0)
		{
			this.weight = aW;
		}
		else
		{
			this.weight = 0.0;
		}
	}
	public void setPrice(double aP) // setting price values
	{
		if(aP > 0.0)
		{
			this.price = aP;
		}
		else
		{
			this.price = 0.0;
		}
	}
	public boolean equals(Apple aA) // equals expression
	{
		return aA != null &&
				this.type.equals(aA.getType()) &&
				this.weight == aA.getWeight() &&
				this.price == aA.getPrice();
	}
	public String toString()
	{
		return this.type+" "+this.weight+" "+this.price;
		
	}
}