package JungOl;
import java.util.*;

public class j123 {

	public static void main(String[] args) {
		System.out.print("Number? ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		if (a == 1) {
			System.out.println("dog");
		} else if (a == 2) {
			System.out.println("cat");
		} else if (a == 3) {
			System.out.println("chick");
		} else {
			System.out.println("I don't know.");
		}
	}

}
