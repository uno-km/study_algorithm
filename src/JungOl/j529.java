package JungOl;

import java.util.Scanner;

public class j529 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = b + 100 - a;

		if (c > 0) {
			System.out.println(c);
			System.out.println("Obesity");
		} else {
			System.out.println(c);
		}
		sc.close();

	}

}
