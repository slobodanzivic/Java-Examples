package ProizvodBrojeva;

public class ProizvodNeparnihBrojeva {

	public static void main(String[] args) {
		// Izračunati proizvod neparnih prirodnih brojeva od 1 do 5.

		int i, p = 1;

		for (i = 1; i <= 5; i++) {
			if (i % 2 != 0) // if (i % 2 == 1)
				p = p * i;
		}
		
		System.out.println("Proizvod neparnih prirodnih brojeva od 1 do 5 je: " + p);
	}

}
