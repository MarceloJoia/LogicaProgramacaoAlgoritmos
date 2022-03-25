import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in); double x;
		 * x = sc.nextDouble(); System.out.println("Você digitou: " + x);
		 * System.out.printf("Você digitou: %.2f%n", x); sc.close();
		 */

		/*
		 * Scanner sc = new Scanner(System.in); char n; n = sc.next().charAt(0);
		 * System.out.println("Você digitou: " + n); sc.close();
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.printf("%s tem %d anos e recebou R$ %.2f", x, y, z);

		sc.close();
	}
}
