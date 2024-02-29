package Assignments_Corejava;

//import java.util.Arrays;

public class Assignment_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Dinesh12";
		char a1[] =name.toCharArray();
		
	//	System.out.println((a1));

		for(int i=0;i<name.length();i++) {
			
			
		
		boolean ans=Character.isDigit(a1[i]);
		if(ans==true) {
		
		System.out.println("This  is numeric");	
			
		}
		else {
			System.out.println("This  is alpha");
	//	}
		
		
		 
	}
	}
}
}
