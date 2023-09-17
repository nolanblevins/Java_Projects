/*
 * Nolan Blevins
 * February 16 2022
 * CSCE 146
 * Video Game DataBase
 */
public class GenLL <T>
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
	private ListNode current;
	private ListNode previous;
	private int size;
	
	public GenLL()
	{
		head = current = previous = null;
		this.size = 0;
	}
	public void add(T aData) // adds new node to generic linked list
	{
		ListNode newNode = new ListNode(aData, null);
		if(head == null)
		{
			head = current = newNode;
			this.size = 1;
			return;
		}
		else
		{
			ListNode temp = head;
			while(temp.link != null)
			{
				temp = temp.link;
			}
			temp.link = newNode;
			this.size++;
		}
				
	}
	public void print() // prints all nodes in linked list
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	public void addAfterCurrent(T aData) // adds node after current node in linked list
	{
		if(current == null)
		{
			return;
		}
		else
		{
			ListNode newNode = new ListNode(aData, current.link);
			current.link = newNode;
			this.size++;
		}
	}
	public T getCurrent() // returns current node
	{
		if(current == null)
		{
			return null;
		}
		else
		{
			return current.data;
		}
	}
	public void setCurrent(T aData) // sets current nodes data value
	{
		if(aData == null || current == null)
		{
			return;
		}
		else
		{
			current.data = aData;
		}
	}
	public void goToNext() // moves pointer to next node
	{
		if(current == null)
		{
			return;
		}
		else
		{
		previous = current;
		current = current.link;
		}
	}
	public void reset() // moves pointer to start of linked list
	{
		current = head;
		previous = null;
	}
	public boolean hasMore() // returns true if current node has values
	{
		return current != null;
	}
	public void removeCurrent() // removes current node
	{
		if(current == head)
		{
			head = head.link;
			current = head;
		}
		else
		{
			previous.link = current.link;
			current = current.link;
		}
		if(this.size > 0)
			size--;
	}
	public int getSize() // returns size of linked list
	{
		return this.size;
	}
	
	
	

	


}
