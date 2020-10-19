package Boolean;

import java.util.Scanner;

public class ObaParnaILIObaNeparna {

	public static void main(String[] args) {
		// Napisati program koji za dva uneta broja x i y racuna
		// ako su oba parna => racuna njihov zbir
		// ako su oba neparna => racuna njihov kolicnik
		// ako su razlicite parnosti => racuna njihovu razliku

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite x: ");
		double x = sc.nextDouble();
		System.out.println("Unesite y: ");
		double y = sc.nextDouble();
		double rez = 0;
		sc.close();

		boolean obaSuParna = x % 2 == 0 && y % 2 == 0;

		boolean obaNeparna = x % 2 == 1 && y % 2 == 1;

		if (obaSuParna) {
			rez = x + y;

		} else if (obaNeparna) {
			rez = x / y;

		} else {
			rez = x - y;
		}
		System.out.println("Rezultat je: " + rez);

	}

}
