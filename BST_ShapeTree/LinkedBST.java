
/*
 * Nolan Blevins
 * CSCE 146 HW #5 Shape Tree
 * March 31 2022
 */
public class LinkedBST<T extends Comparable<T>> {

	private class Node {
		T data;
		Node leftChild;
		Node rightChild;

		public Node(T aData) {
			data = aData;
			leftChild = rightChild = null;
		}
	}

	private Node root;

	// initializing BST
	public LinkedBST() {
		root = null;
	}

	// adds node to tree
	public void add(T aData) {
		if (root == null)
			root = new Node(aData);
		else
			add(root, aData);
	}

	// Compares Nodes then Adds based on data
	private Node add(Node aNode, T aData) {
		if (aNode == null)
			aNode = new Node(aData);
		// Left Branch
		else if (aData.compareTo(aNode.data) < 0)
			aNode.leftChild = add(aNode.leftChild, aData);
		// Right Branch
		else if (aData.compareTo(aNode.data) > 0)
			aNode.rightChild = add(aNode.rightChild, aData);

		return aNode;
	}

	// searches for node in tree
	public boolean search(T aData) {
		return search(root, aData);
	}

	// searches based on comparison of data
	private boolean search(Node aNode, T aData) {
		if (aNode == null)
			return false;
		else if (aData.compareTo(aNode.data) < 0) // left
			return search(aNode.leftChild, aData);
		else if (aData.compareTo(aNode.data) > 0) // right
			return search(aNode.rightChild, aData);
		else
			return true;
	}

	// removes node from tree
	public void remove(T aData) {
		root = remove(root, aData);
	}

	// removes node based on data comparison
	private Node remove(Node aNode, T aData) {
		if (aNode == null)
			return null;
		else if (aData.compareTo(aNode.data) < 0)
			aNode.leftChild = remove(aNode.leftChild, aData);
		else if (aData.compareTo(aNode.data) > 0)
			aNode.rightChild = remove(aNode.rightChild, aData);

		else {
			if (aNode.rightChild == null)
				return aNode.leftChild;
			else if (aNode.leftChild == null)
				return aNode.rightChild;
			Node temp = findMin(aNode.rightChild);
			aNode.data = temp.data;
			aNode.rightChild = remove(aNode.rightChild, temp.data);
		}
		return aNode;

	}

	// finds minimum node
	private Node findMin(Node aNode) {
		if (aNode == null)
			return null;
		else if (aNode.leftChild == null)
			return aNode;
		else
			return findMin(aNode.leftChild);
	}

	public T findMax() {
		Node current = root;
		while (current.rightChild != null)
			current = current.rightChild;
		return current.data;
	}
	/*
	 * public void removeGreater(T aData)
	 * {
	 * root = removeGreater(root,aData);
	 * }
	 * private Node removeGreater(Node aNode, T aData)
	 * {
	 * if(aNode == null)
	 * return null;
	 * else if(aData.compareTo(aNode.data))
	 * 
	 * 
	 * 
	 * }
	 */

	/*
	 * Pass by left
	 */

	private T returnNode(T aData) {
		return aData;
	}

	public void returnBST() {
		returnBST(root);
	}

	private void returnBST(Node aNode) {
		if (aNode == null)
			return;
		returnNode(aNode.data); // process
		returnBST(aNode.leftChild); // left
		returnBST(aNode.rightChild); // right
	}

	public void printPreorder() {
		printPreorder(root);
	}

	private void printPreorder(Node aNode) {
		if (aNode == null)
			return;
		System.out.println(aNode.data); // process
		printPreorder(aNode.leftChild); // left
		printPreorder(aNode.rightChild); // right
	}

	/*
	 * Pass Underneath
	 */
	public void printInorder() {
		printInorder(root);
	}

	private void printInorder(Node aNode) {
		if (aNode == null)
			return;
		printInorder(aNode.leftChild); // left
		System.out.println(aNode.data); // process
		printInorder(aNode.rightChild); // right
	}

	/*
	 * Pass by right
	 */
	public void printPostorder() {
		printPostorder(root);
	}

	private void printPostorder(Node aNode) {
		if (aNode == null)
			return;
		printPostorder(aNode.leftChild); // left
		printPostorder(aNode.rightChild); // right
		System.out.println(aNode.data); // process

	}

}
