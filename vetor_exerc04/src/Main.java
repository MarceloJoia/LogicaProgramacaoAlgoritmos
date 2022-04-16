import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] notas = new double[N];

		for (int i = 0; i < N; i++) {
			notas[i] = sc.nextDouble();
		}

		double media = 0;
		for (double nota : notas) {
			media += nota / N;
		}
		System.out.printf("%.3f%n", media);
		
		for(int i=0; i<N; i++) {
			if(media > notas[i]) {
				System.out.printf("%.1f%n", notas[i]);
			}
		}

		sc.close();
	}

}
