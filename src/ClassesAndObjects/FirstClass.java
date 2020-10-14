package ClassesAndObjects;

public class FirstClass {

	int b = 5;
	String s = "Java";
	double pi = 3.14;

	public void setData1() {

		System.out.println("Hello, I am in the setData1 method in the FirstClass.");

	}

	public int setData2() {
		int a = 2;
		System.out.println(a);
		return a;
	}

	public String setData3() {
		String name = "Slobodan";
		System.out.println(name);
		return name;
	}
	
	public double setData4() {
		double d = 2.5;
		System.out.println(d);
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass fc = new FirstClass();
		SecondClass sc = new SecondClass();
		ThirdClass tc = new ThirdClass();
		fc.setData1();
		fc.setData2();
		fc.setData3();
		fc.setData4();
		sc.setData5();
		sc.setData6();
		tc.setData7();
		System.out.println(fc.b);
		System.out.println(fc.s);
		System.out.println("Number pi has value of:" + fc.pi);

	}

}
