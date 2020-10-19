package DoWhile;

public class IspisParnihBrojevaOd1Do10 {

	public static void main(String[] args) {
		// Java do-while petlja se koristi za iteraciju dijela programa nekoliko puta.
		// Ako broj iteracija nije fiksan, a petlja se mora izvršiti bar jednom, preporučuje se upotreba do-while petlje.
		// Ona se izvršava bar jednom zato što se uslov provjerava nakon tijela petlje.
		
		// Ispisati Parne Brojeve od 1 do 10

		int i = 1;

		do {
			if (i % 2 == 0)
				System.out.println(i);
			i++;

		} while (i <= 10);

	}

}
