package dkprograms;

import java.util.Scanner;

public class Area {
	
	static int r;
	static double pi;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1= new Scanner(System.in);
	r=s1.nextInt();
    pi=s1.nextDouble();
		
	
	double	area_of_circle=pi*r*r;
	System.out.println(area_of_circle);
		
		

	}

}
