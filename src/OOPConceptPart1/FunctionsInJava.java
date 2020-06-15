package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {		

		// One object will be created which will have a reference variable referencing to the object.
		// After creating the object, copy of all non static methods will be given to that object.
		
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		
		int i = obj.someInt();
		System.out.println(i);
		
		String s = obj.qa();
		System.out.println(s);
		
		int divide = obj.division(81, 3);
		System.out.println(divide);
		
		// main(String[] args) method is void --> it never returns a value.

	}
	
	// Non static methods
	public void test() {
		System.out.println("This is a test method.");
	}
	
	
	public int someInt() {
		System.out.println("someInt method.");
		int a = 10;
		int b = 15;
		int c = a + b;
		
		return c;
	}
	
	
	public String qa() {
		System.out.println("qa method.");
		String s = "This is Java for Selenium.";
		
		return s;
	}
	
	
	public int division(int x, int y) {
		System.out.println("division method.");
		int result = x/y;
		
		return result;
	}

}
