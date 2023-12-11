package k_Struct;

//import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class j617 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Person3 p1 = new Person3(scanner.next(), scanner.nextInt());
		Person3 p2 = new Person3(scanner.next(), scanner.nextInt());
		Person3 p3 = new Person3(scanner.next(), scanner.nextInt());
		Person3 p4 = new Person3(scanner.next(), scanner.nextInt());
		Person3 p5 = new Person3(scanner.next(), scanner.nextInt());
		scanner.close();

		TreeSet<Person3> personList = new TreeSet<>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);

		System.out.println(personList.pollFirst());
	}

}

class Person3 implements Comparable<Person3> {
	private String name;
	private int height;

	public Person3(String name, int height) {

		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int compareTo(Person3 p) {
		return this.height - p.height;
	}

	@Override
	public String toString() {
		return this.name + " " + this.height;
	}

}