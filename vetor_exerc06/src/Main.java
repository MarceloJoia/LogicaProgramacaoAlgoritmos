import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] idades = new int[N];
		String[] nomes = new String[N];
		
		for(int i=0; i<N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
		}
		
		int pessoaMaisVelha = 0;
		int count = 0;
		for(int i=0; i<N; i++) {
			if(pessoaMaisVelha < idades[i]) {
				pessoaMaisVelha = idades[i];
				count = i;
			}
		}
		
		System.out.println("Pessoa mais velha: " + nomes[count]);
		
		sc.close();
	}

}
