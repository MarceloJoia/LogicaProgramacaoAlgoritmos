import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		double AREA = A * B;
		double PERIMETRO = 2 * (A + B);
		double C = Math.pow(A, 2) + Math.pow(B, 2);
		double DIAGONAL = Math.sqrt(C);
		
		System.out.printf("AREA = %.4f%n", AREA);
		System.out.printf("PERIMETRO = %.4f%n", PERIMETRO);
		System.out.printf("DIAGONAL = %.4f%n", DIAGONAL);
		
		sc.close();

	}

}
