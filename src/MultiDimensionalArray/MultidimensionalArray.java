package MultiDimensionalArray;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// We want to print 7
		
		// 2 4 5
		// 3 4 7

		// int[row][column]

		// 1st way to declare multidimensional array
		int a[][] = new int[2][3];

		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;

		System.out.println(a[1][2]);

		System.out.println("========================================================");// space in console

		// we want to print 0
		// 5 6 8
		// 3 9 0

		// 2nd way to declare multidimesnional array
		int b[][] = { { 5, 6, 8 }, { 3, 9, 0 } };
		System.out.println(b[1][2]);

	}

	}


