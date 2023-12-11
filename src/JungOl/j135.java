package JungOl;
import java.util.*;

public class j135 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0, y = 0, i = 0;
		int min = 0;
		int max = 0;
		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		sc.close();

		for (i = min; i <= max; i++) {
			if (i != 0) {
				if (i % 3 == 0 || i % 5 == 0) {
					y++;
					sum += i;
				}

			}
		}
		System.out.printf("sum : %d%navg : %.1f", sum, (double) sum / y);
	}

}
