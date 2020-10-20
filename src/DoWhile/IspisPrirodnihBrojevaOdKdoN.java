package DoWhile;

import java.util.Scanner;

public class IspisPrirodnihBrojevaOdKdoN {

	public static void main(String[] args) {
		// Ispisati  prirodne brojeve od k do n 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite k: ");
		int k = sc.nextInt();
		System.out.println("Unesite n: ");
		int n = sc.nextInt();
		sc.close();
		
		int i = k;
		
		do {
			System.out.println(i);
			i++;
		}
		while(i<=n);
	
	}

}
