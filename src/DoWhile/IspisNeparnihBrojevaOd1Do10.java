package DoWhile;

public class IspisNeparnihBrojevaOd1Do10 {

	public static void main(String[] args) {
		// Ispisati Neparne prirodne brojeve od 1 do 10

		int i = 1;

		do {
			if (i % 2 == 1)
				System.out.println(i);
			i++;
		} while (i <= 10);

	}

}
