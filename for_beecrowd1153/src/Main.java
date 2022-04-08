import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int fotorial = 1;
		for(int i = 1; i <= n; i++) {
			fotorial *= i;
		}
		
		System.out.println(fotorial);
		
		sc.close();
	}
}
