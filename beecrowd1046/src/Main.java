import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int IN = sc.nextInt();
		int END = sc.nextInt();
		int TEMPO;

		if (IN > END || IN == END) {
			TEMPO = 24 - IN + END;
		} else {
			TEMPO = END - IN;
		}
		System.out.println("O JOGO DUROU " + TEMPO + " HORA(S)");
		sc.close();
	}
}
