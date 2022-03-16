/*
 * The get() method returns the element at the specified index, whereas the set() method changes the element.
 */

package co.practice;

import java.util.ArrayList;

public class GetAndSetArrayList {

	public static void main(String[] args) {
		// Creating ArrayList
		ArrayList<String> list = new ArrayList<>();

		// Adding objects in ArrayList
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		// Accessing the element
		// It will return the 2nd element, because index starts from 0
		System.out.println("Returning the element : " + list.get(1));

		// Changing the element (2nd element)
		// Banana will be changed to Orange
		list.set(2, "Orange");

		// Traversing the list
		for (String fruits : list) {
			System.out.println(fruits);
		}
	}
}

//OUTPUT
/*
Returning the element : Apple
Mango
Apple
Orange
Grapes
*/

