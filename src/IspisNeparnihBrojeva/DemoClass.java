package IspisNeparnihBrojeva;

import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		// Ispis neparnih prirodnih brojeva od 1 do n

		System.out.println("Uneti broj n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.println("Neparni brojevi su: ");
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

}
