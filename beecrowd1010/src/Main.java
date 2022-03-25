import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int COD1 = sc.nextInt();
		int NPC1 = sc.nextInt();
		double VUN1 = sc.nextDouble();
		
		int COD2 = sc.nextInt();
		int NPC2 = sc.nextInt();
		double VUN2 = sc.nextDouble();
		
		double AMOUNT = NPC1 * VUN1 + NPC2 * VUN2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", AMOUNT);
				
		sc.close();
	}
}
