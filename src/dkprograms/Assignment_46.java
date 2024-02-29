package dkprograms;

import java.util.Arrays;

public class Assignment_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub                         
		
		String name1="chin";
		String name2="inch";
		if(name1.length()!=name2.length()) {
			
			System.out.println("not a anagram");
		}else {
			
			//System.out.println("anagram");
			char n1[] = name1.toCharArray();
			char n2[] =name2.toCharArray();
			
	//		System.out.println(Arrays.toString(n1));
			
			Arrays.sort(n1);
			Arrays.sort(n2);
			
		//	System.out.println(n1);
			//System.out.println(n2);
			
			boolean answer= Arrays.equals(n1, n2);
			
		//	System.out.println(answer);
			
			if(answer==true) {
				
				System.out.println("anagram");
			}else {
				
				System.out.println("not a anagram");
			}
			
		}

	}

}
