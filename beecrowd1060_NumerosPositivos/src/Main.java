import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1, n2, n3, n4, n5, n6;

		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		n5 = sc.nextDouble();
		n6 = sc.nextDouble();

		ArrayList<Integer> list = new ArrayList<>();
		if (n1 > 0) {
			list.add((int) n1);
		}
		if (n2 > 0) {
			list.add((int) n2);
		}
		if (n3 > 0) {
			list.add((int) n3);
		}
		if (n4 > 0) {
			list.add((int) n4);
		}
		if (n5 > 0) {
			list.add((int) n5);
		}
		if (n6 > 0) {
			list.add((int) n6);
		}
		
		int array = list.size();
		
		System.out.println(array + " valores positivos");

		sc.close();
	}

}
