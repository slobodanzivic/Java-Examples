package DoWhile;

import java.util.Scanner;

public class IspisProizvodaBrojevaOd1DoN {

	public static void main(String[] args) {
		// Napisati program za ispis proizvoda brojeva od 1 do n koji su djeljivi sa 4 i
		// sa 3.

		Scanner sc = new Scanner(System.in);

		int i = 1, n, p = 1;

		System.out.print("Unesite broj n: ");
		n = sc.nextInt();
		do {
			if (i % 3 == 0 && i % 4 == 0)
				p = p * i;
			i++;
		} while (i <= n);
		System.out.println("Proizvod je: " + p);
	}
}
