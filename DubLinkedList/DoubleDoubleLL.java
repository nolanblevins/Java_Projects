/*
 * Nolan Blevins
 * CSCE 146
 * Febuary 9 2022
 * Doubly Linked List
 */
public class DoubleDoubleLL 
{
	private class ListNode
	{
		double data;
		ListNode next;
		ListNode prev;
		
		public ListNode(double aData, ListNode nLink, ListNode pLink)
		{
			data = aData;
			next = nLink;
			prev = pLink;
		}
	}// end of private ListNode class
	private ListNode head; // first element
	private ListNode current; // current node
	private ListNode previous; // 1 node behind current
	private ListNode tail; // last element
	
	public DoubleDoubleLL()
	{
		head = current = previous = tail =  null; // linking structure
	}
	public void add(double aData) // adds
	{
		ListNode newNode = new ListNode(aData, null, null);
		if(head == null) // empty list
		{
			head = current = tail = newNode;
			head.prev = null;
			tail.next = null;
			return;
		}
		ListNode temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = newNode;
				
	}
	public void addAfterCurrent(double aData) // adds node after the current node
	{
		if(current == null)
		{
			return;
		}
		ListNode newNode = new ListNode(aData, current.next, current.prev);
		current.next = newNode;
	}
	public void print()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public double getCurrent() // returns current node data
	{
		if(current == null)
		{
			return 0;
		}
		return current.data;
	}
	public void setCurrent(double aData) // sets current node data
	{
		if(current == null)
		{
			return;
		}
		current.data = aData;
	}
	public void gotoNext() // moves current node to next node
	{
		if(current != null)
		{
			current = current.next;
		}
	}
	public void gotoPrev() // moves current node to previous node
	{
		if(current != null && previous != null)
		{
			current = current.prev;
		}
	}
	public boolean hasMore() //checks if the list contains more node after current
	{
		return current.next != null;
	}
	public void reset() // resets pointer
	{
		current = head;
		previous = null;
	}
	public boolean contains(double aData) // checks if data is in list in a node
	{
		ListNode current = head;
		if(head == null)
		{
			return false;
		}
		while(current != null)
		{
			if(current.data == aData)
			{
				return true;
				
						
			}
			current = current.next;
			
		}
		return false;
	}
	public void remove(ListNode aNode) // removes node matching data
	{
		ListNode current = head;
		if(head == null || aNode == null)
		{
			return;
		}
		if(head == aNode)
		{
			head = aNode.next;
		}
		if(aNode.next != null)
		{
			aNode.next.prev = aNode.prev;
		}
		if(aNode.prev != null)
		{
			aNode.prev.next = aNode.next;
		}
		aNode = null;
		
		
	}
	public void gotoEnd() // goes to last data entry
	{
		if(current != null)
		{
			current = tail;
		}
	}
	public void removeCurrent() //removes current node
	{
		if(current == head)
		{
			head = head.next;
			current = head;
		}
		else
		{
			current.prev = current;
			current = current.next;
		}
		
	}

}// end of public class
