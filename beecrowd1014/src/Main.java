import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		float Y = sc.nextFloat();

		float CONSUMPTION = X / Y;

		System.out.printf("%.3f km/l%n", CONSUMPTION);

		sc.close();

	}

}
