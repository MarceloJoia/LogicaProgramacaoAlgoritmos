import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int COD = sc.nextInt();
		int QTY = sc.nextInt();
		double PRICE;
		
		switch (COD) {
		case 1:
			PRICE = QTY * 4f;
			System.out.printf("Total: R$ %.2f%n", PRICE);
			break;
		case 2:
			PRICE = (double) QTY * 4.50;
			System.out.printf("Total: R$ %.2f%n", PRICE);
			break;
		case 3:
			PRICE = (double) QTY * 5f;
			System.out.printf("Total: R$ %.2f%n", PRICE);
			break;
		case 4:
			PRICE = (double) QTY * 2f;
			System.out.printf("Total: R$ %.2f%n", PRICE);
			break;
		case 5:
			PRICE = (double) QTY * 1.5;
			System.out.printf("Total: R$ %.2f%n", PRICE);
			break;
		default:
			System.out.println("Produto não encontrado.");
		}		
		
		sc.close();

	}

}
