import java.util.Locale;
import java.util.Scanner;

public class Main {

	/*
	 Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas.
	 Ao final mostrar uma mensagem com os nomes e a idade média entre essas pessoas,
	 com uma casa decimal, conforme exemplo.
	*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String NOME1 = sc.next();
		String NOME2 = sc.next();
		int IDADE1 = sc.nextInt();
		int IDADE2 = sc.nextInt();
		
		float MEDIA = (float) (IDADE1 + IDADE2) / 2;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos%n", NOME1, NOME2, MEDIA);
		
		sc.close();
	}
}
