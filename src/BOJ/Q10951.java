package BOJ;


import java.util.Scanner;

public class Q10951 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if( a < 0 || b > 10) break;
			System.out.println(a+b);
		}
		scanner.close();
	}
}
