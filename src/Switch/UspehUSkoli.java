package Switch;

import java.util.Scanner;

public class UspehUSkoli {

	public static void main(String[] args) {
		// Zavisno od unetog broja ispisati koji je uspeh postigao ucenik u skoli
		// u ostalim slucajevima ispisati poruku sa sadrzajem "Uneli ste pogresan broj!"
		// 1 - Nedovoljan
		// 2 - Dovoljan
		// 3 - Dobar
		// 4 - Vrlo dobar
		// 5 - Odlican
		// Zadatak uraditi koriscenjem SWITCH strukture.

		System.out.println("Unesite broj od 1 do 5: ");
		Scanner sc = new Scanner(System.in);
		int broj = sc.nextInt();

		String poruka = "Uneli ste pogresan broj!";

		switch (broj) {
		case 1:
			poruka = "Nedovoljan";
			break;
		case 2:
			poruka = "Dovoljan";
			break;
		case 3:
			poruka = "Dobar";
			break;
		case 4:
			poruka = "Vrlo dobar";
			break;
		case 5:
			poruka = "Odlican";
			break;
		default:
			poruka = "Uneli ste pogresan broj!";
			break;

		}
		System.out.println("Uspeh ovog ucenika je: " + poruka);
	}

}
