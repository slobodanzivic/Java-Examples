package ZamenaElemenataUNizu;

import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		// Ucitati niz duzine M;
		// Elemente koji su veci od 100 zameniti sa 1000,
		// a elemente manje od 20 uvecati za 200
		// Koliko ima elementa vecih od 200?

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Ucitajte elemente niza: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int num = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 100) {
				a[i] = 1000;
			} else if (a[i] < 20) {
				a[i] = a[i] + 200;
			}
			if (a[i] >= 200) {
				num = num + 1;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println(" ");
		System.out.println("num =" + num);

	}

}
