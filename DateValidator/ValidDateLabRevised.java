//Nolan Blevins

//Scanner
import java.util.Scanner;
public class ValidDateLabRevised
{
	static int monthN[] = {0,31,28,31,30,31,30,31,31,30,31,30,31}; // declaring each month not inc 0 because no 0 month
	static boolean isLeapYear(int yy) //leap year function checks to make sure the year isnt a leap year
	{
		if(yy % 400 == 0)
			return true;
		else if(yy % 100 == 0)
			return false;
		else
			return yy % 4 == 0;
	}
	static boolean isValidDate(int mm,int dd,int yy) //valid date function ensures that month is less than 12 and day and year are at least 1
	{
		if(dd < 1 || mm < 1 || yy < 1 || mm > 12)
			return false;
		else if (mm == 2 && isLeapYear(yy))
			return dd <= 29;
		else
			return dd <= monthN[mm];
	}
	public static void main(String[] args) {
		int ly = 0;
		int yy = 0, dd=0, mm=0;
		Scanner keyboard = new Scanner(System.in); //scanner define
		System.out.println("enter a date (month/day/year) to determine if it is valid");
		String date = keyboard.nextLine();
		String arr[] = date.split("/");
		mm = Integer.parseInt(arr[0]);
		dd = Integer.parseInt(arr[1]);
		yy = Integer.parseInt(arr[2]);
		if(isLeapYear(yy)) {
			ly = 1;}
		else{
			ly = 0;
		}
		if(ly == 1 && mm == 2 & dd > 29) {
				System.out.println("that is not a valid day for this month");
		}
		else;
		
		if (ly == 0 && mm == 2 && dd > 28) {
				System.out.println("that is not a valid day for this month");
		}
		else if (mm == 1||mm == 10 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 12 & dd > 31) {
				System.out.println("thats is not a valid day for this month");
		}
		else if ( mm == 4 || mm == 5 || mm ==  9 ||  mm == 11 && dd > 30) {
				System.out.println("that is not a valid day for this month");
		}
		else if (mm > 12) {
				System.out.println("that is not a valid month");
		}
		if
		(isValidDate(mm,dd,yy)) //final print statement
			System.out.println("That is a valid date");
	else
			System.out.println("That is an invalid date"); 
}
}

