package Arrays;

import java.util.Arrays;

public class Arrays_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1="inch";
		String name2="chin";
		
		
		
		if(name1.length()!=name1.length()) {
			
			System.out.println("pass");
		}else {
			char n[]=name1.toCharArray();
			char n1[]=name2.toCharArray();
			
		Arrays.sort(n);
		Arrays.sort(n1);
			
		
	//	System.out.println(n);
		//System.out.println(n1);
		
		boolean answer= Arrays.equals(n, n1);
		
		//System.out.println(answer);
			
		if(answer==true) {
			
			System.out.println("anagram");
		}
		else {
			System.out.println("not a anagram");
		}
		}
	}
}
