package ZadatakKreditIKamata;

import java.util.Scanner;

public class Credit {

	public static void main(String[] args) {
		// Napisati program koji ucitava iznos podignutog kredita i procenat kamatne
		// stope.
		// Program treba da ispise kolicinu novca koju je potrebno vratiti banci.
		// Kolicina novca potrebna za vracanje se racuna po sledecoj formuli:
		// kNovca = iznosKredita*(1+0.01*kamata)
		// Iznos i kamata se ucitavaju sa tastature

		System.out.println("Iznos podignutog kredita je: ");
		Scanner sc = new Scanner(System.in);
		double iznosKredita = sc.nextDouble();

		System.out.println("Procenat kamatne stope je : ");
		double kamata = sc.nextDouble();
		sc.close();

		double kNovca = iznosKredita * (1 + 0.01 * kamata);

		System.out.println("Banci je potrebno vratiti: " + kNovca);

	}

}
