package dkprograms;

import java.util.Scanner;

public class Assignment_30 {

	//static double pi;
	
	static int r;
	static double pi;
	static int a;
	static int b;
	static int h;
	static int c;
	static int l;
	static int w;
	static int d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1= new Scanner(System.in);
		
		r=s1.nextInt();
		 pi=s1.nextDouble();
		 a=s1.nextInt();
		 b=s1.nextInt();
		 h=s1.nextInt();
		 c=s1.nextInt();
		 l=s1.nextInt();
		 w=s1.nextInt();
		 d=s1.nextInt();
		
		
		double area_of_circle=pi*r*r;
		double circum_of_circle=2*pi*r;
		double area_of_traingle=.5*(b*h);
		int circum_of_traingle=a+b+c;
		double area_of_rectangle=2*(l+w);
		double circum_of_rectangle=a*b;
		//double area_of_square=a*a;
				double area_of_square=a*a;
		double circum_of_square=4*a;
		double area_of_trapezium=a+b/2+h;
		double circum_of_trapezium=a+b+c+d;
		
		
		System.out.println(area_of_circle);
		System.out.println(circum_of_circle);
		System.out.println(area_of_traingle);
		System.out.println(circum_of_traingle);
		System.out.println(area_of_rectangle);
		System.out.println(circum_of_rectangle);
		System.out.println(area_of_square);
		System.out.println(circum_of_square);
		System.out.println( area_of_trapezium);
		System.out.println(circum_of_trapezium);
		
		

	}

}
