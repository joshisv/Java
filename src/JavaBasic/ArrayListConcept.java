package JavaBasic;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200.15);
		ar.add(300);
				
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add("Hello");
		ar.add('A');
		ar.add(true);
		
		System.out.println(ar.size()); // Print the size of ArrayList.
		
		System.out.println(ar.get(3)); // Prints the element in ArrayList at given index.
		// System.out.println(ar.get(8)); ---> IndexOutOfBoundsException
		
		// Print all the elements of the ArrayList
		System.out.println("*****************");
		
		for(int i = 0; i < ar.size(); i += 1) {
			System.out.println(ar.get(i));
		}
		
		// Remove the item in ArrayList
		ar.remove(6);
		System.out.println("*****************");
		
		for(int i = 0; i < ar.size(); i += 1) {
			System.out.println(ar.get(i));
		}		
		
		
		// Force ArrayList only accept some data type values
		ArrayList<Integer> ar1 = new ArrayList<Integer>();		
		ar1.add(125);
		ar1.add(225);
		// ar1.add("Tom"); --> Adding String value to an Integer ArrayList will give an error.
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");
		ar2.add("Bingo");
		
		System.out.println("*****************");
		
		for(int i = 0; i < ar2.size(); i += 1) {
			System.out.println(ar2.get(i));
		}
		

	}
	
	
	

}
