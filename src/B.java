
public class B extends A {

	
	public B() {
		//super(45);	// super keyword is used to call constructor from parent class.
		super(15, 25);
		System.out.println("Child class constructor");
	}
	
	
	public static void main(String args[]) {
		
		B obj = new B();
	}
	
}
