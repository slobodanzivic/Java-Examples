package DoWhile;

public class SumaPrvih100brojeva {

	public static void main(String[] args) {
		// Saberi prirodne brojeve do 100.

		int i = 1;
		int sum = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= 100);
		System.out.println("Suma prvih 100 brojeva je : " + sum);

	}

}
