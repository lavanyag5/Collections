/*
 * Example of Adding and Removing elements in LinkedList
 * Using add(),addFirst(),addLast() &
 * remove(),removeFirst(),removeLast()
 */

package co.linkedlist;

import java.util.LinkedList;

public class AddingAndRemovingElementsInLinkedList {

	public static void main(String[] args) {

		// LinkedList Declaration
		LinkedList<String> linkedList = new LinkedList<>();

		// add(String Element) is used for adding the elements to the linked list
		linkedList.add("Item1");
		linkedList.add("Item2");
		linkedList.add("Item3");
		linkedList.add("Item4");
		linkedList.add("Item5");

		// Display Linked List Content
		System.out.println("Display Linked List Content: " + linkedList);

		// Add First and Last Element
		linkedList.addFirst("First Item");
		System.out.println("Adding first element using addFirst(): " + linkedList);

		linkedList.addLast("Last Item");
		System.out.println("Adding last element using addLast(): " + linkedList);

		// How to get & set values of linkedlist
		Object firstValue = linkedList.getFirst();
		Object firstVal = linkedList.get(0);
		System.out.println("First element: " + firstValue);
		System.out.println("First element: " + firstVal);

		// Remove first element
		linkedList.removeFirst();
		System.out.println("Remove first element: " + linkedList);

		// Remove last element
		linkedList.removeLast();
		System.out.println("Remove last element: " + linkedList);

		// Add element to a position
		linkedList.add(1, "*Item*");
		System.out.println("Add element to a position i.e, 2nd position/1st index: " + linkedList);

		// Remove element from a position
		linkedList.remove(3);
		System.out.println("Remove element from index 3/4th element: " + linkedList);
		
		// Final content of linkedlist
		System.out.println("LinkedList: " + linkedList);

	}

}

// OUTPUT
/*
Display Linked List Content: [Item1, Item2, Item3, Item4, Item5]
Adding first element using addFirst(): [First Item, Item1, Item2, Item3, Item4, Item5]
Adding last element using addLast(): [First Item, Item1, Item2, Item3, Item4, Item5, Last Item]
First element: First Item
First element: First Item
Remove first element: [Item1, Item2, Item3, Item4, Item5, Last Item]
Remove last element: [Item1, Item2, Item3, Item4, Item5]
Add element to a position i.e, 2nd position/1st index: [Item1, *Item*, Item2, Item3, Item4, Item5]
Remove element from index 3/4th element: [Item1, *Item*, Item2, Item4, Item5]
LinkedList: [Item1, *Item*, Item2, Item4, Item5]
 */
