/*
 * How to add elements to HashSet?
 * --> we can add elements to HashSet using add() method
 */

package co.hashset;

import java.util.HashSet;

public class HowToAddElementsToHashSet {
	
	public static void main(String[] args) {

		// HashSet Declaration
		HashSet<String> hset = new HashSet<>();

		// Adding elements to the HashSet i.e, hset
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Banana");
		hset.add("Fig");

		// Displaying elements
		System.out.println("Elements: " + hset);

		// Adding duplicate elements to hset
		hset.add("Apple");
		hset.add("Mango");

		// Addition of null values
		hset.add(null);
		hset.add(null);

		// Displaying HashSet elements after adding duplicate elements
		System.out.println("HashSet elements: " + hset);

	}

}


// OUTPUT
// As you can see there all the duplicate values are not present in the output including the duplicate null value.
// Elements: [Apple, Grapes, Fig, Mango, Banana]
// HashSet elements: [null, Apple, Grapes, Fig, Mango, Banana]
