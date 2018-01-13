package org.dodu.ll;

import java.util.Optional;

/**
 * The Class Node.
 * Encapsulate the data for LinkedList.
 */
class Node {
	Integer data;
	Optional<Node> nextNode;
	
	
	public Node() {
		super();
	}

	public Node(int data){
		this.data = data;
		this.nextNode = Optional.empty();
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}
