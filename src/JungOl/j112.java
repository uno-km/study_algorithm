package JungOl;

import java.util.Scanner;

public class j112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int i = a / b;
		int j = a % b;

		System.out.printf("%d / %d = %d...%d", a, b, i, j);
		sc.close();
	}

}
