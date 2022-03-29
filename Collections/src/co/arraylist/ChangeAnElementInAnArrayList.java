/*
 * How to change an element in an ArrayList?
 * --> we can use set method to change an element in ArrayList
 */

package co.arraylist;

import java.util.ArrayList;

public class ChangeAnElementInAnArrayList {

	public static void main(String[] args) {

		// ArrayList Declaration
		ArrayList<String> alist = new ArrayList<>();

		// Adding elements to the ArrayList
		alist.add("Maths");
		alist.add("Science");
		alist.add("Social");
		alist.add("Hindi");
		alist.add("English");

		System.out.println("Elements before using set(): " + alist);
		alist.set(1, "Kannada");
		System.out.println("Elements after using set() i.e, updating science with kannada :" + alist);

	}
}

// OUTPUT
// Elements before using set(): [Maths, Science, Social, Hindi, English]
// Elements after using set() i.e, updating science with kannada :[Maths, Kannada, Social, Hindi, English]
