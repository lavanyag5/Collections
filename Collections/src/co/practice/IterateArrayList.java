/*
 * Iterating ArrayList using Iterator (Traverse ArrayList elements using the Iterator interface)
 */

package co.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {

		// Creating ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Adding objects in ArrayList
		al.add(123);
		al.add(234);
		al.add(345);
		al.add(456);
		al.add(567);

		// Displaying ArrayList objects
		System.out.println(al);

		// Traversing list through Iterator
		Iterator<Integer> it = al.iterator(); // getting the Iterator
		while (it.hasNext()) { // check if iterator has the elements
			System.out.println(it.next() + " "); // printing the element and move to next
		}
	}
}

//OUPUT
// Displaying ArrayList objects -> [123, 234, 345, 456, 567]
/* Traversing list through Iterator 
123 
234 
345 
456 
567
*/
