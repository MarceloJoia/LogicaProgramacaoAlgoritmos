import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, pass;
		
		x = sc.nextInt();
		
		pass = 2002;
		
		while(x != pass) {
			System.out.println("Senha Invalida");
			x = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}
}
