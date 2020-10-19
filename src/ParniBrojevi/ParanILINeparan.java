package ParniBrojevi;

import java.util.Scanner;

public class ParanILINeparan {

	public static void main(String[] args) {
		// Napisati program koji za uneti broj ispisuje da li je paran ili neparan

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int x = sc.nextInt();
		sc.close();

		if (x % 2 == 0) {
			System.out.println("Broj je paran: ");
		} else {
			System.out.println("Broj je neparan: ");
		}
	}

}
