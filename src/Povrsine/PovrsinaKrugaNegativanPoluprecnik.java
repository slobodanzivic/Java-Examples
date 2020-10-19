package Povrsine;

import java.util.Scanner;

public class PovrsinaKrugaNegativanPoluprecnik {

	public static void main(String[] args) {
		// Izracunati povrsinu kruga unetog poluprecnika
		// Ukoliko je uneta vrednost za poluprecnik negativna ispisati gresku.

		System.out.println("Uneti vrednost poluprecnika: ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double p;

		if (r > 0) {
			p = r * r * 3.14;
			System.out.println("Povrsina kruga je:" + p);
		} else {
			System.out.println("Greska, r ne sme biti nula ili  negativan broj.");
		}

	}

}
