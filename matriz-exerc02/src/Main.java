import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] mat = new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int[] soma = new int[N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				soma[i] += mat[i][j];
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(soma[i]);
		}
		
		sc.close();
	}
}
