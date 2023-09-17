

/*
 * <<Nolan Blevins>>
 * CSCE 146 Exam01 Question03
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 * Testing is encouraged but remove all testing code before turning it in.
 */
//Do not alter-----------------------------------------------------------------------
public class Question03 
{
	public class ListNode//public for testing purposes
	{
		public int data;//public for testing purposes
		public ListNode link;//public for testing purposes
		public ListNode(int aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	public ListNode head;//public for testing purposes
//-----------------------------------------------------------------------------------
	//Write your method here

	public int getMinValue()
	{
		if(head == null) // if Linked List is empty it returns 0
		{
			return 0;
		}
		reset(); // pointer at head of linked list
		int min = getCurrent(); // Initializes minimum value to head
		while(hasMore()) // while there is more nodes while loop runs
		{
			
			if(getCurrent() < min) // compares current node data to min, and if current node data is less than the current min, set current node data to min
			{
				min = getCurrent(); // sets current node data to min
			}
			gotoNext(); // moves pointer to next node
		}
		return min; // returns minimum value
	}
	//Write additional methods or properties here
	public ListNode current;
	public ListNode previous;
	
	
	public Question03()
	{
		head = current = previous = null;
	}
	public int getCurrent() // retrieves current nodes data
	{
		if(current == null) // if node has no data
		{
			return 0; // returns 0
		}
		return current.data; // returns current node data
	}
	public void gotoNext() // moves pointer to next node
	{
		if(current == null) // if the current node is null
			return;
		previous = current; // set previous to the current
		current = current.link; // set current pointer to next node
		
	}
	public boolean hasMore() // if the Linked List has more nodes returns true
	{
		return current != null;
	}
	public void reset() // moves pointer to head
	{
		current = head;
		previous = null;
	}
	//--------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void main(String[] args)
	{
		//Example
		Question03 intLL = new Question03();
		
		intLL.head = intLL.new ListNode(3000, 
							intLL.new ListNode(900, 
									intLL.new ListNode(80,
											intLL.new ListNode(10,
													intLL.new ListNode(200,null)))));
													
		int min = intLL.getMinValue();
		System.out.println(min);
	}
	//--------------------------------------------------------------------------------
}//Do not alter this