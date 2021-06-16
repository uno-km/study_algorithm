package k_Struct;

import java.util.Scanner;

public class j616 {
	double center(int a, int b, int c) {
		return (double) (a + b + c) / 3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		int z1 = sc.nextInt();
		int z2 = sc.nextInt();
		sc.close();
		Triangle t = new Triangle(x1, y1, z1);
		Triangle t2 = new Triangle(x2, y2, z2);
		j616 j = new j616();
		double xx = j.center(t.getX(), t.getY(), t.getZ());
		double yy = j.center(t2.getX(), t2.getY(), t2.getZ());
		System.out.printf("(%.1f, %.1f)", xx, yy);
	}

}

class Point {
	private int x;
	private int y;
	private int z;

	Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}
}

class Triangle extends Point {

	Triangle(int x, int y, int z) {
		super(x, y, z);
	}

}