import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double media = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5);
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		sc.close();
	}
}
