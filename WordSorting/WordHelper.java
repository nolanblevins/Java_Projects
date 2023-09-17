// Nolan Blevins
// February 1st 2022
// CSCE 146 Word Helper Lab 01

public class WordHelper {
	
	static String[] sortByLength(String[] Words)
	{

		for (int i = 1; i < Words.length; i++) // for loop to run same num of times as num of words in the list
		{
			String temp = Words[i];
			int x = i - 1;
			while (x >= 0 && temp.length() < Words[x].length()) // selection sort based on length of string
			{
				Words[x+1] = Words[x];
				x--;
			}
			Words[x+1] = temp;
		}
		return Words;
	}
	static boolean isVowel(char Vowel) // boolean method to return true if the letter is a vowel
	{
		return (Vowel == 'a' || Vowel == 'i' || Vowel == 'e' || Vowel == 'o' || Vowel == 'u' || Vowel == 'y');
	}
	static boolean isConsonant(char Cons) // boolean method to return false if letter is a vowel and true if it is not
	{
		if (Cons == 'a' || Cons == 'i' || Cons == 'e' || Cons == 'o' || Cons ==  'u' || Cons == 'y')
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
	static int numOfVowels(String numOfVowels) // method to count number of vowels in each index
	{
		int vCount = 0;
		for (int i = 0; i < numOfVowels.length(); i++)
		{
			if(isVowel(numOfVowels.charAt(i)))
			{
				vCount ++; // increases count for each vowel
			}
		}
		return vCount;
	}
	static int numOfCons(String numOfCons) // method to count number of consonants in each index
	{
		int cCount = 0;
		for (int i = 0; i < numOfCons.length(); i++)
		{
			if(isConsonant(numOfCons.charAt(i)))
			{
				cCount ++; // increases count for each consonant
			}
		}
		return cCount;
	}
	
	static String[] sortByConsonants(String[] Words) // bubble sort based on num of consonants
	{
		
		
			boolean hasSwapped = true;
			while(hasSwapped)
			{
				hasSwapped = false;
				for(int i = 0; i < Words.length - 1; i ++)
				{
					if(numOfCons(Words[i]) > numOfCons(Words[i+1])) //if current index has more consonants than the next swap swap values in index
					{
						//swap
						String temp = Words[i];
						Words[i] = Words[i+1];
						Words[i+1] = temp;
						hasSwapped = true;
					}// end of if
				}// end of for
			}// end of while
		
		return Words;
	}
	
	static String[] sortByVowels(String[] Words) // bubble sort based on num of vowels
	{
		
		
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int i = 0; i < Words.length - 1; i ++)
			{
				if(numOfVowels(Words[i]) > numOfVowels(Words[i+1])) // if current index has more vowels than the next swap values in index
				{
					//swap
					String temp = Words[i];
					Words[i] = Words[i+1];
					Words[i+1] = temp;
					hasSwapped = true;
				}// end of if
			}// end of for
		}// end of while
	
	return Words;
}
	
}

	