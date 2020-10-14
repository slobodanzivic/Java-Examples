package ForLoop;

import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		// Napisati program koji ispisuje sve brojeve od 1 do ucitanog broja N koji su:
		// deljivi sa brojem 3 
		// deljivi sa brojem 5 
		// deljivi i sa brojem 3 i sa brojem 5
		// ispisati ogovarajucu poruku ako broj nije deljiv sa brojem 3 i sa brojem 5

		System.out.println("Unesite broj n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i < n; i++) {
			System.out.println("Uneli ste broj: " + i);

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Uneti broj je deljiv i sa brojem 3 i sa brojem 5.");
			} else if (i % 3 == 0) {
				System.out.println("Uneti broj je deljiv samo sa brojem 3. ");
			} else if (i % 5 == 0) {
				System.out.println("Uneti broj je deljiv samo sa brojem 5. ");
			} else {
				System.out.println("Uneti broj nije deljiv ni sa brojem 3 ni sa brojem 5.");
			}
		}

	}

}
