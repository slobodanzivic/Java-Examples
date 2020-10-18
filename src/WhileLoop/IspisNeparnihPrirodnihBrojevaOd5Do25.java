package WhileLoop;

public class IspisNeparnihPrirodnihBrojevaOd5Do25 {

	public static void main(String[] args) {
		// Ispisati neparne prirodne brojeva od 5 do 25 u opadajucem redosledu .
		// Zadatak uraditi koriscenjem WHILE petlje.

		int i = 25;
		while (i >= 1) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i--;
		}
	}
}
