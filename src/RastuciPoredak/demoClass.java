package RastuciPoredak;

import java.util.Scanner;

public class demoClass {

	public static void main(String[] args) {
		// Napisati program koji ispisuje brojeve od 1 do unetog broja N rastucim poretkom.
		// Primer za N = 7
		// 1 2 3 4 5 6 7
		
		System.out.println("Unesite broj: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		System.out.print("Poredak je sledeci: ");
		
		for (int i = 0; i <= n; i++) {

			System.out.print(" " + i + " ");
		}
		
	}

}
