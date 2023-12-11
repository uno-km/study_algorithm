package c_Operator;

import java.util.Scanner;

public class j518 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        double d = (a+b+c)/3;
	         
	        System.out.printf("sum : %d%navg : %.0f", a+b+c,d); 
	        sc.close();
	}

}
