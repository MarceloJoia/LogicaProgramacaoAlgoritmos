import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		while (N != 0) {

			int count = 0;
			for (int i = 1; i<N; i++) {
				count = i;
				System.out.print(count + " ");
			}
			System.out.println(count + 1);
			N = sc.nextInt();
		}

		System.out.print(N);

		sc.close();
	}

}
