import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vector = new int[N];
		double[] pares = new double[N];
		
		for(int i=0; i<N; i++) {
			vector[i] = (int)sc.nextDouble();
		}
		
		int count = 0;
		for(int i=0; i<N; i++) {
			if(vector[i] % 2 == 0) {
				pares[i] = (double)vector[i];
				count++;
			}
		}
		
		double media = 0;
		for(int i=0; i<N; i++) {
			media += pares[i];
		}
		
		if(media != 0) {
			System.out.printf("%.1f%n", media/count);
		} else {
			System.out.printf("Nao havia nenhum numero par");
		}
		
		sc.close();
	}
}
