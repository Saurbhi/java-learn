package org.dodu.simplell;

/**
 * The Class Node.
 * Encapsulate the data for LinkedList.
 */
class Node {
	int data;
	Node nextNode;
	
	public Node(int data){
		this.data = data;
		this.nextNode = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}
