package dkprograms;

import java.util.Scanner;

public class Circledk {
	
	 static int r;                                //Non static global variables cannot initialize inside static methods
	 static double pi;                           //static global variables can be initialize inside both static and non static methods
 
	 void mul() {
		
		double area_of_cirlce=pi*r*r;
		System.out.println(area_of_cirlce);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int r;
		//double  pi;
		Scanner s1= new Scanner(System.in);
		
		 r=s1.nextInt();
		 pi=s1.nextDouble();
		
		Circledk c1 = new Circledk();
		c1.mul();
		
		//double area_of_cirlce=pi*r*r;
		//System.out.println(area_of_cirlce);
	}

}
