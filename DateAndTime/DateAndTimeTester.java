

/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * October 21 2021
 * CSCE 145
 * Date and Time Tester
 */

import java.util.Scanner;
public class DateAndTimeTester {
	// decalring variables
		private int Month; 
		private int Day;
		private double Hour;
		private double Minute;
	public DateAndTimeTester()
	{
		this.Month = 01;
		this.Day = 01;
		this.Hour = 01;
		this.Minute = 01;
		
	}
	public DateAndTimeTester(int aM, int aD, double aH, double am)
	{
		this.isValidDate(aM, aD);
		this.isValidTime(aH, am);
	}

	public void run() // runs code through driver
	{
		boolean runAgain = true;
		while(runAgain) { // while loop to run again
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter a date (month/day) to determine if it is valid");
		String date = keyboard.nextLine();
		String arr[] = date.split("/"); // splits date
		this.Month = Integer.parseInt(arr[0]);
		this.Day = Integer.parseInt(arr[1]);
		System.out.println("enter a time (hour:minute) to determine if it is valid");
		String time =keyboard.nextLine();
		String arr2[] = time.split(":"); // splits time
		this.Hour = Integer.parseInt(arr2[0]);
		this.Minute = Integer.parseInt(arr2[1]);
		
		if(isValid())
		{
			System.out.println("that is a valid date");
		}
		else {
			System.out.println("that is an invalid date");
		}
		System.out.println("would you like to test another time (yes) or (no)");
		String replay = keyboard.next();
		if (replay.equalsIgnoreCase("no"))
		{
			runAgain = false;
			System.out.println("thank you for using Nolan Blevins date and time tester");
			
		}
		else;
	}
	} // end of while loop
	public boolean isValid()
	{
		if(isValidDate(Month, Day) && isValidTime(Hour, Minute)) // dertermines if the overall date and time is valid
			return true;
		else {
		return false;
		}
		
	}
	public boolean isValidDate(int aM, int aD) // determines if date is valid
	{
		 if (getMonth() == 1||getMonth() == 10 || getMonth() == 3 || getMonth() == 5 || getMonth() == 7 || getMonth() == 8 || getMonth() == 12 & getDay() > 31) 
	{
			return false;
	}
		 else if ( getMonth() == 4 || getMonth() == 5 || getMonth() ==  9 ||  getMonth() == 11 && getDay() > 30) 
	{
			return false;
	}
		 else if (getMonth() > 12)
	{
			 return false;
	}
		 else {
			 return true;
	}
	}
	public boolean isValidTime(double aH, double am) // determines if time is valid
	{ 
		if (getHour() > 12 || getHour() < 1 && getMinute() > 60 || getMinute() <1)
		{
			return false;
		}
		else {
			return true;
		}
	}
	public int getMonth() // gets month value
	{
		return this.Month;
	}
	public int getDay() // gets day value
	{
		return this.Day;
	}
	public double getHour() // gets hour value
	{
		return this.Hour;
	}
	public double getMinute() // gets minute value
	{
		return this.Minute;
	}
}
