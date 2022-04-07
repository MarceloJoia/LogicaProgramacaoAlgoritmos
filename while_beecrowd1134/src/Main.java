import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int C = sc.nextInt();

		int ALCOOL = 0;
		int GASOLINA = 0;
		int DIESEL = 0;

		while (C != 4) {
			switch (C) {
			case 1:
				ALCOOL += 1;
				break;
			case 2:
				GASOLINA += 1;
				break;
			case 3:
				DIESEL += 1;
				break;
			default:
				break;
			}
			C = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + ALCOOL);
		System.out.println("Gasolina: "+ GASOLINA);
		System.out.println("Diesel: " + DIESEL);

		sc.close();
	}

}
