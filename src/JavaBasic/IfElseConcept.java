package JavaBasic;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 25;
		
		if(a > b) {
			System.out.println(a + " is greater than " + b);
		}else if(a < b) {
			System.out.println(a + " is less than " + b);
		}else {
			System.out.println(a + " is equal to " + b);
			
		}
		
		// Comparison Operators
		// <, >, ==, !=, <=, >=
		
		int c = 45;
		int d = 45;
		if(c == d) {
			System.out.println("c and d are equal.");
		}else {
			System.out.println("c and d are NOT equal.");
		}
		

	}

}
