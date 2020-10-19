package VeciILIManjiOdNule;
import java.util.Scanner;

public class DaLiJeBrojVeciOdNuleIliNe {

	public static void main(String[] args) {
		// Napisati program koji za zadati broj prikazuje da li je veci ili manji od
		// nule

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int x = sc.nextInt();
		sc.close();

		// int x = 0;

		if (x > 0) {
			System.out.println("Broj je veci od nule.");
		} else {
			System.out.println("Broj je manji od nule.");

		}

	}
}
