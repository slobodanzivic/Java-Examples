package AritmetickaSredina;

import java.util.Scanner;

public class AritmetickaSredina {

	public static void main(String[] args) {
		// Napisati program za ispis aritmetičke sredine prirodnih brojeva od 1 do n.

		System.out.println("Uneti broj n: ");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		sc.close();
		double sum = 0;
		double as;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;

		}

		as = sum / n;
		System.out.print("Aritmeticka sredina brojeva od 1 do n je: " + as);

	}

}
