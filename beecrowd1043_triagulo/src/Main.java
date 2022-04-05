import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, X;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		if(A + B > C && B + C > A && C + A > B) {
			X = A + B + C;
			System.out.printf("Perimetro = %.1f%n", X);
		} else {
			X = ((A + B) * C) / 2;
			System.out.printf("Area =  %.1f%n", X);
		}
		
		sc.close();
	}
}
