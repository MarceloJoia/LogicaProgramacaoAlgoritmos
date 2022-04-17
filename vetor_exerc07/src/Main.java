import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] nomes = new String[N];
		double[] primeiroSemestre = new double[N];
		double[] segundoSemestre = new double[N];
		double[] media = new double[N];
		
		for(int i=0; i<N; i++) {
			nomes[i] = sc.next();
			primeiroSemestre[i] = sc.nextDouble();
			segundoSemestre[i] = sc.nextDouble();
		}

		for(int i=0; i<N; i++) {
			media[i] = (primeiroSemestre[i] + segundoSemestre[i]) / 2; 
		}
		
		System.out.println("Alunos aprovados:");
		for(int i=0; i<N; i++) {
			if(media[i] >= 6) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}

}
