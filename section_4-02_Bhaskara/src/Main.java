import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B , C, DELTA, R1, R2;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		DELTA = Math.pow(B, 2) - 4.0 * A * C;
		
		if(A == 0 || DELTA < 0.0) {
			System.out.println("Impossivel calcular");
		} else { 
			R1 = (-B + Math.sqrt(DELTA)) / (2 * A);
			R2 = (-B - Math.sqrt(DELTA)) / (2 * A);
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
		}
		
		sc.close();
	}
}
