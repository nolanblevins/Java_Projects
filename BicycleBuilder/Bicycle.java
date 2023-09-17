/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 25 2021
 * CSCE 145
 * Bicycle Builder
 */
public class Bicycle {
	// instance variables
	private String Make ;
	private Wheel FrontWheel;
	private Wheel BackWheel;
	private Frame frame;

	public Bicycle(String string, Wheel wheel, Wheel wheel2, Frame frame2)
	{
		this.Make = "none";
		this.FrontWheel = new Wheel();
		this.BackWheel = new Wheel();
		this.frame = new Frame();
	}
	public Wheel getFrontWheel() //getter method
	{
		return this.FrontWheel;
	}
	public void setFrontWheel(Wheel wheel) //setter method
	{
		FrontWheel.setDiameter(0);
		FrontWheel.setWidth(0);
	}
	public Wheel getBackWheel() //getter method
	{
		return this.BackWheel;
	}
	public void setBackWheel(Wheel wheel) //setter method
	{
		BackWheel.setDiameter(0);
		BackWheel.setWidth(0);
	}
	public Frame getFrame() //getter method
	{
		return this.frame;
	}
	public void setFrame(Frame frame) //setter method
	{
		frame.setSize(0);
		frame.setType("");
	}
	public String getMake() //getter method
	{
		return this.Make;
	}
	public boolean equals(Bicycle aB) // equals method to see if two objects share the same values
	{
		return aB != null &&
				this.Make.equals(aB.getMake())&&
				this.FrontWheel == (aB.getFrontWheel())&&
				this.BackWheel == (aB.getBackWheel())&&
				this.frame == (aB.getFrame());
	}
	public String toString()
	{
		return "Make:" +this.Make+ "Front Wheel" +this.FrontWheel+ "Back Wheel" +this.BackWheel+ "Frame" +this.frame;
	}
	
	
}