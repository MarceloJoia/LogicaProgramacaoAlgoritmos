import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double MEDIA = 0;
		int COUNT = 0;
		while(N > 0) {
			MEDIA += N;
			COUNT += 1;

			N = sc.nextInt();
		}
		
		MEDIA /= (double)COUNT;
		
		System.out.printf("%.2f%n", MEDIA);
		
		sc.close();
	}
}
