import java.util.Scanner;

public class Main {
	
	/**
	 * Um n�mero � multiplo de outro quando o resto da divis�o � = 0;
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();

		
		if(A % B == 0 ||  B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}
}
