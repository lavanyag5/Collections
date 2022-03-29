/*
 * How to iterate HashSet using Advanced For Loop?
 */

package co.hashset;

import java.util.HashSet;

public class IterateHashSetUsingAdvancedForLoop {

	public static void main(String[] args) {

		// HashSet Declaration
		HashSet<String> hset = new HashSet<>();

		// Adding elements to hset
		hset.add("Ramu");
		hset.add("Ananya");
		hset.add("Shashank");
		hset.add("Sunil");

		// Iterating through HashSet using Advanced for loop
		for (String names : hset) {
			System.out.println(names);
		}
	}

}

// OUTPUT
/*
Ramu
Ananya
Sunil
Shashank
 */
