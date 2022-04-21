import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[][] mat = new double[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		float soma = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] > 0) {
					soma += mat[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.0f%n", soma);

		int linha = sc.nextInt();
		for (int i = linha; i == linha; i++) {
			System.out.print("LINHA ESCOLHIDA: ");
			for (int j = 0; j < N; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}

		int column = sc.nextInt();
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				System.out.print("COLUNA ESCOLHIDA: ");
			}
			for (int j = column; j == column; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
		}
		System.out.println();

		double[] vet = new double[N];
		for (int i = 0; i < N; i++) {
			vet[i] = mat[i][i];
		}

		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < N; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < N; i++) {
			for (int j=0; j<N; j++) {
				if(mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
			}
		}
		
		System.out.println("MATRIZ ALTERADA:");
		for (int i = 0; i < N; i++) {
			for (int j=0; j<N; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}
}
