package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		

		String s = "100";
		System.out.println(s + 20);
		
		// Use wrapper class to parse string to integer
		int x = Integer.parseInt(s);
		System.out.println(x +20);
		
		
		String t = "250AB";
		String m = t.substring(0, 3);
		int p = Integer.parseInt(m);
		System.out.println(p);
		
		// Wrapper classes
		/* 1. Integer
		 * 2. Double
		 * 3. Float
		 * 4. 
		 * 5. Boolean
		 */

		
		// String to double
		String y = "15.25";
		double z = Double.parseDouble(y);
		System.out.println(z + 15.7);
		
		// String to boolean
		String a = "true";
		boolean b = Boolean.parseBoolean(a);
		System.out.println(b);
		
		// Int to String
		int j = 100;
		System.out.println(j + 85);
		
		String v = String.valueOf(j);
		System.out.println(v + 85);
		
	}

}
