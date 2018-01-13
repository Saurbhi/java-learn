package org.dodu.ll;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Class Main.
 */
public class Main {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		
		myList.insertNode(3);
		myList.insertNode(3);
		myList.insertNode(4);
		myList.insertNode(5);
		myList.insertNode(3);
		myList.deleteNode(4);
		myList.deleteNode(3);
		myList.insertNodes(new ArrayList<Integer>(Arrays.asList(7, 8, 10)));
		myList.printList();
		myList.deleteNode(5);
		myList.printList();
		myList.deleteNode(7);
		myList.printList();
		myList.deleteNode(8);
		myList.printList();
		myList.deleteNode(10);
		myList.printList();
	}

}
