package JungOl;

import java.util.Scanner;

public class j137 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.printf("%d ", i * j);
			}
			System.out.println();
		}
	}
}
