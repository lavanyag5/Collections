/*
 * How to remove an element from an ArrayList?
 * --> We can remove() method to remove an element from an ArrayList
 */

package co.arraylist;

import java.util.ArrayList;

public class RemoveAnElementFromAnArrayList {

	public static void main(String[] args) {

		// ArrayList Declaration
		ArrayList<String> alist = new ArrayList<>();

		// Adding elements to the ArrayList
		alist.add("Alpha");
		alist.add("Beta");
		alist.add("Charlie");
		alist.add("Delta");
		alist.add("Echo");
		alist.add("Foxtort");

		System.out.println("Before removing Beta from ArrayList: " + alist);

		// Removing an element from an ArrayList using index
		alist.remove(1);
		System.out.println("After removing Beta from ArrayList: " + alist);

		// Removing element from ArrayList
		alist.remove("Echo");
		System.out.println("Removing Echo: " + alist);

	}
}

// OUTPUT
// Before removing Beta from ArrayList: [Alpha, Beta, Charlie, Delta, Echo, Foxtort]
// After removing Beta from ArrayList: [Alpha, Charlie, Delta, Echo, Foxtort]
// Removing Echo: [Alpha, Charlie, Delta, Foxtort]
