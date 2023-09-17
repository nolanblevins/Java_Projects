/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * November 19 2021
 * CSCE 145
 * hollow diamond maker
 */
public class HollowDiamond extends BasicShape implements Diamond
{
	public int width;
	
	public HollowDiamond()
	{
		super();
		this.width = 3;
	}
	public HollowDiamond(int aH, int aW)
	{
		super(aH);
		this.setWidth(aW);
	}
	public int getWidth()
	{
		return this.width;
	}
	public void setWidth(int aW)
	{
		if(aW % 3 == 0)
		{
			this.width = aW;
		}
		else if (aW % 2 == 1)
		{
			this.width = aW + 1;
		}
		else
		{
			this.width = 3;
		}
	}
	public void drawShape()
	{ 
		// top triangle
		for (int i = 1 ; i <= this.getWidth()/2 + 1; i++)
		{
			for(int j = this.getWidth(); j>i;j--)
			{
				skipSpaces(super.getHSpace()+1); //left spacing	 	
			}
			System.out.print("*");
			for (int j = 1 ; j < (i-1)*2 ;j++)
			{
				skipSpaces(super.getHSpace()+1); //right spacing
			}
			if(i == 1)
			{
				System.out.print("\n"); // skips line for next *
			}
			else {
				System.out.print("*\n"); // star then skip line
			}
		}
		// bot triangle
		for (int i = this.getWidth()/2  ; i >= 1 ;i--) // runs loop for same 
		{
			for (int j = this.getWidth(); j > i; j--)
			{
				skipSpaces(super.getHSpace()+1); // left spacing	
			}
			System.out.print("*");
			for(int j = 1; j < (i-1)*2 ; j++)
			{
				skipSpaces(super.getHSpace()+1); // right spacing		

			}
			if(i == 1)
			{
				System.out.print("\n"); // skips line for next *
			}
			else {
				System.out.print("*\n"); // star then skip line
			}
		}
			
			
	}
	
	
}

