package main;

public class TemaCurs2 {

	public static void main(String[] args) {
		int a=3;
		int b= (a=2)*a;
		int c= b*(b=5);
		System.out.println("a="+ a + ", b="+ b +", c=" +c); // un sir de carcatere concatenate prin + unde a=2, b=4 (2*2), iar c=20 (4*5);
		
		}
	
}


