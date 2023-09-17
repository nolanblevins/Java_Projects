import Question03.ListNode;

public class intLL 
{
	private class ListNode 
	{
		int data;
		ListNode link;
		public ListNode(int aData, ListNode aLink) 
		{
			data = aData;
		    link = aLink;
		  }
		}
		private ListNode head;//First element
		private ListNode current;//Current node of interest private ListNode previous;//One node behind current
		private ListNode previous;
		
		public intLL() 
		{
			head = current = previous = null; 
		}
		
		public void add(int aData) 
		{
			ListNode newNode = new ListNode(aData,null); 
			if(head == null)//Empty list
			{
				head = current = newNode;
				return; 
				}
				ListNode temp = head; 
				while(temp.link != null)
		            temp = temp.link;
		        temp.link = newNode;
		}
		public void addAfterCurrent(int aData) 
		{
			if(current == null) 
				return;
			ListNode newNode = new ListNode(aData,current.link);
		    current.link = newNode;
		}
		public void print() 
		{
			ListNode temp = head; 
			while(temp != null)
			{
				System.out.println(temp.data);
		        temp = temp.link;
			}
		}
		public int getCurrent() {
		if(current == null) return 0;
		return current.data;
		}
		public void setCurrent(int aData) {
		if(current == null) return;
		    current.data = aData;
		}
		public void gotoNext() {
		if(current != null) {
		        previous = current;
		        current = current.link;
		    }
		}
		public boolean hasMore() {
		return current != null; }
		public void reset() {
		    current = head;
		previous = null; }
		public void removeCurrent() {
		if(current != null && previous != null) {
		    previous.link = current.link;
		    current = current.link;
		}
		else if(current != null && previous == null) {
		    head = head.link;//current = current.link;
		    current = head;
		}
		}
		public void printAllValues()
		{
			ListNode temp = head;
			while(temp.link != null)
			{
				System.out.println(temp.data);
			}
		}
		public static void main(String[] args)
		{
			//Example
			intLL intLL = new intLL();
			
			intLL.head = intLL.new ListNode(1, 
								intLL.new ListNode(2, 
										intLL.new ListNode(3,
												intLL.new ListNode(4,
														intLL.new ListNode(4,null)))));
			intLL.printAllValues();
			
		}
}

