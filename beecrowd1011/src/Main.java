import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sn = new Scanner(System.in);

		double pi = 3.14159;
		double R = sn.nextDouble();
		double VOLUME = (4.0 / 3) * pi * Math.pow(R, 3);

		System.out.printf("VOLUME = %.3f%n", VOLUME);

		sn.close();
	}
}
