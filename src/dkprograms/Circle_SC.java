package dkprograms;

import java.util.Scanner;

public class Circle_SC {

	static long  pi,r;
	
	
 void area_of_circle() {
	
	
	
	
	System.out.println(pi*r*r);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s1= new Scanner(System.in);
		 pi =s1.nextShort();
		 r=  s1.nextInt();
		
		Circle_SC c1= new Circle_SC();
		c1.area_of_circle();
		
		
	}
		
		
		
		
		



	}
