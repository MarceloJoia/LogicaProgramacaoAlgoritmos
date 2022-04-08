import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			double X = sc.nextDouble();
			double Y = sc.nextDouble();
			
			if(Y != 0) {
				double result = X / Y;
				System.out.printf("%.1f%n",result);
			} else {
				System.out.println("divisao impossivel");
			}
		}
		sc.close();
	}
}
