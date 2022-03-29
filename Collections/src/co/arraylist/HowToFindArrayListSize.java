/*
 * How to find the length of an ArrayList?
 * --> Using size() method we can find the length of an ArrayList
 */

package co.arraylist;

import java.util.ArrayList;

public class HowToFindArrayListSize {

	public static void main(String[] args) {

		// ArrayList Declaration
		ArrayList<Integer> alist = new ArrayList<>();

		// Adding elements to the ArrayList
		alist.add(5);
		alist.add(2);
		alist.add(6);
		alist.add(10);
		alist.add(9);

		System.out.println("Number of elements in an ArrayList/Length of an ArrayList is: " + alist.size());
	}

}

// OUTPUT
// Number of elements in an ArrayList/Length of an ArrayList is: 5
