/*
 * How to convert HashSet to TreeSet?
 */

package co.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HowToConvertHashSetToTreeSet {

	public static void main(String[] args) {

		// HashSet Declaration
		HashSet<String> hset = new HashSet<>();

		// Adding elements to hset
		hset.add("Element1");
		hset.add("Element4");
		hset.add("Element3");
		hset.add("Element2");
		hset.add("Element5");

		// Displaying HashSet elements
		System.out.println("Elements: " + hset);

		// Declare TreeSet
		Set<String> tset = new TreeSet<String>(hset);

		// Displaying TreeSet elements : TreeSet provides elements in Ascending order
		System.out.println("TreeSet elements: ");
		for (String elements : tset) {
			System.out.println(elements);
		}

	}

}

// OUTPUT
/*Elements: [Element5, Element4, Element3, Element2, Element1]
TreeSet elements: 
Element1
Element2
Element3
Element4
Element5
*/

