package Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// Učitati i ispisati članove niza.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n: ");
		int n = sc.nextInt();
		
		int niz[] = new int[n]; // rezervisanje prostora za niz od n clanova
		System.out.println("Unesite clanove niza:");
		for (int i = 0; i < niz.length; i++)
			niz[i] = sc.nextInt(); // ucitaj niz[i] - i-ti clan niza

		for (int i = 0; i < niz.length; i++)
			System.out.println(niz[i]); // ispis niz[i] - i-ti clan niza

	}

}
