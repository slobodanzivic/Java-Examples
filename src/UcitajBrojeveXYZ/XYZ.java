package UcitajBrojeveXYZ;

import java.util.Scanner;

public class XYZ {

	public static void main(String[] args) {
		// Napisati program koji ucitava 3 broja x, y, z
		// Program zatim ispisuje sumu brojeva od X do Y koji su deljivi sa Z

		System.out.println("Unesite brojeve x, y i z: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();
		int sum = 0;

		for (int i = x; i < y; i++) {
			if (i % z == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Zbir je: " + sum);
	}

}
