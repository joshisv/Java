
public class A {
	
	public A() {
		System.out.println("Parent class constructor");
	}

	
	public A(int i) {
		System.out.println("Parent class - value of i " + i);
	}
	
	
	public A(int i, int j) {
		
		// Add two values
		int k = i + j;
		System.out.println("Parent class - Sum of i & j: " + k);
	}

}
