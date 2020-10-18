package Switch;

import java.util.Scanner;

public class DaniUNedelji {

	public static void main(String[] args) {
		// Zavisno od unetog broja ispisati koji je dan u nedelji
		// u ostalim slucajevima prijaviti gresku i odgovarajucu poruku.
		// 1 - Ponedeljak
		// 2 - Utorak itd...
		// Zadatak uraditi koriscenjem SWITCH strukture.

		System.out.println("Uneti broj od 1 do 7: ");
		Scanner sc = new Scanner(System.in);
		int broj = sc.nextInt();
		sc.close();

		String dan = "Greska, Molimo Vas da unesete broj od 1 do 7.";

		switch (broj) {
		case 1:
			dan = "Ponedeljak";
			break;

		case 2:
			dan = "Utorak";
			break;

		case 3:
			dan = "Sreda";
			break;

		case 4:
			dan = "Cetvrtak";
			break;

		case 5:
			dan = "Petak";
			break;

		case 6:
			dan = "Subota";
			break;

		case 7:
			dan = "Nedelja";
			break;

		default:
			dan = "Greska, Molimo Vas da unesete broj od 1 do 7.";
			break;
		}

		System.out.println("Dan je : " + dan);

	}
}
