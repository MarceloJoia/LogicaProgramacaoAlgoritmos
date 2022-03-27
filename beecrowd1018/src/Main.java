import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N, NOTA, RESULT, RESTO;
		
		N = sc.nextInt();
		System.out.println(N);
		
		RESTO = N;
		
		NOTA = 100;
		RESULT = RESTO / NOTA;
		System.out.println(RESULT + " nota(s) de R$ " + NOTA + ",00");
		RESTO = RESTO % NOTA;
		
		NOTA = 50;
		RESULT = RESTO / NOTA;
		System.out.println(RESULT + " nota(s) de R$ " + NOTA + ",00");
		RESTO = RESTO % NOTA;
		
		NOTA = 20;
		RESULT = RESTO / NOTA;
		System.out.println(RESULT + " nota(s) de R$ " + NOTA + ",00");
		RESTO = RESTO % NOTA;
		
		NOTA = 10;
		RESULT = RESTO / NOTA;
		System.out.println(RESULT + " nota(s) de R$ " + NOTA + ",00");
		RESTO = RESTO % NOTA;
		
		NOTA = 5;
		RESULT = RESTO / NOTA;
		System.out.println(RESULT + " nota(s) de R$ " + NOTA + ",00");
		RESTO = RESTO % NOTA;
		
		NOTA = 2;
		RESULT = RESTO / NOTA;
		System.out.println(RESULT + " nota(s) de R$ " + NOTA + ",00");
		RESTO = RESTO % NOTA;
		
		NOTA = 1;
		RESULT = RESTO / NOTA;
		System.out.println(RESULT + " nota(s) de R$ " + NOTA + ",00");
		RESTO = RESTO % NOTA;
		
		sc.close();
	}
}
