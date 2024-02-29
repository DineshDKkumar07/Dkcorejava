package Assignments_Corejava;

public class Assignment_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int array[]= new int[5];
		
		 array[0]=10;
		 array[1]=20;
		 array[2]=30;
		 array[3]=40;
		 array[4]=50;
		 
		 int array2[]= new int [array.length];
		 
		 for (int i=0;i<=4;i++) {
			 
			 array2[i] = array[i];
		 }
		 
		 System.out.println(array2[0]);
		 System.out.println(array2[1]);
		 System.out.println(array2[2]);
		 System.out.println(array2[3]);
		 System.out.println(array2[4]);
		 
		

	
	
	
	}

}
