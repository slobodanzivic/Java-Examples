package RacunskeOperacije;

import java.util.Scanner;

public class SabiranjeOduzimanjeMnozenjeKolicnik {

	public static void main(String[] args) {
		// Napisati program koji pronalazi zbir, razliku, proizvod i kolicnik za dva uneta broja

		System.out.println("Unesite prvi broj: ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.println("Unesite drugi broj: ");
		double b = sc.nextDouble();
		sc.close();

		System.out.println("Dobijeni rezultati su: ");

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	}

}
