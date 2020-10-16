package MikaPeraLaza;

import java.util.Scanner;

public class MIkaPeraLaza {

	public static void main(String[] args) {
		// Napisati program koji za sve brojeve od 1 do N (N se unosi sa tastature)
		// prikazuje:
		// Akoje je broj deljiv sa 3 i 5 prikazuje poruku "MikaPera"
		// Ako je broj deljiv samo sa 3 prikazuje poruku "Mika"
		// Ako je broj deljiv samo sa 5 prikazuje poruku "Pera"
		// U drugim slucajevima ispisuje poruku "Laza"

		System.out.println("Uneti broj n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i < n; i++) {
			System.out.println("Broj je :" + i);

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("MikaPera");
			} else if (i % 3 == 0) {
				System.out.println("Mika");
			} else if (i % 5 == 0) {
				System.out.println("Pera");
			} else {
				System.out.println("Laza");
			}

		}

	}

}
