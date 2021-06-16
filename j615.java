package k_Struct;

import java.util.Scanner;

public class j615 {
	int average(int a, int b) {
		return (a + b) / 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Avg m = new Avg();
		Avg m2 = new Avg();
		j615 j = new j615();
		m.name = sc.next();
		m.Kor = sc.nextInt();
		m.Eng = sc.nextInt();
		m2.name = sc.next();
		m2.Kor = sc.nextInt();
		m2.Eng = sc.nextInt();
		sc.close();
		
		m.printInp(m.name, m.Kor, m.Eng);
		m2.printInp(m2.name, m2.Kor, m2.Eng);
		System.out.println("arg " + j.average(m.Kor, m2.Kor) + " " + j.average(m.Eng, m2.Eng));

	}

}

class Score {
	int Kor;
	int Eng;
}

class Avg extends Score {
	String name;

	void printInp(String name, int kor, int Eng) {
		System.out.println(name + " " + kor + " " + Eng);
	}
}
