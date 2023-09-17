k/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 25 2021
 * CSCE 145
 * Moving Circle
 */
public class MovingCircle {
	// instance variables
	private double x = 0;
	private double y = 0;
	private double Diameter = 0.0;
	private double VelocityX = 0;
	private double VelocityY = 0;

	public MovingCircle(double aX, double aY, double aD, double aVX, double aVY)
	{
		this.setX(aX);
		this.setY(aY);
		this.setDiameter(aD);
		this.setVelX(aVX);
		this.setVelY(aVY);
	}
	public double getX() //getter method
	{
		return this.x;
	}
	public double getY() //getter method
	{
		return this.y;
	}
	public double getDiameter() //getter method
	{
		return this.Diameter;
	}
	public double getVelX() //getter method
	{
		return this.VelocityX;
	}
	public double getVelY() //getter method
	{
		return this.VelocityY;
	}
	public void setX(double aX) //setter method
	{
		this.x = aX;
	}
	public void setY(double aY) //setter method
	{
		this.y = aY;
	}
	public void setDiameter(double aD) //setter method
	{
		if(aD > 0) 
		{
			this.Diameter =aD;
		}
	}
	public void setVelX(double aVX) //setter method
	{
		this.VelocityX = aVX;
	}
	public void setVelY(double aVY) //setter method
	{
		this.VelocityY = aVY;
	}
	public boolean equals(MovingCircle aMC) // equals method to see if two objects share the same values
	{
		return aMC != null &&
				this.x == (aMC.getX())&&
				this.y == (aMC.getY())&&
				this.Diameter == (aMC.getDiameter())&&
				this.VelocityX == (aMC.getVelX())&&
				this.VelocityY == (aMC.getVelY());
	}
	public String toString()
	{
		return "x: "+this.x+ " y: "+this.y+" Diameter: "+this.Diameter+" Velocity X: "+this.VelocityX+" Velocity y: "+this.VelocityY;
	}
	public void move() {
		x = x + VelocityX;
		y = y + VelocityY; 
	}
	public boolean isColliding(MovingCircle c1) // Detects collision of circles
	{
		double IC = Math.sqrt(Math.pow(c1.x - x, 2) + Math.pow(c1.y - y, 2));
		if (IC <= ((1/2* c1.Diameter)+ (1/2* Diameter))) {
			return true;
		}
		return false;
		
	}

}
