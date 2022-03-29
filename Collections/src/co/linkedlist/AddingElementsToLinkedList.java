/*
 * How to add elements to LinkedList?
 * --> We can add elements to LinkedList using add(),addFirst() and addLast() methods
 */

package co.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class AddingElementsToLinkedList {

	public static void main(String[] args) {

		// Creating LinkedList of String type
		// Generics --> To provide type safety
		LinkedList<String> linkedList = new LinkedList<>();

		// Adding elements to the LinkedList 
		linkedList.add("Watch");
		linkedList.add("Fan");
		linkedList.add("Window");
		linkedList.add("Cooler");

		System.out.println("Before using addFirst() & addLast(): " + linkedList);

		// Adding element at first position
		linkedList.addFirst("Mirror");
		System.out.println("Adding Mirror element at first position using addFirst(): " + linkedList);

		// Adding element at Last position
		linkedList.addLast("Wardrobe");
		System.out.println("Adding Wardrobe element at last position using addLast(): " + linkedList);

		// Displaying LinkedList object
		System.out.println("Elements: " + linkedList);

		// Iterating LinkedList i.e, link using advanced loop
		for (String llist : linkedList) {
			System.out.println(llist);
		}

		System.out.println("**********************");
		
		// Iterating LinkedList using while loop
		Iterator<String> it = linkedList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

// OUTPUT
/*
 * Before using addFirst() & addLast(): [Watch, Fan, Window, Cooler] Adding
 * Mirror element at first position using addFirst(): [Mirror, Watch, Fan,
 * Window, Cooler] Adding Wardrobe element at last position using addLast():
 * [Mirror, Watch, Fan, Window, Cooler, Wardrobe] Elements: [Mirror, Watch, Fan,
 * Window, Cooler, Wardrobe] Mirror Watch Fan Window Cooler Wardrobe
 */
