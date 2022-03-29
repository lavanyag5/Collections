/*
 * How to remove element or remove all elements from HashSet?
 * --> remove() & clear()
 */

package co.hashset;

import java.util.HashSet;

public class HowToRemoveElementsFromHashSet {

	public static void main(String[] args) {

		// HashSet Declaration
		HashSet<String> hset = new HashSet<String>();

		// Adding elements to the HashSet i.e, hset
		hset.add("Element1");
		hset.add("Element2");
		hset.add("Element3");
		hset.add("Element4");
		hset.add("Element5");

		// Display HashSet elements
		System.out.println("Before: HashSet elements: " + hset);

		// public void clear(): It removes all the elements from HashSet. The set
		// becomes empty after this method gets called.
		hset.clear();
		System.out.println("hset after clearing all elements: " + hset);
	}

}

// OUTPUT
// Before: HashSet elements: [Element5, Element4, Element3, Element2, Element1]
// hset after clearing all elements: []

