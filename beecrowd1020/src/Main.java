import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, ANO, MES, DIA, RESTO;
		N = sc.nextInt();
		
		ANO = N / 365;
		RESTO = N % 365;
		MES = RESTO / 30;
		DIA = RESTO % 30;
		
		System.out.println(ANO + " ano (s)");
		System.out.println(MES + " mes (es)");
		System.out.println(DIA + " dia (s)");
			
		sc.close();
	}
}
