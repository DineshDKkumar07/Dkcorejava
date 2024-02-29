package dkprograms;

import java.util.Scanner;

public class Circum {

	static double pi=3.14;

	static void mul(double a) {
		
		//int r=10;
		double circum_of_circle=2*(pi*a);
		System.out.println(circum_of_circle);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner s1= new Scanner(System.in);
        
       double no1= s1.nextDouble();
       int no2= s1.nextInt();
    
        
        mul(no1);
        
	}

}
