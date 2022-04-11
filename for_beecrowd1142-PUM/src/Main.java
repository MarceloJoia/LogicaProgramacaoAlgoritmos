import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 0;
		for (int i = 0; i<n*4; i++) {
			count++;
			if (count <= 3) {
				System.out.print(i + " ");
			} else {
				System.out.println(" PUM");
				count = 0;
			}
		}

		sc.close();
	}
}
