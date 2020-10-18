package Switch;

import java.util.Scanner;

public class Samoglasnici {

	public static void main(String[] args) {
		// Napisati program koji za upisani samoglasnik (veliko slovo)
		// ispisuje redni broj samoglasnika u abecedi, prema slijedećoj tabeli:
		// "A" - 1
		// "E" - 5
		// "I" - 9
		// "O" - 15
		// "U" - 20

		System.out.println("Unesite neki od samoglasnika velikim slovom: ");
		Scanner sc = new Scanner(System.in);
		String samoglasnik = sc.nextLine();
		sc.close();

		String poruka = "Slovo koje ste uneli nije samoglasnik, pokusajte ponovo!";

		switch (samoglasnik) {
		case "A":
			System.out.println("1");
			break;
		case "E":
			System.out.println("5");
			break;
		case "I":
			System.out.println("9");
			break;
		case "O":
			System.out.println("15");
			break;
		case "U":
			System.out.println("20");
			break;
		default:
			System.out.println("Slovo koje ste uneli nije samoglasnik, pokusajte ponovo");
			break;
		}

	}

}
