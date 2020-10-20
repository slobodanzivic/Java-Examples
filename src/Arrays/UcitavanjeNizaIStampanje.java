package Arrays;

import java.util.Scanner;

public class UcitavanjeNizaIStampanje {

	public static void main(String[] args) {
		// Ucitavanje i stampanje elemenata niza

		int[] a = new int[5];
		a[0] = 45;
		a[1] = 32;
		a[2] = 3;
		a[3] = 53;
		a[4] = 144;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("Cetvrti element niza je: " + a[3]);

	}

}
