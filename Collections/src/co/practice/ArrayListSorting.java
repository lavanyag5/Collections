/*
 * The java.util package provides a utility class Collections, which has the static method sort(). Using the Collections.sort() method, we can easily sort the ArrayList.
 */

package co.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSorting {
	public static void main(String[] args) {

		// Creating ArrayList
		ArrayList<String> al = new ArrayList<>();

		// Adding objects in ArrayList
		al.add("Alpha");
		al.add("Beta");
		al.add("Charlie");
		al.add("Delta");

		// Sorting the list
		Collections.sort(al);
		System.out.println("String sorting...");

		// Traversing list through the for-each loop
		for (String list : al)
			System.out.println(list);

		System.out.println("************************************");
		System.out.println("Number sorting...");
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(7);
		num.add(2);
		num.add(10);
		num.add(6);

		Collections.sort(num);

		for (Integer n : num)
			System.out.println(n);
	}

}

//OUTPUT
/*
String sorting...
Alpha
Beta
Charlie
Delta
************************************
Number sorting...
2
5
6
7
10
 */
