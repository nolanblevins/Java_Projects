/*
 * <Nolan Blevins>>
 * CSCE 146 S2022 Exam02 Question01
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
public class Question01 {

	public static void sort(PepperoniPizza[] pizzas)
	{
//-----------------------------------------------------------------------------------	
		int size = pizzas.length; // size of passed array
		if(size < 2)
			return;
		int mid = size/2; // split size in two
		int leftSize = mid; // left is half of size or mid
		int rightSize = size - mid; // right is total minus half
		PepperoniPizza[] left = new PepperoniPizza[leftSize]; // temp array
		PepperoniPizza L = new PepperoniPizza(0); 
		PepperoniPizza R = new PepperoniPizza(0);
		PepperoniPizza[] right = new PepperoniPizza[rightSize]; // temp array
		for(int i = 0; i < mid; i++) // fills left array
		{
			L = pizzas[i];
			left[i] = L;
		}
		for(int i = mid; i < size; i++) // fills right array
		{
			R = pizzas[i];
			right[i - mid] = R;
		}
		sort(left); // recursively calls mergeSort to continue dividing
		sort(right); // recursively calls mergeSort to continue dividing
		merge(left,right,pizzas); // merges right, left and a

	}//Do not alter this
	//Write any additional helper properties or methods here
	public static void merge(PepperoniPizza[] left, PepperoniPizza [] right, PepperoniPizza[] a)
	{
		int leftSize = left.length; // finding left array size
		int rightSize = right.length; // finding right array size
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < leftSize && j < rightSize) // as long as two arrays have values we compare the two arrays number of sort values and then add the smaller value to the array
		{
			if(left[i].getPepperonis() >= right[j].getPepperonis())
			{
				a[k] = left[i]; // if left is larger add to array
				i++;
				k++;
			}
			else
			{
				a[k] = right[j]; // if right is larger add to array
				j++;
				k++;
			}
		}
		while(i<leftSize)  // add leftover
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while(j<rightSize) // add leftover
		{
			a[k] = right[j];
			j++;
			k++;
		}
		
	}

	
	//--------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void main(String[] args)
	{
		PepperoniPizza[] array = {new PepperoniPizza(10),
				new PepperoniPizza(5),
				new PepperoniPizza(3),
				new PepperoniPizza(1),
				new PepperoniPizza(8),
				new PepperoniPizza(6)};
		sort(array);
		for(PepperoniPizza w : array)
			System.out.println(w);
	}
	//--------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 *  I used a merge sort method in order to create a sorting algorithm of 0(nlogn) complexity. A merge sort works by dividing and conquering. Essentially it takes a structure a divides it then recursively comparing
 *  the items in the structure. It then merges the left and right side back together while putting the items back in the data structure in a sorted fashion.
 */