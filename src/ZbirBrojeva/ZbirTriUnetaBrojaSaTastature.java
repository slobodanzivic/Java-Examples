package ZbirBrojeva;

import java.util.Scanner;

public class ZbirTriUnetaBrojaSaTastature {

	public static void main(String[] args) {
		// Naci zbir 3 uneta broja sa tastature

		Scanner sc = new Scanner(System.in);
		int sum = 0;

		System.out.println("Unesite prvi broj: ");
		int a = sc.nextInt();

		System.out.println("Unesite drugi broj: ");
		int b = sc.nextInt();

		System.out.println("Unesite treci broj: ");
		int c = sc.nextInt();

		sum = a + b + c;

		System.out.println("Zbir ova tri uneta broja sa tastature je: " + sum);

	}

}
