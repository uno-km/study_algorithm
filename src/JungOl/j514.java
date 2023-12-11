package JungOl;

import java.util.Scanner;

public class j514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("height = ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.printf("Your height is %dcm.%n", num);
		scanner.close();
	}

}
