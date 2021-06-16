package f_RepeatedControl1;

import java.util.Scanner;

public class j540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		for (;;) {
			num = sc.nextInt();
			if (num % 3 == 0) {
				System.out.println(num / 3);
			} else if (num == -1) {
				sc.close();
				break;
			}
		}
		sc.close();
	}

}
