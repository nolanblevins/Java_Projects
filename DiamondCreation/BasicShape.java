/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * November 19 2021
 * CSCE 145
 * hollow diamond maker
 */
/*
 * Written by JJ Shepherd
 */
public class BasicShape implements Shape
{
	private int hSpace;//The number of horizontal spaces to skip before drawing the shape
	public BasicShape()
	{
		this.hSpace = 0;
	}
	public BasicShape(int aH)
	{
		this.setHSpace(aH);
	}
	public int getHSpace()
	{
		return this.hSpace;
	}
	public void setHSpace(int aH)
	{
		if(aH >= 0)
			this.hSpace = aH;
		else
			this.hSpace = 0;
	}
	public void drawShape()
	{
		skipSpaces(this.hSpace);
		System.out.println("*");
	}
	public void drawShapeAt(int lineNumber)
	{
		for(int i=0;i<lineNumber;i++)
			System.out.println();
		drawShape();
	}
	public static void skipSpaces(int aH)
	{
		for(int i=0;i<aH;i++)
			System.out.print(" ");
	}
}