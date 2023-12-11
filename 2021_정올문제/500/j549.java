package f_RepeatedControl3;

import java.util.Scanner;

public class j549 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), sum = 0, cnt = 0;
		sc.close();
		for (int i = 0; i <= a; i++) {
			if (i % 2 != 0) {
				sum += i;
				cnt++;
				if (sum >= a) {
					break;
				}
			}
		}
		System.out.printf("%d %d", cnt, sum);
	}

}
