package WhileLoop;

public class IspisNeparnihPrirodnihBrojevaOd1Do17 {

	public static void main(String[] args) {
		// Ispisati parne prirodne brojeva od 1 do 17 u rastucem redosledu .
		// Zadatak uraditi koriscenjem WHILE petlje.

		int i = 1;

		while (i <= 17) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
