import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto = 0.0;

		if(salario <= 2000.0) {
			System.out.println("Isento");
		} else if(salario > 2000.0 && salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		} else if(salario > 3000.0 && salario <= 4500.0) {
			imposto = 1000.0 * 0.08;
			imposto += (salario - 3000.0) * 0.18;
			System.out.printf("R$ %.2f%n", imposto);
		} else {
			imposto = 1000.0 * 0.08;
			imposto += 1500.0 * 0.18;
			imposto += (salario - 4500.0) * 0.28;
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}
}
