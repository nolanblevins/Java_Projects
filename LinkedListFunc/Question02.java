/*
 * <<Nolan Blevins>>
 * CSCE 146 Exam01 Question02
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 * Testing is encouraged but remove all testing code before turning it in.
 */
//Do not alter-----------------------------------------------------------------------
public class Question02 
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
	public void insertDoubles()
	{
		reset(); // Resets to head of Linked List
		while(hasMore()) // while loop until no more nodes
		{
			int cData = getCurrent(); // retrieving current nodes data
			int doubData = timesTwo(cData); // multiplies current nodes value by 2
			addAfterCurrent(doubData); // adds doubled node after current node
			gotoNext(); // 2 go to next so i can pass over newly added node
			gotoNext();
		}
		
	}
	//Write additional methods or properties here
	public ListNode current;
	public ListNode previous;
	
	public Question02()
	{
		head = current = previous = null;
	}
	public int timesTwo(int aData) // multiplies input by 2 and returns doubled input
	{
		int Double = aData * 2; // doubles passed value
		return Double; // returns doubled value
	}
	public void addAfterCurrent(int aData) // adds node after current node
	{
		if(current == null) // check to see if current node is null
			return;
		ListNode newNode = new ListNode(aData, current.link); // creating node
		current.link = newNode; // setting new node to next node after current
	}
	public int getCurrent()
	{
		if(current == null) // check if current node is null
		{
			return 0;
		}
		return current.data; // returns the data from the current node
	}
	public void gotoNext() // moves pointer to next node
	{
		if(current == null) // checks if current is null
			return;
		previous = current;
		current = current.link;
		
	}
	public boolean hasMore() // checks to see if current node is null
	{
		return current != null;
	}
	public void reset() // moves pointer back to the head
	{
		current = head;
		previous = null;
	}
	
			
	//--------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void main(String[] args)
	{
		//Example
		Question02 intLL = new Question02();
		intLL.head = intLL.new ListNode(0, 
							intLL.new ListNode(5, 
									intLL.new ListNode(3,
											intLL.new ListNode(9,
													intLL.new ListNode(44,null)))));
		intLL.insertDoubles();
		//Printing Results
		for(Question02.ListNode temp = intLL.head;temp != null; temp = temp.link)
			System.out.println(temp.data);
	}
	//--------------------------------------------------------------------------------
}//Do not alter this
