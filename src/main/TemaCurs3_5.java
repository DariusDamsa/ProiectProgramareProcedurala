package main;

public class TemaCurs3_5 {

	public static void main(String[] args) {
		String str = "indragostit";
		String Ustr="";
		
		
		for(int i=0; i<str.length(); i++) {
			if (i % 2 == 1) {
			Ustr +=  str.toUpperCase().charAt(i);
			}
			else {
			Ustr += str.charAt(i);
			}
		}
		
			System.out.println(str);
			System.out.println(Ustr);
		
		
		
		

	}

}