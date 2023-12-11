package JungOl;

import java.util.Scanner;

public class j531 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		sc.close();
		if (a <= 50.8) {
			System.out.println("Flyweight");
		} else if (a <= 61.23) {
			System.out.println("Lightweight");

		} else if (a <= 72.57) {
			System.out.println("Middleweight");

		} else if (a <= 88.45) {
			System.out.println("Cruiserweight");
		} else if (a > 88.45) {
			System.out.println("Heavyweight");
		}

	}
}
