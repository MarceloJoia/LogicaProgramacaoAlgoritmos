import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		float N1, N2, N3, N4, MEDIA, EXAME;
		N1 = sc.nextFloat();
		N2 = sc.nextFloat();
		N3 = sc.nextFloat();
		N4 = sc.nextFloat();
		MEDIA = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / (2 + 3 + 4 + 1);

		System.out.printf("Media: %.1f%n", MEDIA);

		if (MEDIA >= 5.0 && MEDIA < 7.0) {
			System.out.println("Aluno em exame.");

			EXAME = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", EXAME);

			MEDIA = (MEDIA + EXAME) / 2;
			if (MEDIA >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n", MEDIA);

		} else if (MEDIA >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");
		}

		sc.close();
	}
}
