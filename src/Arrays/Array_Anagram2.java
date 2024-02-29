package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1="editor";
		String name2="redoit";
		
		if(name1.length()!=name2.length()) {
			
			System.out.println("pass");
		}
		else {
			
			
			char[] a1=name1.toCharArray();
			char[] a2=name2.toCharArray();
			
			Arrays.sort(a1);
			Arrays.sort(a2);
			
		
		
		//	System.out.println(a1);
			
			boolean answer=Arrays.equals(a1, a2);		
			
			if(answer==true) {
				
				System.out.println("anagram");
				
			}else {
				
				System.out.println("not anagram");
			}
		   
		}
	}

}
