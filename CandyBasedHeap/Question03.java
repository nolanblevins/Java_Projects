/*
 * <<Nolan Blevins>>
 * CSCE 146 S2022 Exam01 Question03
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 */
//Do not alter------------------------------------------------------------------------
public class Question03 
{
	private Candy[] heap = new Candy[10];
	public int size;//First null element
		
	public void add(Candy aData)
	{
//------------------------------------------------------------------------------------	
		if(size <= 0)
			size = 0;
		if(size >= heap.length) // checking to make sure there is room
			return;
		heap[size] = aData; // assigning index to the data
		bubbleup();
		size++;

	}//Do not alter

//Do not alter------------------------------------------------------------------------	
	public Candy remove()
	{
//------------------------------------------------------------------------------------	
		// stores root data and then replaces last node data
		if(size == 0)
			return null;
		Candy ret = heap[0];
		heap[0] = heap[size-1]; // replace root
		heap[size-1] = null; // makes reference null
		size--;
		bubbledown(); // bubble down info
		return ret;
		
	}//Do not alter

	//Write any additional helper properties or methods here
	
	/* method continuously swaps data with parent data until the parent data is smaller or last index is reached
	 */
	public void bubbleup()
	{
		int index = size; // starting at last index
		while(index > 0 && heap[(index-1)/2].compareTo(heap[index])>0) // Examine if parent is greater than child
		{
			// swapping
			Candy temp = heap[(index-1)/2];
			heap[(index-1)/2]=heap[index]; // reassign parent wit current
			heap[index] = temp; // reassign index to temp value
			index=(index-1)/2; // updating where index is
		}
	}
	
	public void bubbledown()
	{
		int index = 0; // start at root
		while(index*2+1 < size) // in bounds of tree
		{
			int smallIndex = index*2+1;
			if(index*2+2 < size && heap[index*2+1].compareTo(heap[index*2+2])>0) // checking values of children
				smallIndex = index*2+2; // assign value to right child
			if(heap[index].compareTo(heap[smallIndex])>0) // checking which is smaller with current index
			{
				//swapping values
				Candy temp = heap[index];
				heap[index]=heap[smallIndex];
				heap[smallIndex]=temp;
			}
			else
				break;
			index=smallIndex; // reassigning index for bubbling
		}
	}
	//--------------------------------------------------------------------------------
//Do not alter------------------------------------------------------------------------

	public void printBreadthOrder()
	{
		for(Candy c : this.heap)
		{
			if(c != null)
				System.out.print(c+", ");
			else
				System.out.print("null, ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		System.out.println("Testing the Add Method");
		Candy[] array = {
				new Candy(100.0),
				new Candy(80.0),
				new Candy(60.0),
				new Candy(40.0),
				new Candy(20.0),
				new Candy(10.0),
				new Candy(30.0),
				new Candy(50.0),
				new Candy(70.0),
				new Candy(90.0)};
		Question03 heap = new Question03();
		for(Candy c : array)
			heap.add(c);
		heap.printBreadthOrder();
		
		System.out.println("Testing the Remove Method");
		for(int i=0;i<array.length;i++)
			System.out.print(heap.remove()+", ");
	}
	//--------------------------------------------------------------------------------

}//Do not alter
