import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X, Y;
		X = sc.nextInt();
		Y = sc.nextInt();

		int count = 0;
		for(int i=1; i<=Y; i++) {
			count += 1; 
			if(count < X) {
				System.out.print(i + " ");
			} else if(count == X) {
				System.out.println(i);
				count = 0;
			}
		}
		
		sc.close();
	}
}
