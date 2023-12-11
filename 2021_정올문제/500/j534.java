package e_SelectAndControl;

import java.util.Scanner;

public class j534 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if (c == 'A') {
			System.out.print("Excellent");
		} else if (c == 'B') {
			System.out.print("Good");
		} else if (c == 'C') {
			System.out.print("Usually");
		} else if (c == 'D') {
			System.out.print("Effort");
		} else if (c == 'F') {
			System.out.print("Failure");
		} else {
			System.out.print("error");
		}
		sc.close();
	}

}
