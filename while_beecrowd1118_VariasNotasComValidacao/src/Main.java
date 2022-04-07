import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double N, MEDIA, COUNT;
		N = sc.nextDouble();

		MEDIA = 0;
		COUNT = 0;
		while (COUNT < 2) {

			if (N > 0 && N <= 10) {
				COUNT += 1;
				MEDIA += N;
			} else {
				System.out.println("nota invalida");
			}

			if (COUNT == 2) {
				MEDIA /= COUNT;
				System.out.printf("media = %.2f%n", MEDIA);

				int X = 0;
				while (X != 1 && X != 2) {
					System.out.println("novo calculo (1-sim 2-nao)");
					X = sc.nextInt();

					if (X == 1) {
						COUNT = 0;
						MEDIA = 0;
						N = 0;
					} else if (X == 2) {
						COUNT = 3;
					}
				}
			}
			
			if(COUNT != 3) {
				N = sc.nextDouble();
			}
		}

		sc.close();
	}

}
