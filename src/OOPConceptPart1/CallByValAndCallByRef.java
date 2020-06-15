package OOPConceptPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		
		int c = obj.testSum(x, y); // Call by Value OR Pass by Value
		System.out.format("Call/Pass by Val: %04d%n", c);
		
		// Call by Value passes a copy of arguments/parameters to the calling method. If those copies
		// are changed, this doesn't effect the original arguments/parameters.
		
		
		// Call by Ref is possible in java by passing object reference.
		obj.p = 35;
		obj.q = 55;
		
		System.out.println("Before swap:");
		System.out.format("p: %d%n", obj.p);
		System.out.format("q: %d%n", obj.q);
		
		obj.swap(obj); // Calling method where object is passed by reference.
		
		System.out.println("After swap:");
		System.out.format("p: %d%n", obj.p);
		System.out.format("q: %d%n", obj.q);
		
	}
	
	
	
	public int testSum(int a, int b) {
		
		int result = a + b;
		
		return result;
	}
	
	
	
	public void swap(CallByValAndCallByRef t) { // Passing object reference for call by Reference
		
		int temp = t.p; // p = 35 so temp = 35
		t.p = t.q;		// p = 55
		t.q = temp; 	// q = 35
				
	}

}
