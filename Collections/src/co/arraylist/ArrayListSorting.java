/*
 * How to sort an ArrayList?
 * --> We have a sort() method in the Collections class
 */

package co.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {

		// ArrayList Declaration
		ArrayList<Integer> alist = new ArrayList<>();

		// Adding elements to the ArrayList
		alist.add(4);
		alist.add(12);
		alist.add(7);
		alist.add(6);

		System.out.println("Before sorting: " + alist);

		Collections.sort(alist);

		System.out.println("After sorting: " + alist);
	}
}

// OUTPUT
// Before sorting: [4, 12, 7, 6]
// After sorting: [4, 6, 7, 12]
