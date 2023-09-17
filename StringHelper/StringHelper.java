/*
 * Nolan Blevins
 * NBlevins@email.sc.edu
 * November 4 2021
 * CSCE 145
 *  String Helper
 */


public class StringHelper {


public static boolean hasAllUniqueCharacters(String aS) // method to check for unique characters
{
	for (int j = 0; j < aS.length(); j++) {
		for (int k = j +1 ; k < aS.length(); k++) {
			if(aS.charAt(j) == aS.charAt(k)) {
				return false;
			}
		}
	}
	return true;

}
public static String meshStrings(String aS1, String aS2) // combines strings interchangeably
{
	String l = "";
	for (int j = 0; j < aS1.length() || j < aS2.length(); j++) {
		if (j < aS1.length()) {
			l += (aS1.charAt(j));
		}
		if(j < aS2.length()) {
			l += (aS2.charAt(j));
		}
	}
	
	return l;
	
}
public static String replaceVowelsWithOodle(String aS) // replace vowels with oodle
{
	/*
	for (int j = 0; j < aS.length(); j++) {
		char let = aS.charAt(j);
		
	if(let == 'a' || let == 'A' || let == 'e' || let == 'E' || let == 'i' || let == 'I' || let == 'O'|| let == 'o' || let == 'u' || let == 'U' )
	{
		let = 'g';
	}
	}
	*/
	return aS.replaceAll("[AaEeIiOoUu]", "oodle");
}
public static double weight(String aS) // calcs weight of string
{
	double aW = 0;
	for (int j = 0; j < aS.length(); j++) {
		char let = aS.charAt(j);
		if(let == 'a' || let == 'A' || let == 'e' || let == 'E' || let == 'i' || let == 'I' || let == 'O'|| let == 'o' || let == 'u' || let == 'U' )
		{
			aW += 2.5;
		}
		else {
			aW += 3.4;
		}
	}
	return aW;
	
}
}