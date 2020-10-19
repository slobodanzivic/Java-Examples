package DoWhile;

public class IspisOd5Do20Unazad {

	public static void main(String[] args) {
		// Java do-while petlja se koristi za iteraciju dijela programa nekoliko puta.
		// Ako broj iteracija nije fiksan, a petlja se mora izvršiti bar jednom, preporučuje se upotreba do-while petlje.
		// Ona se izvršava bar jednom zato što se uslov provjerava nakon tijela petlje.
		
		// Ispis prirodnih brojeve od 5 do 20 unazad

		int i = 20;
		do {
			System.out.println(i);
			i--;
		} while (i >= 5);
	}

}
