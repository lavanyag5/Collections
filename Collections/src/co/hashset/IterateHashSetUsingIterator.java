/*
 * How to iterate HashSet with Iterator?
 */

package co.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSetUsingIterator {
	
	public static void main(String[] args) {

		// HashSet Declaration
		HashSet<String> hset = new HashSet<>();

		// Adding elements to hset
		hset.add("Chaitanya");
		hset.add("Swaroop");
		hset.add("Amrutha");
		hset.add("Blessy");

		// Iterating over HashSet i.e, hset using Iterator
		Iterator<String> it = hset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

// OUTPUT
/*
Chaitanya
Swaroop
Amrutha
Blessy
 */
