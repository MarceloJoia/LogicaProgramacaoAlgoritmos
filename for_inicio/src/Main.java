import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		int SOMA = 0;
		for(int i = 0; i < N; i++) {
			int X = sc.nextInt();
			SOMA += X;
		}
		
		System.out.println(SOMA);
		
		sc.close();
	}
}
