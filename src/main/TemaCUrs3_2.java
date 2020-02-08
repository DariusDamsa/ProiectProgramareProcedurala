package main;

public class TemaCUrs3_2 {

	public static void main(String[] args) {
		int[] N = new int[] {3,1,90,7,15,25,13,36,19,45};
		int min = N[0];
		int max = N[0];
		for(int i = 0; i < 10; i++)
			
		{
			
			if(N[i] < min)
				min = N[i];
			if(N[i] > max)
				max = N[i];
			
		}
		
		System.out.println("Minim: " + min);
		System.out.println("Maxim: " + max);
		
	}

}
