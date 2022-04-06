import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X, COUNT;
		
		X = sc.nextInt();
		
		COUNT = 0;
		double media = 0.0;
		
		while(X > 0) {
			COUNT += 1;
			media += X;
			
			X = sc.nextInt();
		}
		
		if(media != 0.0) {
			media /= COUNT;
			System.out.printf("%.2f%n", media);
		} else {
			System.out.println("impossivel calcular");
		}
		
		sc.close();
	}
}
