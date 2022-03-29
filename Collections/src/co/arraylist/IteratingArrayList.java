/*
 * How to Iterate an ArrayList
 */

package co.arraylist;

import java.util.ArrayList;

public class IteratingArrayList {

	public static void main(String[] args) {

		// ArrayList Declaration
		ArrayList<String> alist = new ArrayList<>();

		// Adding elements to the ArrayList
		alist.add("Cat");
		alist.add("Dog");
		alist.add("Lion");
		alist.add("Tiger");
		alist.add("Elephant");

		// Iterating an ArrayList
		for (String ani : alist) {
			System.out.println("Animals: " + ani);
		}

	}

// OUTPUT
	/*
	 * Animals: Cat Animals: Dog Animals: Lion Animals: Tiger Animals: Elephant
	 */

}
