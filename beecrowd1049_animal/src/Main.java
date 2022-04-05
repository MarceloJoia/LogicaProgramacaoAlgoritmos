import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String group = sc.next();
		String category = sc.next();
		String type = sc.next();

		if (group.equals("vertebrado")) {
			if (category.equals("ave")) {
				if (type.equals("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (type.equals("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		}
		else {
			if (category.equals("inseto")) {
				if (type.equals("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (type.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}
		}

		sc.close();
	}

}
