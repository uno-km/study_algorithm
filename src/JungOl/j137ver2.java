package JungOl;

import java.util.Scanner;

public class j137ver2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt();
		s.close();
		int arr[][] = new int[a][b];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 1) * (j + 1);
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}

}
