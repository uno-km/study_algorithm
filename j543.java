package f_RepeatedControl2;

import java.util.Scanner;

public class j543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		for (int i = 1; i <= a; i++)
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
	}

}
