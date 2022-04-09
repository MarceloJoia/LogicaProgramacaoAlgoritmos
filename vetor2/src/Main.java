import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		
		for(int i=0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if(A[i] < 0) {
				System.out.println(A[i]);
			}
		}
		
		sc.close();
	}
}
