import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int p = x;
		int g = y;
		
		if(x > y) {
			p = y;
			g = x;
		}
		
		int soma = 0;
		for(int i = p; i <= g; i++) {
			if(i % 13 != 0) {
				soma += i; 
			}
		}
		System.out.println(soma);
		
		sc.close();

	}

}
