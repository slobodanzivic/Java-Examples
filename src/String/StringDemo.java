package String;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = " Slobodan Zivic";
		String b = "Slobodan/Zivic";
		

		System.out.println(a.charAt(3));
		System.out.println(a.indexOf("Z"));
		
		System.out.println(a.substring(3));
		System.out.println(a.substring(2, 11));
		
		System.out.println(a.concat(" is looking for job opportynity in QA."));
		System.out.println(a.length());
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		System.out.println(a.trim());
		
		String arr[] = b.split("/");
		String name = arr[0];
		String surname = arr[1];
		System.out.println(name);
		System.out.println(surname);
		
		System.out.println(a.replace("Z", "Ž"));
		
		
		
	}

}
