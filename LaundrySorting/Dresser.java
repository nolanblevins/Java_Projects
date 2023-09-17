/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * November 4 2021
 * CSCE 145
 * Laundry Sorting
 */
public class Dresser 
{
	// instance variables
	private Clothing Clothes [][] = new Clothing [5][10];
	
	// adds object to array
	public void Add(Clothing aT)
	{
		if(aT.getType().equals("Undergarments"))
		{
			for(int i = 0; Clothes.length < i; i ++) 
			{
				if(Clothes[0][i] == null) 
				{
				Clothes[0][i] = aT;
				break;

				}
			}
			}
		if(aT.getType().equals("Socks") || aT.getType().equals("Stockings"))
		{
			for(int i = 0; i < Clothes.length; i ++) 
			{
				if(Clothes[1][i] == null) 
				{
				Clothes[1][i] = aT;
				break;
				}
				
			}
			}
		if(aT.getType().equals("Tops"))
		{
			for(int i = 0; i < Clothes.length; i ++) 
			{
				if(Clothes[2][i] == null) 
				{
				Clothes[2][i] = aT;
				break;
				}
				
			}
			}
		if(aT.getType().equals("Bottoms"))
		{
			for(int i = 0; i < Clothes.length; i ++) 
			{
				if(Clothes[3][i] == null) 
				{
				Clothes[3][i] = aT;
				break;
				}
				
			}
			}
		if(aT.getType().equals("Capes"))
		{
			for(int i = 0; i < Clothes.length; i ++) 
			{
				if(Clothes[4][i] == null) 
				{
				Clothes[4][i] = aT;
				break;
				}
				
			}
			}
			}
	// removes object from array
	public void Remove(Clothing aT)
	{
		if(aT.getType().equals("Socks" ))
		{
				for(int i = 0; i < Clothes.length; i ++) 
				{
					if(Clothes[0][i] == (aT)) 
					{
					Clothes[0][i] = null;
					break;
					}
					
				}
			}
		if(aT.getType().equals("Socks") || aT.getType().equals("Stockings"))
		{
				for(int i = 0; i < Clothes.length; i ++) 
				{
					if(Clothes[1][i]==(aT)) 
					{
					Clothes[1][i] = null;
					break;
					}
					
				}
			}
		if(aT.getType().equals("Tops" ))
		{
				for(int i = 0; i < Clothes.length; i ++) 
				{
					if(Clothes[2][i]==(aT))
					{
					Clothes[2][i] = null;
					break;
					}
					
				}
			}
		if(aT.getType().equals("Bottoms"))
		{
				for(int i = 0; i < Clothes.length; i ++) 
				{
					if(Clothes[3][i]==(aT)) {
					Clothes[3][i] = null;
					break;
					}
					
				}
			}
		if(aT.getType().equals("Capes" ))
		{
				for(int i = 0; i < Clothes.length; i ++) 
				{
					if(Clothes[4][i]==(aT)) 
					{
					Clothes[4][i] = null;
					break;
					}
					
				}
			}
		}
		
			
		
	
		
	

	public void Print() // Method to print Final 2D Array
	{
		for(int i = 0; i < Clothes.length; i++){
			for(int  j = 0; j < Clothes.length; j++) {
				System.out.print(Clothes[i][j] + "\t") ;	
			}
			System.out.println("\n");
		}
	}
}