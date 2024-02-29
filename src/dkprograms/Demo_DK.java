package dkprograms;


import java.util.Scanner;

public class Demo_DK {
	static int a,b;
	
	void add() {
	
		
		
		System.out.println(a+b);
		
	}
		
		
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		 a=s1.nextInt();
		  b= s1.nextInt();
		
		
		Demo_DK d1= new Demo_DK();
		d1.add();
		
	}
	

}
