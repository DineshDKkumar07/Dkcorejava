package Assignments_Corejava;

import java.util.Scanner;

public class Assignment_27 {
	
	
	void add(int a,int b) {
		int c=10;
		int d=20;
		
		System.out.println(c+d);
	}
	void sub(int a,int b) {
		int c=10;
		int d=20;
		System.out.println(c-d);
	}
	void multi(int a,int b) {
		int c=10;
		int d=20;
		System.out.println(c*d);
	}
	void div(int a,int b) {
		int c=10;
		int d=20;
		System.out.println(c/d);
	}
	void mod(int a,int b) {
		int c=10;
		int d=20;
		System.out.println(c%d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s1 =new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		
		Assignment_27 d1= new Assignment_27();
		d1.add(a,b);
		d1.sub(a,b);
		d1.multi(a,b);
		d1.div(a,b);
		d1.mod(a,b);
		
		

		

	}

}
