/* 
 * Nolan Blevins
 * NBlevins@emai.sc.edu
 * November 2 2021
 * CSCE 145
 * Box Sorter
 */
public class Box {
	// instance Variables
	private String Label;
	private double Length;
	private double Width;
	private double Height;
	private double Volume;

public Box()
{
	// Initialization
	this.Label = "none";
	this.Length = 1.0;
	this.Width = 1.0;
	this.Height = 1.0;
}
public Box(String aL, double aLL, double aW, double aH, double aV)
{
	this.setLabel(aL);
	this.setLength(aLL);
	this.setWidth(aW);
	this.setHeight(aH);
	this.setVolume(aV);
}
// getters
public double getVolume()
{
	return this.Volume = this.Height * this.Width * this.Length;
}
public String getLabel()
{
	return this.Label;
}
public double getLength()
{
	return this.Length;
}
public double getWidth()
{
	return this.Width;
}
public double getHeight()
{
	return this.Height;
}
// setters
public void setLabel(String aL) //setter method
{
	if(aL != null)
	{
		this.Label = aL;
	}
	else
	{
		this.Label = "none";
	}
}
public void setLength(double aLL)
{
	if(aLL > 0.0) 
	{
		this.Length = aLL;
	}
	else
	{
		this.Length = 1.0;
	}
}
public void setWidth(double aW)
{
	if(aW > 0.0) 
	{
		this.Width = aW;
	}
	else
	{
		this.Width = 1.0;
	}
}
public void setHeight(double aH)
{
	if(aH > 0.0) 
	{
		this.Height = aH;
	}
	else
	{
		this.Height = 1.0;
	}
}
// calculates volume
public void setVolume(double aV)
{
	this.Volume = this.Height * this.Length * this.Width;
}
// print toString Method
public String toString()
{
	return "Label :"+ this.Label+ " "+ "Volume:"+ this.Volume;
}
}