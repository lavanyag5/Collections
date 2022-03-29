/*
 * How to convert HashSet to List/ArrayList?
 */

package co.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HowToConvertHashSetToArrayList {

	public static void main(String[] args) {

		// HashSet Declaration
		HashSet<String> hset = new HashSet<>();

		// Adding elements to hset
		hset.add("Balaji");
		hset.add("Govinda");
		hset.add("Srinivasa");
		hset.add("Venkatesha");
		hset.add("Vishnu");

		// Displaying HashSet elements
		System.out.println("Elements: " + hset);

		// Creating list of HashSet element
		List<String> list = new ArrayList<>(hset);

		// Displaying ArrayList elements converted from HashSet
		System.out.println("ArrayList elemensts: ");
		for (String elements : list) {
			System.out.println(elements);
		}

	}

}

// OUTPUT
/*
Elements: [Vishnu, Govinda, Srinivasa, Venkatesha, Balaji]
ArrayList elemensts: 
Vishnu
Govinda
Srinivasa
Venkatesha
Balaji
 */
