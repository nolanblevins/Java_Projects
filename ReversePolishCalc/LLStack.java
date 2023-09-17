/*
 * Nolan Blevins
 * March 16 2022
 * CSCE 146 Lab 04
 * Reverse Polish Calculator
 */
public class LLStack <T> implements StackI<T>
{
	public int size;
	
	private class ListNode
	{
		T data;
		ListNode link;
		public ListNode(T aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	private ListNode head;
	public LLStack()
	{
		head = null;
	}
	// pops all values off stack
	public void reset()
	{
		while(head != null)
		{
			pop();
		}
	}
	// pushes value onto stack
	public void push(T aData) 
	{
		ListNode newNode = new ListNode(aData,head);
		head = newNode;
		size++;
		return;

	}
	// pops value off of the stack
	public T pop() 
	{
		if(head == null)
		{
			return null;
		}
		T ret = head.data;
		head = head.link;
		size--;
		return ret;
	}

	// peek to return head data
	public T peek() 
	{
		if(head == null)
		{
			return null;
		}
		return head.data;
	}

	
	public void print() 
	{
		for(ListNode temp = head; temp != null; temp = temp.link)
			System.out.println(temp.data);
	}

	
	public int size() 
	{
		return this.size;
	}
	

}
