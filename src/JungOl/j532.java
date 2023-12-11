package JungOl;

import java.util.Scanner;

public class j532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		sc.close();
		if (a >= 4.0 && b >= 4.0) {
			System.out.println("A");
		} else if (a >= 3.0 && b >= 3.0) {
			System.out.println("B");

		} else {
			System.out.println("C");

		}
	}

}
