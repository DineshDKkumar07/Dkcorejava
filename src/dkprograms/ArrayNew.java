package dkprograms;

import java.util.Scanner;

public class ArrayNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  value= new int[4];//starts from 0 index hence 0,1,2,3 totally 4 index so it will not accept more
		
		Scanner s1= new Scanner(System.in);
			//int no1=	s1.nextInt();
		//	int no2=	s1.nextInt();
			//int no3=	s1.nextInt();
			//int no4=	s1.nextInt();
		 
			value[0]=s1.nextInt();
		 value[1]=s1.nextInt();
		 value[2]=s1.nextInt();
		 value[3]=s1.nextInt();
		 
		 
		 
		 System.out.println(value[0]);
		 System.out.println(value[1]);
		 System.out.println(value[2]);
		 System.out.println(value[3]);
		 

	}

}
