package c_Operator;

import java.util.Scanner;

public class j521 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int j = sc.nextInt();
		--j;
		int num = i * j;
		i++;

		System.out.printf("%d%n", i);
		System.out.printf("%d%n", j);
		System.out.printf("%d", num);
		sc.close();
	}

}
