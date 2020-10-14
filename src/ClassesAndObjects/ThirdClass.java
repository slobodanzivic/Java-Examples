package ClassesAndObjects;

public class ThirdClass {
	
	public void setData7() {
		
		System.out.println("Hello, I am in the method 7 in yhe ThirdClass.");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass fc = new FirstClass();
		SecondClass sc = new SecondClass();
		
		fc.setData1();
		fc.setData2();
		fc.setData3();
		fc.setData4();
		
		sc.setData5();
		sc.setData6();

	}

}
