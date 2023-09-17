/*
 * Nolan Blevins
 * February 16th 2022
 * Process Queue Simulator
 * CSCE 146
 */
public class LLQueue <T> implements QueueI<T>
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
	private ListNode head;
	private ListNode tail;
	
	public LLQueue()
	{
		head = tail = null;
	}
	
	public void enqueue(T aData) // adds process to queue
	{
		ListNode newNode = new ListNode(aData,null);
		
		if(head == null)
		{
			head = tail = newNode;
			return;
		}
		tail.link = newNode;
		tail = tail.link;		
	}
	public T dequeue() // removes process from queue
	{
		if(head == null)
		{
			return null;
		}
		T ret = head.data;
		head = head.link;
		return ret;
	}
	public T peek() // returns the head of the queue
	{
		if(head == null)
		{
			return null;
		}
		return head.data;
	}
	public void print() // prints queue ll
	{
		for(ListNode temp = head; temp != null; temp = temp.link)
			System.out.println(temp.data);
	}

}
