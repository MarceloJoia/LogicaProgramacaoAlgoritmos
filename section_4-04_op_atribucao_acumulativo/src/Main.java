import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int TEMPO = sc.nextInt(); 
		double VALUE = 50.0;
		
		
		if(TEMPO <= 100) {
			System.out.printf("Valor a pagar: R$ %.2f%n", VALUE);
		} else {
			VALUE += (double)(TEMPO - 100) * 2.0;
			System.out.printf("Valor a pagar: R$ %.2f%n", VALUE);
		}
		
		sc.close();
	}
}
