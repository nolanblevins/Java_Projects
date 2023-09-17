/*
 * Nolan Blevins
*/

//Scanner
import java.util.Scanner; 

public class CoinMachine {
public static void main(String[] args) {

Scanner keyboard = new Scanner(System.in); //defining scanner
System.out.println("Enter a whole number from 1 to 99. The machine will determine a combination of coins.");
// Variables
int cents = keyboard.nextInt();
int quarters = cents / 25; //integer for quarters
int cents2 = cents % 25; //integer to divide dimes
int dimes = cents2 / 10; //integer for dime
int cents3 = cents2 % 10; //integer to divide for nickels
int nickels = cents3 / 5; //integer for nickels
int cents4 = cents3 % 5; //integer to divide for pennies
int pennies = cents4; //integer for pennies

//Printing values
System.out.println(cents +" cents in coins");
System.out.println(quarters +" quarters");
System.out.println(dimes +" dimes");
System.out.println(nickels +" nickles");
System.out.println(pennies +" pennies");





}
}
