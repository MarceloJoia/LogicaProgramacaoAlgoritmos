import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double valorMetroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = valorMetroQuadrado * area;
		
		System.out.printf("AREA %.2f%nPRE?O %.2f%n", area, preco);
		
		sc.close();
	}
}
