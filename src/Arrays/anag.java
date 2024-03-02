package Arrays;

import java.util.Arrays;

public class anag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 ="chin";
		String name2="inch";
		
		
		if(name1.length()!=name2.length()) {
			
			System.out.println("pass");
		}
		else {
			//for(int i=0; i<=3 ;i++)
			
			char[] a1=name1.toCharArray();
			char[] a2=name2.toCharArray();
			
			Arrays.sort(a1);
			Arrays.sort(a2);
			
			boolean answer=Arrays.equals(a1, a2);
				
			if(answer==true) {
				
				System.out.println("anagram");
				//break;
			}
			else {
				
				System.out.println("not a anagram");
					
					
				}
			}
		}
	}

	
	  		
		
		
	


