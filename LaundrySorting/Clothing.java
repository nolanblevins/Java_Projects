/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * November 4 2021
 * CSCE 145
 * Laundry Sorting
 */
public class Clothing {
	// instance variables
	private String Type;
	private String Color;

	public Clothing()
	{
		this.Type = "Socks";
		this.Color = "Black";
	}
	public Clothing(String aC, String aT)
	{
		this.setType(aT);
		this.setColor(aC);
	}
	// getters
	public String getType()
	{
		return this.Type;
	}
	public String getColor()
	{
		return this.Color;
	}
	// setters
	public void setType(String aT)
	{
		if(aT.equals("Undergarments"))
		{
			this.Type = aT;
		}
		else if(aT.equals("Stockings"))
		{
			this.Type = aT;
		}
		else if(aT.equals("Tops"))
		{
			this.Type = aT;
		}
		else if(aT.equals("Bottoms"))
		{
			this.Type = aT;
		}
		else if (aT.equals("Capes"))
		{
			this.Type = aT;
		}
		else {
			this.Type = "Socks";
		}
	}
	public void setColor(String aC)
	{
		if(aC.equals("Brown") || aC.equals("Red") || aC.equals("Pink") || aC.equals("Black") || aC.equals("White") 
			|| aC.equals("Orange") || aC.equals("Green") || aC.equals("Blue") || aC.equals("Purple") || aC.equals("Grey")) 
		{
			this.Color = aC;
		}
		else 
		{
			this.Color = "Black";
		}
	}
	public boolean equals(Clothing aCC) // equals method to check if equal to
	{
		return aCC != null &&
				this.Type.equals(aCC.getType())&&
				this.Color.equals(aCC.getColor());
	}
	public String toString() // prints type and color
	{
		return "Type: "+this.Type+" Color: "+ this.Color;
	}
	
	}