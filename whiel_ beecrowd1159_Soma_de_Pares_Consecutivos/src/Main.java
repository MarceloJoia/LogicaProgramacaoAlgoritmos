import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int R = 0;
		int count = 0;
		int total = 0;
		while(X != 0) {
			if(X % 2 == 0) {
				R = X;
				while(count < 4) {
					count += 1;
					X += 2;
					total += X;
				}
				total += R;
				System.out.println(total);
				X = 0;
				R = 0;
				count = 0;
				total = 0;
			} else {
				R = X + 1;
				X += 1;
				while(count < 4) {
					count += 1;
					X += 2;
					total += X;
				}
				total += R; 
				System.out.println(total);
				X = 0;
				R = 0;
				count = 0;
				total = 0;
			}
			
			X = sc.nextInt();
		}
		
		sc.close();
	}
}
