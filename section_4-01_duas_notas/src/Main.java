import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();

		float media = n1 + n2;

		if (media < 60.00) {
			System.out.printf("NOTA FINAL = %.2f%nREPROVADO", media);
		} else {
			System.out.printf("NOTA FINAL = %.2f%n", media);
		}

		sc.close();
	}

}
