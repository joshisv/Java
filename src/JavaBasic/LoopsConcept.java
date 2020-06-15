package JavaBasic;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index = 1;
		
		// Print top 10 integers
		
		//While loop
		// Disadvantage : If incremental or decremental part is left, the loop will continue to execute 
		// infinitive times.
		while(index <= 10) {
			System.out.println(index + " while loop.");
			index += 1; //<= Increment/decrement
		}
		
		
		// for loop
		for(index = 1; index <= 10; index += 1) {
			for(int j = 1; j < index; j += 1) {
				System.out.print("*");
			}
			System.out.println("*");
		}

	}

}
