package Arrays;

import java.util.Scanner;

public class NajmanjiElementNiza {

	public static void main(String[] args) {
		// Ucitati niz duzine N sa tastature
		// Odrediti najmanji element niza

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n: ");
		int n = sc.nextInt();

		int[] a = new int[n];
		System.out.println("Ucitajte elemente niza: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}

		System.out.println("Najmanji element niza je: " + min);

	}

}
