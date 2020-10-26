package Continue;

public class DemoClass {

	public static void main(String[] args) {
		// The continue statement breaks one iteration (in the loop),
		// if a specified condition occurs, and continues with the next iteration in the loop.
		// This example skips the value of 4:

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}

	}

}
