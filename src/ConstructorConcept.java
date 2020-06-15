
public class ConstructorConcept {
	
	
	// Constructor
	// 1. Constructor without parameter - default
	public ConstructorConcept() {
		System.out.println("Default constructor");
	}
	
	
	// 2. Single parameter constructor
	public ConstructorConcept(int i) {
		System.out.println("Single parameter constructor");
		System.out.println("Value of i : " + i);		
	}
	
	
	// 3. Double parameter constructor
	public ConstructorConcept(int i, int j) {
		System.out.println("Double parameter constructor");
		System.out.println("Value of i : " + i);
		System.out.println("Value of j : " + j);
	}


	public static void main(String[] args) {
		
		System.out.println("------------------");
		ConstructorConcept obj = new ConstructorConcept();
		
		System.out.println("------------------");
		ConstructorConcept obj1 = new ConstructorConcept(15);
		
		System.out.println("------------------");
		ConstructorConcept obj2 = new ConstructorConcept(15,25);

	}

}
