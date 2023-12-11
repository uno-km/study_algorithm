package JungOl;

import java.util.Arrays;
import java.util.Scanner;

public class j618 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] height = new int[5];
		double[] weight = new double[5];

		for (int i = 0; i < 5; i++) {
			name[i] = sc.next();
			height[i] = sc.nextInt();
			weight[i] = sc.nextDouble();
		}
		sc.close();

		Person4 p = new Person4(name, height, weight);
		p.nameSort();

		System.out.println();

		Person4 p2 = new Person4(name, height, weight);
		p2.weightSort();
	}
}

class Person4 {
	private String[] name = new String[5];
	private int[] height = new int[5];
	private double[] weight = new double[5];

	public Person4(String[] name, int[] height, double[] weight) {
		for (int i = 0; i < 5; i++) {
			this.name[i] = name[i];
			this.height[i] = height[i];
			this.weight[i] = weight[i];
		}
	}

	public void nameSort() {
		String[] name2 = { name[0], name[1], name[2], name[3], name[4] };
		Arrays.sort(name);

		System.out.println("name");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (name[i] == name2[j]) {
					System.out.print(name[i] + " ");
					System.out.print(height[j] + " ");
					System.out.printf("%.1f\n", weight[j]);
				}
			}
		}
	}

	public void weightSort() {
		double weight2[] = { weight[0], weight[1], weight[2], weight[3], weight[4] };
		Arrays.sort(weight);

		System.out.println("weight");
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (weight[i] == weight2[j]) {
					System.out.print(name[j] + " ");
					System.out.print(height[j] + " ");
					System.out.printf("%.1f\n", weight[i]);
				}
			}
		}
	}
}