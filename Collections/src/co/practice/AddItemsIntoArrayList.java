/*
 * Adding elements into ArrayList
 */

package co.practice;

import java.util.ArrayList;

public class AddItemsIntoArrayList {

	public static void main(String[] args) {

		// Creating ArrayList
		ArrayList<String> list = new ArrayList<>();

		// Adding elements into ArrayList i.e list
		list.add("item1");
		list.add("item2");
		list.add("item3");

		// Printing list elements
		System.out.println(list);
	}
}

//OUTPUT
// input -> item1,item2,item3 
// output -> [item1, item2, item3]
