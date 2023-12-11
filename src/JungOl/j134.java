package JungOl;
import java.util.*;

public class j134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			if (n % 2 == 0 && n != 0) {
				a++;
			} else {
				b++;
			}
		}
		sc.close();
		System.out.printf("even : %d%nodd : %d", a, b);
	}

}
