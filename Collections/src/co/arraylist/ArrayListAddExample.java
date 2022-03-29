/*
 * How to create an ArrayList & how to add elements to an ArrayList?
 */

package co.arraylist;

import java.util.ArrayList;

public class ArrayListAddExample {
	
	public static void main(String[] args) {

		// ArrayList Decalaration
		ArrayList<String> alist = new ArrayList<String>();
		
		// Adding elements to the ArrayList
		alist.add("Apple");
		alist.add("Ball");
		alist.add("Cat");
		alist.add("Dog");
		alist.add("Elephant");

		// Displaying ArrayList(alist) elements
		System.out.println("Elements :" + alist);

		// Adding Beta at 3rd position
		alist.add(2, "Beta");

		// Displaying ArrayList(alist) elements
		System.out.println("Elements after adding Beta :" + alist);
		
		// Iterate an ArrayList
		for(String arrayList:alist)
		{
			System.out.println(arrayList);
		}
	}
}

// OUTPUT
// Elements :[Apple, Ball, Cat, Dog, Elephant]
// Elements after adding Beta :[Apple, Ball, Beta, Cat, Dog, Elephant]
