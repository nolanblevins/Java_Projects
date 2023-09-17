/*
 * <<Nolan Blevins>>
 * CSCE 146 Exam01 Question01
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
public class Question01 {

//-----------------------------------------------------------------------------------	
	//Write your method here
	public static boolean largerComponents(int arr1[], int arr2[])
	{
		boolean larger = false;
		if(arr1.length == arr2.length) // verifying arrays are same size
		{
			for(int i = 0; i < arr1.length; i++) // for loop to iterate the same number of times as array size
			{
				if(arr1[i] > arr2[i]) // if the value in array 1 index i is larger than array 2 index i
				{
					larger = true; // larger is true
					
				}
				if(arr1[i] <= arr2[i]) // if the value in array 1 index i is less than than array 2 index i
				{
					larger = false; // larger is false
					break; // break because as soon as one is false the method should automatically return false
					
				}
			}
		}
		else
		{
			return false; // if the arrays are different sizes automatically return false
		}
		return larger; // return whether array 1 is larger than array 2
	}
				
	//Write any additional helper properties or methods here
	
	//--------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void main(String[] args)
	{

		int[] test01 = {4,6,3};
		int[] test02 = {3,5,8};

		System.out.println(largerComponents(test01,test02));
	}
	//--------------------------------------------------------------------------------
}//Do not alter this