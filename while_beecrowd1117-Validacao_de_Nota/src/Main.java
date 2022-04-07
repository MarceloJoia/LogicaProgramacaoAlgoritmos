import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int COUNT;
		double NOTA, MEDIA;

		NOTA = sc.nextDouble();

		COUNT = 0;
		MEDIA = 0.0;
		while (COUNT < 2) {
			if (NOTA >= 0.0 && NOTA <= 10.0) {
				MEDIA += NOTA;
				COUNT += 1;
			} else {
				System.out.println("nota invalida");
			}
			if(COUNT < 2 ) {
				NOTA = sc.nextDouble();
			}
		}

		MEDIA /= COUNT;
		System.out.printf("media = %.2f%n", MEDIA);

		sc.close();
	}
}
