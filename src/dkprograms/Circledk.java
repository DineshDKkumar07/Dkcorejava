package dkprograms;

import java.util.Scanner;

public class Circledk {
	 static int r;
	static  double pi;
	 
	 /*void mul() {
		 
		 double area_of_circle=pi*r*r;
		 
		 System.out.println(area_of_circle);
	 }*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner s1 = new Scanner(System.in);
		
	 int r= s1.nextInt();
	 double pi=s1.nextDouble();
		
		//Circledk c1 = new Circledk();
		//c1.mul();
		
	 double area_of_circle=pi*r*r;
	 
	 System.out.println(area_of_circle);
		
		
		
		

	}

}
