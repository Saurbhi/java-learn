package org.dodu.ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * The Class LinkedList. Holds the list of Nodes.
 */
class LinkedList {
	private ArrayList<Node> newList;

	/** The head. Which may or may not be present */
	protected Optional<Node> head;

	public LinkedList() {
		this.newList = new ArrayList<>();
		// Declaring that we don't have a head for an empty list
		this.head = Optional.empty();
	}

	public Optional<Node> getHead() {
		return head;
	}

	public Optional<Node> getLastNode() {
		// We may have a last node if our list is like 1 -> 2 -> X or 1 -> X
		// We have no last node if our list is X

		// then we definitely have a next node
		if (head.isPresent()) {
			Node tempNode = head.get();
			while (tempNode.nextNode.isPresent()) {
				tempNode = tempNode.nextNode.get();
			}
			return Optional.of(tempNode);
		}
		// else we declare that we don't have a last node at all. No null
		return Optional.empty();
	}

	public void insertNode(int data) {
		Node newNode = new Node(data);

		if (head.isPresent()) {
			getLastNode().ifPresent(lastNode -> {
				lastNode.nextNode = Optional.of(newNode);
			});
		}
		else {
			this.head = Optional.of(newNode);
		}
		this.newList.add(newNode);
	}

	public void insertNodes(ArrayList<Integer> dataList) {
		dataList.forEach(data -> insertNode(data));
	}

	public void deleteNode(int data) {
		if (head.isPresent() ) {
			while (head.get().data == data) {
				if(head.get().nextNode.isPresent()) {
					head = head.get().nextNode;
				} else {
					head = Optional.empty();
					return;
				}
			}
			Optional<Node> tempNode = head;
			while (tempNode.get().nextNode.isPresent()) {
				if (tempNode.get().nextNode.get().data == data) {
					tempNode.get().nextNode = tempNode.get().nextNode.get().nextNode;
				}
				if (tempNode.get().nextNode.isPresent())
					tempNode = tempNode.get().nextNode;
			}
			if (tempNode.get().data == data) {
				Node tempNode2 = head.get();
				while (tempNode2.nextNode != tempNode) {
					tempNode2 = tempNode2.nextNode.get();
				}
				tempNode2.nextNode = null;
			}
	
		} else {
			System.out.println("This list is empty");
		}
	}

	public void printList() {
		if (head.isPresent()) {
			Optional<Node> tempNode = head;
			System.out.println("This List Contains Following Data ");
			while (tempNode.isPresent()) {
				System.out.print(tempNode.get().data + " -> ");
				tempNode = tempNode.get().nextNode;
			}
			System.out.println("X");
		}
		else 
			System.out.println("This list is empty");
		}
}