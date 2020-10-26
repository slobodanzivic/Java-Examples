package Break;

public class DemoClass {

	public static void main(String[] args) {
		// The break statement can also be used to jump out of a loop.
		// This example jumps out of the loop when i is equal to 4:
		for (int i = 0; i < 10; i++) {
		      if (i == 4) {
		        break;
		      }
		      System.out.println(i);
		    }  

	}

}
