/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * November 4 2021
 * CSCE 145
 *  String Helper
 */


public class StringHelperTester {

	public static void main(String[] args) {
		// unique char test
		System.out.println("----------------------------------------");
		System.out.println("Testing hasAllUniqueCharacters Method: ");
		System.out.println("----------------------------------------");
		System.out.println("Testing if the String 'Nolan' has all unique characters: ");
		System.out.print(StringHelper.hasAllUniqueCharacters("nolan"));
		System.out.println("\n ");
		System.out.println("Testing if the String 'dog' has all unique characters: ");
		System.out.print(StringHelper.hasAllUniqueCharacters("dog"));
		// meshStrings test
		System.out.println("\n ");
		System.out.println("----------------------------------------");
		System.out.println("Testing meshStrings method:");
		System.out.println("----------------------------------------");
		System.out.println("Testing meshStrings method with 'nolan' and 'nolan' ");
		System.out.print(StringHelper.meshStrings("nolan" , "nolan"));
		System.out.println("\n ");
		System.out.println("Testing meshStrings method with 'blevins' and 'nolan' ");
		System.out.print(StringHelper.meshStrings("blevins" , "nolan"));
		// vowel replace test
		System.out.println("\n ");
		System.out.println("----------------------------------------");
		System.out.println("Testing replaceVowelsWithOodle method:");
		System.out.println("----------------------------------------");
		System.out.println("Testing replaceVowelsWithOodle method on String 'dog' ");
		System.out.println(StringHelper.replaceVowelsWithOodle("dog"));
		System.out.println("");
		System.out.println("Testing replaceVowelsWithOodle method on String 'banana' ");
		System.out.println(StringHelper.replaceVowelsWithOodle("banana"));
		// weight test
		System.out.println("\n ");
		System.out.println("----------------------------------------");
		System.out.println("Testing weight method:");
		System.out.println("----------------------------------------");
		System.out.println("Testing weight method on String 'heavy' ");
		System.out.println(StringHelper.weight("heavy") + " kg");
		System.out.println("Testing weight method on String 'light' ");
		System.out.println(StringHelper.weight("light") + " kg");


	}

}
