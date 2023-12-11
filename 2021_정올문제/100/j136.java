package f_RepeatedControl2;
import java.util.*;

public class j136 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = 0, y = 0;
		sc.close();
		for (i = 1; i <= 10; i++) {
			y = i * a;
			System.out.print(y + " ");
		}
	}

}
