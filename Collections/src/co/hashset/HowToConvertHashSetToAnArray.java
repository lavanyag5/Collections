/*
 * How to convert HashSet to an Array?
 */

package co.hashset;

import java.util.HashSet;

public class HowToConvertHashSetToAnArray {

	public static void main(String[] args) {

		// HashSet Declaration
		HashSet<String> hset = new HashSet<>();

		// Adding elements to hset
		hset.add("Element1");
		hset.add("Element2");
		hset.add("Element3");
		hset.add("Element4");
		hset.add("Element5");

		// Displaying HashSet elements
		System.out.println("Elements: " + hset);

		// Creating new Array
		String[] array = new String[hset.size()];
		hset.toArray(array);

		// Displaying Array elements
		System.out.println("Array elements: ");
		for (String elements : array)
			System.out.println(elements);
	}

}

//OUTPUT
/*
Elements: [Element5, Element4, Element3, Element2, Element1] 
Array elements:
Element5 
Element4 
Element3 
Element2 
Element1
 */
