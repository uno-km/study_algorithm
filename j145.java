package f_RepeatedControl3;
import java.util.*;
public class j145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.close();
		for (int i = 0; i < c ; i++) {
			for (int k = 0; k < c - 1 - i; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i+1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
