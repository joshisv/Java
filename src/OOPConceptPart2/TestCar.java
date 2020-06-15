package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {		
		
		// When same method is present in parent and child class with same name and number of arguments
		// then it is called method-overriding. Preference will be given to the method in child class because
		// if class class already has the same method then why need to use the same method from parent class?
		
		TestCar t = new TestCar();
		
		t.staticPolymorphism();
		
		t.dynamicPolymorphism();

	}
	
	public void staticPolymorphism() {
		
		// Static polymorphism ----> Compile time polymorphism
		// Instantiate object BMW
		BMW b = new BMW();
		
		b.start(); // This method is present both in parent class (Car) and child class (BMW) but it will call from child class because of preference.
				   // Overriding start() method from child class ---> BMW.
		b.stop();
		b.theftSafety();
		b.engine();
		
		System.out.println("*****************************");
		
		// If Car class object is created, it will only access methods defined in Car class.
		
		// A child class or sub class can inherit all the methods from its parent class or super class.
		// A parent class or super class CAN NOT inherit any methods from its child class or sub class.
		
		Car c = new Car();
		
		// Following all will be called from Car class.
		c.start();
		c.stop();
		c.refuel();	
		
		// Following will be called from Vehicle class.
		c.engine();
		
	}
	
	
	public void dynamicPolymorphism() {
		
		System.out.println("*****************************");
		
		// Top Casting
		Car c1 = new BMW(); // Child class object can be referred by a parent class reference variable.
		
		// Dynamic polymorphism ---> Run time polymorphism.
		// Only overridden or parent class methods can be accessed with dynamic polymorphism.
		// Methods those are only on child class CAN NOT be accessed with dynamic polymorphism.
		
		c1.start();  // will be called from BMW class because it is overridden in BMW class.
		c1.stop();	 // will be called from Car class
		c1.refuel(); // will be called from Car class
		c1.engine();
		
		
		// Down Casting will throw an error at runtime --> 
		// ClassCastException
		// BMW b1 = (BMW) new Car(); --> NOT ALLOWED
		
	}

}
