import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		x = sc.nextDouble();
		y = sc.nextDouble();

		if(y > 0 && x > 0) {
			System.out.println("Q1");
		}
		else if(y < 0 && x < 0) {
			System.out.println("Q3");
		}
		else if(y > 0 && x < 0) {
			System.out.println("Q2");
		}
		else if(y < 0 && x > 0) {
			System.out.println("Q4");
		}
		else if(x == 0 && (y > 0 || y < 0)) {
			System.out.println("Eixo Y");
		}
		else if(y == 0 && (x > 0 || x < 0)) {
			System.out.println("Eixo X");
		}
		else {
			System.out.println("Origem");
		}

		sc.close();
	}

}
