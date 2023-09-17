/*
 * Nolan Blevins
 * March 30 2022
 * CSCE 146 Fruit Tree Lab 06
 */
public class Fruit implements Comparable <Fruit>
{
	private String type;
	private double weight;
	
	public Fruit()
	{
		this.type = "none";
		this.weight = 1.0;
	}
	public Fruit(String aT, double aW)
	{
		this.setWeight(aW);
		this.setType(aT);
	}
	public String getType()
	{
		return this.type;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public void setWeight(double aW)
	{
		if(aW > 0.0)
		{
			this.weight = aW;
		}
		else
		{
			this.weight = 1.0;
		}
	}
	public void setType(String aT)
	{
		if(aT != null && aT.equalsIgnoreCase("apple") || aT.equalsIgnoreCase("orange") 
				|| aT.equalsIgnoreCase("banana") || aT.equalsIgnoreCase("kiwi") 
				|| aT.equalsIgnoreCase("tomato"))
		{
			this.type = aT;
		}
		else
		{
			this.type = "apple";
		}
	}
	public String toString()
	{
		return "Type: " + this.type + " Weight: " + this.weight;
	}

	
	
	/*
	 * compares with weight as init precedent
	 * if weights are the same compares based on the type
	 * 
	 */
	public int compareTo(Fruit aF) 
	{
		if(this.weight > aF.weight)
		
			return 1;
		
		if(this.weight < aF.weight)
			return -1;
		
		if(this.weight == aF.weight)
			return this.type.compareTo(aF.type);
		
		else
			return -1;
	}

	

}
