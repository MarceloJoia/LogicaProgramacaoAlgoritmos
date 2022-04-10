import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		int key = 1;


		for (int i=2; i<=100; i++) {
			int x = sc.nextInt();
			if (x > n) {
				n = x;
				key = i;
			}
		}

		System.out.println(n);
		System.out.println(key);
		
		sc.close();
	}
}
