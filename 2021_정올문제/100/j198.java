package k_Struct;

import java.util.Scanner;

public class j198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double fH = sc.nextDouble();
		double fW = sc.nextDouble();
		double mH = sc.nextDouble();
		double mW = sc.nextDouble();
		Member m = new Member(fH, fW, mH, mW);
		m.print();
		sc.close();
	}
}

class Member {
	double motherH;
	double fatherH;
	double motherW;
	double fatherW;

	Member() {

	}

	Member(double fH, double fW, double mH, double mW) {
		this.motherH = mH;
		this.motherW = mW;
		this.fatherH = fH;
		this.fatherW = fW;

	}

	void print() {
		System.out.printf("height : %.0fcm%n", Math.floor((motherH + fatherH) / 2)+5);
		System.out.printf("weight : %.1fkg%n", (motherW + fatherW) / 2 - 4.5);

	}
}