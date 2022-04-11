import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 0;
		int coelho = 0;
		int rato = 0;
		int sapo = 0;
		for (int i = 0; i < n; i++) {
			int cobaia = sc.nextInt();
			String tipo = sc.next();
			count += cobaia;
			
			if (tipo.contains("C")) {
				coelho += cobaia;
			} else if (tipo.contains("R")) {
				rato += cobaia;
			} else {
				sapo += cobaia;
			}
		}

		System.out.println("Total: " + count + " cobaias");
		System.out.println("Total de coelhos: " + coelho);
		System.out.println("Total de ratos: " + rato);
		System.out.println("Total de sapos: " + sapo);
		
		double c = (double)(coelho * 100) / count;
		double r = (double)(rato * 100) / count;
		double s = (double)(sapo * 100) / count;
		System.out.printf("Percentual de coelhos: %.2f %%%n", c);
		System.out.printf("Percentual de ratos:  %.2f %%%n", r);
		System.out.printf("Percentual de sapos:  %.2f %%%n", s);

		sc.close();
	}
}
