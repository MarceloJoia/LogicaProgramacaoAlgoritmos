import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int RESULT1 = (A + B + Math.abs(A - B)) / 2;
		int MAIOR = (RESULT1 + C + Math.abs(RESULT1 - C)) / 2;
		
		System.out.println(MAIOR + " eh o maior");
		
		sc.close();
	}
}
