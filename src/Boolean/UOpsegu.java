package Boolean;

import java.util.Scanner;

public class UOpsegu {

	public static void main(String[] args) {
		// Napisati program koji proverava dali je uneti broj u opsegu izmedju
		// 100 i 10 000 (uzeti i granice u obzir)

		boolean uOpsegu = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("Molimo Vas unesite broj: ");
		int x = sc.nextInt();
		sc.close();

		uOpsegu = x >= 100 && x <= 10000;

		if (uOpsegu) {
			System.out.println("Broj je u opsegu izmedju 100 i 10 000: ");
		} else {
			System.out.println("Broj nije u opsegu izmedju 100 i 10 000: ");
		}

	}

}
