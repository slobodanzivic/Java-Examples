package ZbirParnihCifaraUnetogBrojaN;

import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		// Napisati program koji prikazuje zbir svih parnih cifara unetog broja N

		System.out.println("Uneti broj n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int c = 0;
		int sum = 0;

		while (n > 0) {
			c = n % 10;
			n = n / 10;
			if (c % 2 == 0) {
				sum = sum + c;
			}

		}

		System.out.println("Zbir parnih cifara je: " + sum);

	}

}
