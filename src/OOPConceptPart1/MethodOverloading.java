package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading load = new MethodOverloading();
		
		load.sum();
		load.sum(12.33);
		load.sum(125);
		load.sum(12.33, 5);
		
	}
	
	
	public static void main(int p) {
		
	}
	
	
	public static void maid(int q, int h) {
		
	}
	
	
	// We can overload main method also.
	// Method inside a method can't be created.
	// Duplicate method --> same method with same number of arguments is not allowed.
	// Method overloading --> method with the same name as another method but with different number of arguments/parameters within the same class.
	
	public void sum() {
		System.out.println("Sum method --> Zero parameters.");
	}
	
	
	public void sum(int i) {
		System.out.println("Sum method --> One parameter.");
		System.out.println(i);
	}
	
	
	
	public void sum(double d) {
		System.out.println("Sum method --> One parameter.");
		System.out.println(d);
	}
	
	
	public void sum(double d, int x) {
		System.out.println("Sum method --> Two parameters.");
		System.out.println(d);
		System.out.println(x);
	}

}
