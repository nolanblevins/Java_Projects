/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 25 2021
 * CSCE 145
 * PB&J
 */
public class PBJSandwich {
	// instance variables
	private Bread TopSlice;
	private PeanutButter PeanutButter;
	private Jelly Jelly;
	private Bread BottomSlice;

	public PBJSandwich(Bread TopSlice, PeanutButter PeanutButter, Jelly Jelly, Bread BottomSlice) {
		this.TopSlice = new Bread();
		this.PeanutButter = new PeanutButter();
		this.Jelly = new Jelly();
		this.BottomSlice = new Bread();
	}
	public Bread getTopSlice() //getter method
	{
		return this.TopSlice;
	}
	public void setTopSlice(String Name, int Calories, String Type) //setter method
	{
		 TopSlice.setCalories(Calories);
		 TopSlice.setName(Name);
		 TopSlice.setType(Type);
	}
	public PeanutButter getPeanutButter() //getter method
	{
		return this.PeanutButter;
		
	}
	public void setPeanutButter(String Name, int Calories, boolean IsCrunchy) //setter method
	{
		PeanutButter.setName(Name);
		PeanutButter.setCalories(Calories);
		PeanutButter.setIsCrunchy(IsCrunchy);
	}
	public Jelly getJelly()  //getter method
	{
		return this.Jelly;
	}
	public void setJelly(String Name, int Calories, String FT) //setter method
	{
		Jelly.setCalories(Calories);
		Jelly.setName(Name);
		Jelly.setFruitType(FT);
	}
	public Bread getBottomSlice() //getter method
	{
		return this.BottomSlice;
	}
	public void setBottomSlice(String Name, int Calories, String Type) //setter method
	{
		 BottomSlice.setCalories(Calories);
		 BottomSlice.setName(Name);
		 BottomSlice.setType(Type);
	}
	
	
		
		
	
}







/*
 * 
 * Bread TopSlice = new Bread();
		TopSlice.setName(null);
		TopSlice.setCalories(0);
		TopSlice.setType(null);
		PeanutButter PeanutButter = new PeanutButter();
		PeanutButter.setName(null);
		PeanutButter.setCalories(0);
		PeanutButter.setIsCrunchy(false);
		Jelly Jelly = new Jelly();
		Jelly.setName(null);
		Jelly.setFruitType(null);
		Jelly.setCalories(0);
		Bread BottomSlice = new Bread();
		BottomSlice.setName(null);
		BottomSlice.setCalories(0);
		BottomSlice.setType(null);
 * 
 * 
 */


