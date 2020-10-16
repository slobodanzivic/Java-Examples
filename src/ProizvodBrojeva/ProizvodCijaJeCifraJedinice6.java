package ProizvodBrojeva;

import java.util.Scanner;

public class ProizvodCijaJeCifraJedinice6 {

	public static void main(String[] args) {
		// Proizvod brojeva od 1 do n cija je cifra jedinica 6

		System.out.println("Uneti broj n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int p = 1;

		for (int i = 1; i <= n; i++) {
			if (i % 10 == 6) {
				p = p * i;
			}
		}
		System.out.println("Proizvod je: " + p);
	}

}
