package ProizvodBrojeva;

public class ProizvodBrojeva {

	public static void main(String[] args) {
		// Izračunati proizvod parnih prirodnih brojeva od 1 do 5.

		int i, p = 1;

		for (i = 1; i <= 5; i++) {
			if (i % 2 == 0) 
				System.out.println(i);
				p = p * i;
		}
		System.out.println("proizvod je: " + p);
	}

}
