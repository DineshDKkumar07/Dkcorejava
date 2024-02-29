package Arrays;

import java.util.Arrays;

public class Arrays_isalpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Dhanush123";
		char n[]=name.toCharArray();
		
	//	System.out.println(Arrays.toString(n));
		for (int i=0;i<name.length();i++)
		{
		boolean ans=Character.isAlphabetic(n[i]);
		
		if(ans==true) {
		
		System.out.println("Alpha");
		
	}
		else {
			
			System.out.println("numeric");
			
		}

}
}
}