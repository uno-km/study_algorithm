package JungOl;

import java.util.Scanner;

public class j544 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), sum = 0;
		sc.close();
		for (int i = a; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
