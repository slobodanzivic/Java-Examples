package DoWhile;

public class IspisBrojevaOd1Do5 {

	public static void main(String[] args) {
		
		// Java do-while petlja se koristi za iteraciju dijela programa nekoliko puta.
		// Ako broj iteracija nije fiksan, a petlja se mora izvršiti bar jednom, preporučuje se upotreba do-while petlje.
		// Ona se izvršava bar jednom zato što se uslov provjerava nakon tijela petlje.
		
		// Ispis prirodnih brojeva od 1 do 5

		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 5);

	}

}
