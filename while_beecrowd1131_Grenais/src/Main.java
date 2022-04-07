import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int inter, gremio, grenal, interM, gremioM, count, empates;

		inter = sc.nextInt();
		gremio = sc.nextInt();

		count = 0;
		grenal = 0;
		interM = 0;
		gremioM = 0;
		empates = 0;

		while (count == 0) {
			if(inter > gremio) {
				interM += 1;
			} else if(inter < gremio) {
				gremioM += 1;
			} else {
				empates += 1;
			}
			
			grenal += 1;

			int x = 0;
			while (x != 1 && x != 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				x = sc.nextInt();

				if (x == 1) {
					inter = sc.nextInt();
					gremio = sc.nextInt();
				} else if (x == 2) {
					count = 1;

					System.out.println(grenal + " grenais");
					System.out.println("Inter:" + interM);
					System.out.println("Gremio:" + gremioM);
					System.out.println("Empates:" + empates);

					if (interM > gremioM) {
						System.out.println("Inter venceu mais");
					} else {
						System.out.println("Gremio venceu mais");
					}
				}
			}
		}

		sc.close();
	}
}
