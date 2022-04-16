import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vector = new double[N];
		
		for(int i=0; i<N; i++) {
			vector[i] = sc.nextDouble();
		}
		
		int maior = 0;
		int count = 0;
		for(int i=0; i<N; i++) {
			if(maior < vector[i]) {
				maior = (int)vector[i];
				count = i;
			}
		}

		System.out.printf("%.1f%n", vector[count]);
		System.out.println(count);
		
		sc.close();
	}
}
