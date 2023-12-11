package JungOl;

import java.util.Scanner;

public class j526 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int min = (int) a;
		int min2 = (int) b;
		System.out.printf("%d %d", (int) (a * b), min * min2);
		sc.close();
	}

}
