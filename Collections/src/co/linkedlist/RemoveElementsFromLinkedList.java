/*
 * How to remove elements from the LinkedList?
 * --> we can use remove(), removeFirst() & removeLast() methods 
 */

package co.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveElementsFromLinkedList {
	
	public static void main(String[] args) {

		// LinkedList Declaration
		LinkedList<String> linkedList = new LinkedList<>();
		
		// Adding elements to the LinkedList 
		linkedList.add("Amrutha Dhaare");
		linkedList.add("Bharjari");
		linkedList.add("Appu");
		linkedList.add("Sirivanta");

		System.out.println("Elements: " + linkedList);
		
		System.out.println("-------------------");

		// Removing first element aka list.remove(0)
		linkedList.removeFirst();
		System.out.println("After removing first element:" + linkedList);

		System.out.println("-------------------");
		
		// Removing last element
		linkedList.removeLast();
		System.out.println("After removing last element: " + linkedList);

		System.out.println("-------------------");
		
		// Iterating LinkedList
		Iterator<String> it = linkedList.iterator();
		while (it.hasNext()) {
			System.out.println("Iterating elements: " + it.next());
		}

	}

}

// OUTPUT
/*
Elements: [Amrutha Dhaare, Bharjari, Appu, Sirivanta]
-------------------
After removing first element:[Bharjari, Appu, Sirivanta]
-------------------
After removing last element: [Bharjari, Appu]
-------------------
Iterating elements: Bharjari
Iterating elements: Appu
*/
