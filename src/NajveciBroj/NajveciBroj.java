package NajveciBroj;

import java.util.Scanner;

public class NajveciBroj {

	public static void main(String[] args) {
		// Napisati program koji pronalazi najveci broj od n unetih brojeva.
		// N zadaje korisnik.
		// Zadatak resiti koriscenjem FOR petlje.

		System.out.println("Unesite broj n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		int max = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Uneti broj: ");
			x = sc.nextInt();
			if (x > max) {
				max = x;
			}
		}

		System.out.println("Maksimalan broj od ovih unetih brojeva je: " + max);
	}
}
