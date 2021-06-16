package f_RepeatedControl3;

import java.util.Scanner;

public class j141 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), sum = 0;
		for (int i = 1; i < 100; i++) {
			if (i * a > 100) {
				break;
			} else {
				sum = i * a;
				System.out.print(sum + " ");
				if (sum % 10 == 0) {
					break;
				}
			}
		}
		sc.close();
	}

}
