package f_RepeatedControl1;

import java.util.Scanner;

public class j537 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		int i = 0;
		while (i <= input) {
			sum += i++;
		}
		System.out.println(sum);
		sc.close();
	}

}
