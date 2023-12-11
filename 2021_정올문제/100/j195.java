package k_Struct;

import java.util.*;
import java.util.Arrays;

public class j195 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person5[] p = new Person5[3];
		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			String tel = sc.next();
			String addr = sc.next();
			p[i] = new Person5(name, tel, addr);
		}
		sc.close();
		String n[] = new String[p.length];
		for (int i = 0; i < p.length; i++) {
			n[i] = p[i].getName();
		}
		Arrays.sort(n);
		for (int i = 0; i < p.length; i++) {
			if (n[0] == p[i].getName()) {
				p[i].print();
			}
		}
	}
}

class Person5 {
	private String name;
	private String tel;
	private String addr;

	Person5(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}

	public String getName() {
		return name;
	}
}