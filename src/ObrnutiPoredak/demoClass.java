package ObrnutiPoredak;

import java.util.Scanner;

public class demoClass {

	public static void main(String[] args) {
		// Napisati program koji ispisuje brojeve od 1 do unetog broja N obrnutim
		// poretkom.
		// Primer za N =7
		// 7 s6 5 4 3 2 1

		System.out.println("Unesite broj: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.println("Redosled je sledeci: ");

		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}

	}

}
