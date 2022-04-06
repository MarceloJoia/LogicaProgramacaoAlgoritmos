import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X, Y;

		X = sc.nextInt();
		Y = sc.nextInt();

		while (X != Y) {
			if (X < Y) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}
			
			X = sc.nextInt();
			Y = sc.nextInt();
		}

		sc.close();
	}

}
