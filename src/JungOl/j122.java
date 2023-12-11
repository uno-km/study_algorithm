package JungOl;
import java.util.*;

public class j122 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		sc.close();
		if (y != 0) {
			if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0) {
				System.out.println("leap year");
			} else {
				System.out.println("commen year");
			}
		}
	}

}
