package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	String name = "Tom"; //Non-static global variable
	static int age = 25; //Static global variable

	public static void main(String[] args) {
		

		// How to call static methods and variables?
		
		// 1. direct calling
		sum();
		System.out.println(age);
		
		// 2. calling by class name
		StaticAndNonStaticConcept.sum();
		System.out.println(StaticAndNonStaticConcept.age);
		
		// How to call Non-static methods and variables?
		
		// By creating an object reference
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		
		obj.sendMail();
		System.out.println(obj.name);
		
		// Can we access static method using object reference?
		// Yes we can, but it will display warning message.  Since static methods/variables are 
		// directly available to use in memory why need to use an object reference?
		
		
		
	}
	
	
	public void sendMail() { // Non-static method
		
		System.out.println("sendMail() method.");
		
	}
	
	public static void sum() { //Static method
		System.out.println("sum() method.");
	}

}
