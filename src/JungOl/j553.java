package JungOl;

import java.util.Scanner;

public class j553 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), sum = 0;
		char b = (int) 65;
//      System.out.println(b);
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a - i; j++) {
//              b += 1;
				System.out.printf("%c", b++);
			}
			System.out.println();
		}
		sc.close();
	}
}
