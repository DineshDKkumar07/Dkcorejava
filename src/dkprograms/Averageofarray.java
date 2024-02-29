package dkprograms;

import java.util.jar.Attributes.Name;

public class Averageofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[] = new int[5];
		array[0]=10;
		array[1]=10;
		array[2]=10;
		array[3]=10;
		array[4]=10;
		
		double sum=0;
		for(int i=0;i<=4;i++)
		
		{
			
			 sum=sum + array[i] ;
			
		}
		
		System.out.println(sum);

        double a1 = sum/5;
        
        System.out.println(a1);

	}

	
           
}
