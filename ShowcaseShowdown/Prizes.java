/*
 * Nolan Blevins
 * CSCE 146
 * Febuary 9 2022
 * Showcase Showdown
 */
public class Prizes 
{
	private String prizeName;
	private int prizePrice;
	
	public Prizes() //default properties of prizes
	{
		this.prizeName = "none";
		this.prizePrice = 0;
	}
	public Prizes(String aName, int aPrice)
	{
		this.setName(aName);
		this.setPrice(aPrice);
	}
	// getters for prizes
	public String getName()
	{
		return this.prizeName;
	}
	public int getPrice()
	{
		return this.prizePrice;
	}
	// setters for prizes
	public void setName(String aName)
	{
		if(aName != null) 
		{
			this.prizeName = aName;
		}
		else
		{
			this.prizeName = "none";
		}
		
	}
	public void setPrice(int aPrice)
	{
		if(aPrice > 0)
		{
			this.prizePrice = aPrice;
		}
		else
		{
			this.prizePrice = 0;
		}
	}
	// to string method fot printing prize list
	public String toString()
	{
		return "Name: " +this.prizeName+ " Price: " +this.prizePrice;
	}
	

}
