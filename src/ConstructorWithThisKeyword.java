
public class ConstructorWithThisKeyword {
	
	String name;
	int age;
	
	public ConstructorWithThisKeyword() {
		
	}
	
	
	public ConstructorWithThisKeyword(String name) {
		System.out.println("Hello " + name);
	}
	
	
	public ConstructorWithThisKeyword(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println("Hello " + this.name);	// Value of global variable
		System.out.println("Your age: " + this.age);	// Value of global variable
		
		System.out.println("Hello " + name);	// Value of local variable
		System.out.println("Your age: " + age);	// Value of local variable
	}

	public static void main(String[] args) {
		

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Ram", 31);
		

	}

}
