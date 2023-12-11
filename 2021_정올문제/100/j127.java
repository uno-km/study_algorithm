package f_RepeatedControl1;

import java.util.Scanner;

public class j127 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sca = new Scanner(System.in)) {
			int sum = 0, i = 0;
			for (;;) {
				int input = sca.nextInt();
				if (input >= 0 && input <= 100) {
					sum += input;
					i++;
				} else {
					System.out.printf("sum : %d%navg : %.1f", sum, (double) sum / i);
					break;
				}
			}
			sca.close();
		}
	}

}
