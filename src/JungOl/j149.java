package JungOl;

import java.util.Scanner;

public class j149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(), cnt = 1;
		for (int i = 0; i < c; i++) {

			for (int j = 0; j < c; j++) {

				System.out.print(cnt % 10 + " ");
				cnt += 2;
			}
			System.out.println();

		}
		sc.close();
	}

}
