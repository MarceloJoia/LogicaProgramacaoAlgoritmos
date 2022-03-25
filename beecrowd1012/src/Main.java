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

		double TRIANGULO = (A * C) / 2;
		double CIRCULO = (Math.pow(C, 2)) * 3.14159;
		double TRAPEZIO = (A + B) * C / 2;
		double QUADRADO = B * B;
		double RETANGULO = A * B;

		System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f%n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
		System.out.printf("QUADRADO: %.3f%n", QUADRADO);
		System.out.printf("RETANGULO: %.3f%n", RETANGULO);

		sc.close();
	 }
}
