package org.dodu.simplell;

import java.util.ArrayList;

/**
 * The Class LinkedList.
 * Holds the list of Nodes.
 */
class LinkedList {
	private ArrayList<Node> newList;
	protected Node head;
	
	public Node getHead() {
		return head;
	}

	public LinkedList() {
		this.newList = new ArrayList<>();
		this.head = null;
	}
	
	public Node getLastNode() {
		Node tempNode = head;
		while(tempNode.nextNode != null) {
			tempNode = tempNode.nextNode;
		}
		return tempNode;
	}
	
	public void insertNode(int data){
		Node newNode = new Node(data);
		if (this.head == null) {
			this.head = newNode;
		} else {
			Node tempNode = this.getLastNode();	
			tempNode.nextNode = newNode;
		}
		newList.add(newNode);
	}
	
	public void insertNodes(ArrayList<Integer> dataList) {
		dataList.forEach(data -> insertNode(data));
	}
	
	public void deleteNode(int data) {
		if(head == null) {
			System.out.println("This list is empty");
			return;
		}
		
		while(head.data == data) {
			head = head.nextNode;
		} 
		Node tempNode = head;
		while(tempNode.nextNode != null) {
			if(tempNode.nextNode.data == data) {
				tempNode.nextNode = tempNode.nextNode.nextNode;	
			}
			if(tempNode.nextNode != null)
				tempNode = tempNode.nextNode;
		}
		if(tempNode.data == data) {
			Node tempNode2 = head;
			while(tempNode2.nextNode != tempNode) {
				tempNode2 = tempNode2.nextNode;
			}	
			tempNode2.nextNode = null;
		}
		
	}

	public void printList() {
		if(head == null) {
			System.out.println("This list is empty");
		} else {
			Node tempNode = head;
			System.out.println("This List Contains Following Data ");
			while(tempNode != null) {
				System.out.print(tempNode.data + " -> ");
				tempNode = tempNode.nextNode;
			}
			System.out.println("X");
		}
	}
}