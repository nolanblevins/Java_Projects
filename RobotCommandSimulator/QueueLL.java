/*
 * Nolan Blevins
 * March 16 2022
 * CSCE 146
 * Robot Command Simulator
 */

public class QueueLL <T> implements QueueI<T> 
{
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
	// variables
	private ListNode head;
	private ListNode tail;
	private int size;
	
	public QueueLL()
	{
		head = tail = null;
	}
	// adds val to LL
	public void enqueue(T aData) 
	{
		ListNode newNode = new ListNode(aData,null);
		if(head == null)
		{
			head = tail = newNode;
			size = 1;
			return;
		}
		tail.link = newNode;
		tail = tail.link;
		size++;
		
	}
	// removes val from LL
	public T dequeue() 
	{
		if(head == null)
			return null;
		T ret = head.data;
		head = head.link;
		size --;
		return ret;
	}
	public void reset()
	{
		while(head != null)
		{
			dequeue();
		}
	}

	// returns head
	public T peek() 
	{
		if(head == null)
			return null;
		return head.data;
	}

	// prints list
	public void print() 
	{
		for(ListNode temp = head; temp != null; temp = temp.link)
			System.out.println(temp.data);
	}
	// returns Q size
	public int size() 
	{
		return this.size;
	}

}
