package main;

public class TemaCurs3_6 {

	public static void main(String[] args) {
		int[] N = new int[] {4, 7, 26};
		double[] M = new double[N.length];
		double K = 5.45;
		for(int i = 0; i < N.length; i++)
			M[i] = N[i] + K;
		
		System.out.print("Numerele intregi dupa adaugarea valorii double sunt: ");
		for(int i = 0; i < M.length; i++)
			System.out.print(M[i] + ", ");

}
	}


