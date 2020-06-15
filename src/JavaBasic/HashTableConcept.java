package JavaBasic;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		// Add to hashtable with key value pair
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "Java");
		
		// Get the size of hashtable
		System.out.println(h.size());
		
		h.put(1, 555);
		h.put(2, 666);
		h.put(3, 444);
		
		// Get the new size of hashtable
		System.out.println(h.size());
		
		// Print the element of hashtable with their key
		System.out.println("**********");
		System.out.println(h.get("A"));
		System.out.println(h.get("C"));
		System.out.println(h.get(1));
		
		
		// Fore hash table to accept only certain data type
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>(); // Key --> Integer
																		  // Value --> String
		
		ht.put(1, "Hello");
		ht.put(2, "Java");
		ht.put(3, "Testing");
		System.out.println("**********");
		System.out.format("Size: %d%n", ht.size());
		System.out.println(ht.get(3));
		System.out.println(ht.get(1));
		System.out.println(ht.get(2));
		

	}

}
