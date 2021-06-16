package f_RepeatedControl2;
import java.util.*;

public class j546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, b = sc.nextInt();
		for (int i = 0; i < b; ++i) {
			int a = sc.nextInt();
			sum += a;
		}
		sc.close();
		System.out.printf("avg : %.1f %n%s", (double) sum / b, (double) sum / b >= 80 ? "pass" : "fail");
	}
}
