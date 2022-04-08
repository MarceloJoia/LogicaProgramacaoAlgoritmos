import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			String S = "";
			String P = "";
			if (x % 2 == 0 && x != 0) {
				P = "EVEN ";
				if (x > 0) {
					S = "POSITIVE";
				} else {
					S = "NEGATIVE";
				}
			} else if (x == 0) {
				P = "";
				S = "NULL";
			} else {
				P = "ODD ";
				if (x > 0) {
					S = "POSITIVE";
				} else {
					S = "NEGATIVE";
				}
			}
			System.out.println(P + S);

		}

		sc.close();
	}

}
