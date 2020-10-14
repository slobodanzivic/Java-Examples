package IfCondition;

import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter a number:  ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();

		if (number >= 5) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}

	}

}
