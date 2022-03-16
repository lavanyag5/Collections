/*
 * Traverse the ArrayList elements using the for-each loop
 */

package co.practice;

import java.util.ArrayList;

public class IterateArrayListUsingForEachLoop {

	public static void main(String[] args) {

		// Creating ArrayList
		ArrayList<String> list = new ArrayList<>();

		// Adding objects in ArrayList
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		// Traversing list through for-each loop
		for (String fruits : list) {
			System.out.println(fruits);
		}

	}
}

//OUTPUT
/*
Mango 
Apple 
Banana 
Grapes 
*/
