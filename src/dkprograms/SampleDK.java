package dkprograms;

import java.util.Scanner;

public class SampleDK {
	
 static int a;
 static int b;
 
 static void add() {
	 
	 
	 System.out.println(a+b);
 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		a=s1.nextInt();
		b=s1.nextInt();
		 
		add();

	}

}
