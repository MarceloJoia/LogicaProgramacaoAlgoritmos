import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vector = new int[N];
		
		
		for(int i=0; i<N; i++) {
			 vector[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<N; i++) {
			 if(vector[i] % 2 == 0) {
				 System.out.print(vector[i] + " ");
			 }
		}
		System.out.println();
		
		int count = 0;
		for(int i=0; i<N; i++) {
			if(vector[i] % 2 == 0) {
				count ++;
			}
		}
		System.out.println(count);
		
		sc.close();

	}

}
