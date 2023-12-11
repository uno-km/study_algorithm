package JungOl;

import java.util.Scanner;

public class j133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0, i = 0;
		for (i = 0; i < a; i++) {
			int b = sc.nextInt();
			sum += b;
		}
		System.out.printf("%.2f", (double) sum / i);
		sc.close();
	}

}
