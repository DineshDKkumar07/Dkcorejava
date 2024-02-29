package dkprograms;

import java.util.Scanner;
public class Dinesh {

	
	static void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	 static void Sub(int a, int b) {
		System.out.println(a-b);
	}
	static  void Multi(int a, int b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner c= new Scanner(System.in);
		int a= c.nextInt();
	     int b= c.nextInt();
		
		add();
		Sub(10,20);
		Multi(30,30);		
		
		

	}

}
