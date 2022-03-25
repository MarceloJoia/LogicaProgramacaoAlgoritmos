import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X1 = sc.nextDouble();
		double Y1 = sc.nextDouble();
		
		double X2 = sc.nextDouble();
		double Y2 = sc.nextDouble();
		
		double P1 = (X2 - X1);
		double P2 = Y2 - Y1;
		
		double DISTANCIA = Math.sqrt(Math.pow(P1, 2) + Math.pow(P2, 2));
		
		System.out.printf("%.4f%n", DISTANCIA);
		
		sc.close();
	}
}
