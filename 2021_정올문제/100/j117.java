package d_Debugging;

import java.util.Scanner;

public class j117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		int x = (int) a;
		int y = (int) b;
		int z = (int) c;
		int k = (int) (a + b + c) / 3;
		System.out.printf("sum %d\navg %d", x + y + z, k);
		sc.close();
	}

}
