package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// Disadvantages of array:
		// 1. Size is fixed while declaring --> this is why it is called static array.
		//--> To overcome fixed size issue, use collections 
		//--> ArrayList, HashTables AKA dynamic array
		
		// 2. Array can store only similar data types. 
		//--> Use object array to store variables of multiple data types.
		
		
		// Array: to store similar data type values in an array variable
		
		// int array
		// lowest bound/index = 0
		// upper bound/index = n - 1, where n is size of array => array.length()
		int i[] = new int[5]; 	// size of array is 5
		
		i[0] = 20;
		i[1] = 25;
		i[2] = 30;
		i[3] = 35;
		i[4] = 40;
		
		
		
		System.out.println(i[3]);
		
		//System.out.println(i[5]); // ArrayIndexOutOfBoundsException => occurs when trying to access
									// array element that doesn't exist or which is higher than the upper index.
		
		// Print length of the array
		System.out.println(i.length);
		
		// Print all elements in the array => use for loop
		for(int j = 0; j < i.length; j += 1) {
			System.out.println(i[j]);
		}
		
		
		// Double array
		double d[] = new double[5]; 	// size of array is 5
		
		d[0] = 20;
		d[1] = 25.55;
		d[2] = 30;
		d[3] = 35.95567;
		d[4] = 40;
		
		System.out.println(d[3]);
		
		
		// Char array
		char c[] = new char[4];
		
		c[0] = 'S';
		c[1] = 'H';
		c[2] = 'I';
		c[3] = 'V';
		
		
		System.out.println(c[3]);
		
		// boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		// String array
		String s[] = new String[4];
		s[0] = "Shiv";
		s[1] = "Radhika";
		s[2] = "Bhavisha";
		s[3] = "Manisha";
		
		// Print string array in one line
		for(int m = 0; m < s.length; m += 1) {
			System.out.print(s[m]);
			if(m < s.length - 1) {
				System.out.print(" ");
			}
		}
		
		System.out.println();
		// Object array --> used to store different data type values in a variable.
		Object ob[] = new Object[6]; // to store name, age, height, dob, gender, city etc.
		
		ob[0] = "Tom";
		ob[1] = 35;
		ob[2] = 5.11;
		ob[3] = "1/1/1999";
		ob[4] = 'M';
		ob[5] = "London";
		
		
		// Print from object array
		for(int x = 0; x < ob.length; x += 1) {
			System.out.print(ob[x]);
			if(x < ob.length - 1) {
				System.out.print(" ");
			}
		}
		
		

	}

}
