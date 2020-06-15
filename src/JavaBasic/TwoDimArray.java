package JavaBasic;

public class TwoDimArray {

	public static void main(String[] args) {
		

		// Declare 2 dim array
		String s1[][] = new String[3][5];
		
		System.out.println(s1.length);    //Prints number of rows in 2 dim array
		System.out.println(s1[0].length); //Prints number of columns in 2 dim array
		
		s1[0][0] = "A0";
		s1[0][1] = "B0";
		s1[0][2] = "C0";
		s1[0][3] = "D0";
		s1[0][4] = "E0";
		
		s1[1][0] = "A1";
		s1[1][1] = "B1";
		s1[1][2] = "C1";
		s1[1][3] = "D1";
		s1[1][4] = "E1";
		
		s1[2][0] = "A2";
		s1[2][1] = "B2";
		s1[2][2] = "C2";
		s1[2][3] = "D2";
		s1[2][4] = "E2";
		
		System.out.println(s1[1][2]);
		System.out.println(s1[2][2]);
		
		// Print all the elements of above 2 dim array
		for(int row = 0; row < s1.length; row += 1) {
			for(int col = 0; col < s1[row].length; col += 1) {
				System.out.print(s1[row][col]);
			}
			System.out.println();
		}

	}

}
