package Assignments_Corejava;

import java.util.Scanner;

public class Assignment_29 {
	
	static int a;
	static int b;
	static void add() {
		
		a=10;
		b=20;
		
		System.out.println(a+b);
	}
	static void sub() {
		a=10;
		b=20;
		System.out.println(a-b);
	}
	static void multi() {
		a=10;
		b=20;
		System.out.println(a*b);
		}
	static void div() {
		a=10;
		b=20;
		System.out.println(a/b);
	}
	static void mod() {
		a=10;
		b=20;
		System.out.println(a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s1 =new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		
	add();
	sub();
	multi();
	div();
	mod();
	
	
		
		
		
		

		

	}

}
