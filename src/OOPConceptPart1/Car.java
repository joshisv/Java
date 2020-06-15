package OOPConceptPart1;

public class Car {
	
	// Class level properties
	int model;
	int wheel;

	public static void main(String[] args) {
		
		// Class instantiation
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		// new Car() --> is an object of Car class.
		// new keyword is used to create an object.
		// a, b, and c are object reference variables.
		
		
		a.model = 2019;
		a.wheel = 4;
		
		b.model = 2020;
		b.wheel = 4;
		
		c.model = 2018;
		c.wheel = 4;
		
		System.out.println("Before assigning references.");
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("After assigning references.");
		a = b;
		b = c;
		c = a;
		
		a.model = 10;
		System.out.println(a.model);
		c.model = 20;
		System.out.println(c.model);
		System.out.println(a.model);
		

	}

}
