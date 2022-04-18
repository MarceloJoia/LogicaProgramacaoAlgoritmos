import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] alturas = new double[N];
		String[] sexos = new String[N];

		for (int i = 0; i < N; i++) {
			alturas[i] = sc.nextDouble();
			sexos[i] = sc.next();
		}
		
		double maisAlto = 0.0;
		for(int i=0; i<N; i++) {
			if(maisAlto < alturas[i]) {
				maisAlto = alturas[i];
			}
		}
		
		double maisBaixo = maisAlto;
		for(int i=0; i<N; i++) {
			if(maisBaixo > alturas[i]) {
				maisBaixo = alturas[i];
			}
		}
		System.out.printf("Menor altura = %.2f%n",maisBaixo);
		System.out.printf("Maior altura = %.2f%n",maisAlto);
		
		double alturaMulheres = 0.0;
		int count = 0;
		int homens = 0;
		for(int i=0; i<N; i++) {
			if(sexos[i].contains("F")) {
				alturaMulheres += alturas[i];
				count ++;
			} else {
				homens++;
			}
		}
		
		alturaMulheres /= (double)count;
		System.out.printf("Media das alturas das mulheres = %.2f%n", alturaMulheres);
		System.out.println("Numero de homens = " + homens);

		sc.close();

	}

}
