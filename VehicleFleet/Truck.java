/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * November 19 2021
 * CSCE 145
 * FleetOfVehicles
 */

public class Truck extends Vehicle{
	private double loadCapacity;
	private double towingCapacity;
	public Truck()
	{
		super();
		this.loadCapacity = 0.0;
		this.towingCapacity = 0.0;
	}
	// setting parameters
	public Truck(String mN, int nC, String oN, double lC, double tC)
	{
		super(mN, nC, oN);
		this.setLoadCap(lC);
		this.setTowCap(tC);
		
	}
	// getters 
	public double getLoadCap()
	{
		return this.loadCapacity;
	}
	public double getTowCap()
	{
		return this.towingCapacity;
	}
	// setters
	public void setLoadCap (double lC)
	{
		if(lC > 0.0) 
		{
			this.loadCapacity = lC;
		}
		else
		{
			this.loadCapacity = 0.0;
		}
	}
	public void setTowCap (double TC)
	{
		if(TC > 0.0) 
		{
			this.towingCapacity = TC;
		}
		else
		{
			this.towingCapacity = 0.0;
		}
	}
	// equals method to return true if values are the same
	public boolean equals(Truck aT)
	{
		return aT != null &&
				super.equals(aT)&&
				this.loadCapacity == aT.getLoadCap()&&
				this.towingCapacity == aT.getTowCap();
	}
	// toString to return string of concatenated values

	public String toString()
	{
		return super.toString()+ " Load Capacity: "+ this.loadCapacity+ " Towing Capacity: "+ this.towingCapacity;
	}
	
	

}
