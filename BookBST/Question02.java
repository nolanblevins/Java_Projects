
/*
 * <<Nolan Blevins>>
 * CSCE 146 S2022 Exam02 Question02
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
public class Question02 
{
	public class Node //public for testing purposes
	{
		private Book data;
		private Node leftChild;
		private Node rightChild;
		public Node(Book aData)
		{
			this.data = aData;
			this.leftChild = null;
			this.rightChild = null;
		}
	}
	public Node root; //public for testing purposes
	public void add(Book aData)
	{
//-----------------------------
		if(root == null) // if the root is null make root the data 
		root = new Node (aData);
	else
		add(root,aData); // call other add method

	}//Do not alter this
	

//Do not alter-----------------------------------------------------------------------	
	public Book getBookWithMostWords()
	{
//-----------------------------------------------------------------------------------
		// traverse down tree to the right
		Node current = root;
		while(current.rightChild != null)
			current = current.rightChild;
		return current.data; // return last node
		

	}//Do not alter this
	
	
	//Write additional methods or properties here
	private Node add(Node aNode, Book aData)
	{
		if(aNode == null)
			aNode = new Node(aData); // if root is null add
		// Left Branch
		else if(aData.getWordCount() <= (aNode.data.getWordCount())) // if the data new node is less than root left
			aNode.leftChild = add(aNode.leftChild,aData); // adds node to left
		// Right Branch
		else if(aData.getWordCount() >= (aNode.data.getWordCount())) // if new node is larger than root right
			aNode.rightChild = add(aNode.rightChild,aData); // adds node to right
		
		return aNode;
	}
	//--------------------------------------------------------------------------------
//Do not alter------------------------------------------------------------------------
	public void printPreorder()
	{
		printPreorder(root);
	}
	private void printPreorder(Node aNode)
	{
		if(aNode == null)
		{
			System.out.print("leaf, ");
			return;
		}
		System.out.print(aNode.data+", ");
		printPreorder(aNode.leftChild);
		printPreorder(aNode.rightChild);
	}
//-----------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void main(String[] args)
	{
		System.out.println("Adding books to book tree");
		Book[] books = {new Book(800),
				new Book(600),
				new Book(400),
				new Book(200),
				new Book(100),
				new Book(700),
				new Book(500),
				new Book(3000)};
		Question02 tree = new Question02();
		for(Book b: books)
			tree.add(b);
		System.out.println("Printing the preorder traversal of books");
		tree.printPreorder();
		
		System.out.println("\nThe book with the most words is: "+tree.getBookWithMostWords());

	}
	//--------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * for the add method I made the new node the root if the root is null. If the root isnt null I compared the nodes based on word count
 * and then traversed the tree and added the node based on if the current node being added is smaller or larger. If the node is smaller it moves
 * left and larger moves right.
 * 
 * For the most words method I just traversed all the way down the right side of the tree and returned the last node.
 */
