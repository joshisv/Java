package OOPConceptPart1;

public class LocalVsGlobalVariables {
	
	// Global variables
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		

		int i = 15; 	// Local variable
		System.out.println(i);
		
		LocalVsGlobalVariables objlgv = new LocalVsGlobalVariables();
		System.out.println(objlgv.name);
		System.out.println(objlgv.age);
		

	}
	
	
	public void sum() {
		int i = 20;         // Local variable
		int j = 30;         // Local variable
		int age = 25;       // Local variable
	}

}
