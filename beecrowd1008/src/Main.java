import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int F = sc.nextInt();
		int H = sc.nextInt();
		double V = sc.nextDouble();

		double SALARY = (double) H * V;

		System.out.println("NUMBER = " + F);
		System.out.printf("SALARY = U$ %.2f%n", SALARY);

		sc.close();
	}
}
