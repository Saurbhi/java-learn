package org.dodu.simplell;

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
		myList.insertNodes(new ArrayList<Integer>(Arrays.asList(7, 8, 10)));
		myList.printList();
	}

}
