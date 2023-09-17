/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * November 19 2021
 * CSCE 145
 * FleetOfVehicles
 */
public class Car extends Vehicle{
	private double gasMileage;
	private int numberOfPassengers;
	// initialization
	public Car()
	{
		super();
		this.gasMileage = 0.0;
		this.numberOfPassengers = 0;
	}
	public Car(String mN, int nC, String oN, double gM, int nP)
	{
		super(mN, nC, oN);
		this.setGasMile(gM);
		this.setNumOfPas(nP);
	}
	// getters
	public double getGasMile()
	{
		return this.gasMileage;
	}
	public int getNumOfPas()
	{
		return this.numberOfPassengers;
	}
	// setters 
	public void setGasMile(double gM)
	{
		if(gM > 0.0)
		{
			this.gasMileage = gM;
		}
		else
		{
			this.gasMileage = 0.0;
		}
	}
	public void setNumOfPas(int nP)
	{
		if(nP > 0)
		{
			this.numberOfPassengers = nP;
		}
		else
		{
			this.numberOfPassengers = 0;
		}
	}
	// to string method to return string of var
	public String toString()
	{
		return super.toString()+ " Gas Mileage: "+ this.gasMileage +" Number of Passengers: "+ this.numberOfPassengers;
	}
	// equals method to return true if values are the same
	public boolean equals(Car aC)
	{
		return aC != null &&
				super.equals(aC)&&
				this.gasMileage == aC.getGasMile()&&
				this.numberOfPassengers == aC.getNumOfPas();
			
	}

}
