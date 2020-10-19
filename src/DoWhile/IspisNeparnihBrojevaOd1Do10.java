package DoWhile;

public class IspisNeparnihBrojevaOd1Do10 {

	public static void main(String[] args) {
		// Java do-while petlja se koristi za iteraciju dijela programa nekoliko puta.
		// Ako broj iteracija nije fiksan, a petlja se mora izvršiti bar jednom, preporučuje se upotreba do-while petlje.
		// Ona se izvršava bar jednom zato što se uslov provjerava nakon tijela petlje.
		
		// Ispisati Neparne prirodne brojeve od 1 do 10

		int i = 1;

		do {
			if (i % 2 == 1)
				System.out.println(i);
			i++;
		} while (i <= 10);

	}

}
