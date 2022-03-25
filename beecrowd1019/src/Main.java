import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int HORA = N / 3600;
		int RESTO = N % 3600;;

		int MINUTO = RESTO / 60;

		int SEGUNDO = RESTO % 60;

		System.out.println(HORA + ":" + MINUTO + ":" + SEGUNDO);
		
		sc.close();
	}
}
