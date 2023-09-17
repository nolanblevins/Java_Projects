/*
 * Nolan Blevins
 * CSCE 145 sec 17
 * September 27 2021
 * vowel counter
 */


import java.util.Arrays;
import java.util.Scanner;
public class VowelCounter {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter a phrase, sentence or string of characters and i will report how many vowels there are.");
		String input = keyboard.nextLine();
		int [] vc = new int [5]; // vc = vowel counter
		int [] vowel = new int [5];
		for(int i = 0; i < input.length(); i++) {
			char vowels = input.charAt(i);
			if (vowels == 'a' || vowels == 'A') {
				vc[0]++; vowel[0]++;
			} //end of initial if statement for a
			else if (vowels == 'e' || vowels == 'E') {
				vc[1]++; vowel[1]++;
			} //end of else if statement for e
			else if (vowels == 'i' || vowels == 'I') {
				vc[2]++; vowel[2]++;
			} //end of else if statement for i
			else if (vowels == 'o' || vowels == 'O') {
				vc[3]++; vowel[3]++;
			} //end of else if statement for o
			else if (vowels == 'u' || vowels == 'U') {
				vc[4]++; vowel[4]++;
			} //end of else if statement for u
		} // end of for loop
		
		Arrays.sort(vc);
		Arrays.sort(vowel);
 		for (int i = 0; i < vc.length; i++) {
			
			System.out.println("the vowels and their count " + vc[i]);
			
	
		}
		/*
		System.out.println("the vowels and their count");
		System.out.println("a = " + vc[0]);
		System.out.println("e = " + vc[1]);
		System.out.println("i = " + vc[2]);
		System.out.println("o = " + vc[3]);
		System.out.println("u = " + vc[4]);
		*/
} // end pub stat void
} // end of main class
