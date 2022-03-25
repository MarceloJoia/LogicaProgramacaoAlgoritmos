import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int Z = sc.nextInt();

		int RESULT = 2 * Z;

		System.out.println(RESULT + " minutos");

		sc.close();
	}
}
