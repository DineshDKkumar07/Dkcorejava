package dkprograms;

public class Assignment_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Dinesh Kumar 12  @@#";
		char[] a1=name.toCharArray();
		int count_of_alpha=0;
		int count_of_numeric=0;
		int count_of_space=0;
		
		
		for(int i=0;i<=18;i++) {
			
			boolean result=Character.isAlphabetic(a1[i]);
			boolean result1=Character.isDigit(a1[i]);
			boolean result2=Character.isSpaceChar(a1[i]);
			
			if(result==true) {
				
				count_of_alpha++;
			//	System.out.println(count_of_alpha);
			}
			if(result1==true) {
				count_of_numeric++;
				//System.out.println(count_of_numeric);
				
			}
			if(result2==true) {
				
				count_of_space++;
				//System.out.println(count_of_space);
			}
			
		}

		System.out.println("The count of alpha-->" + count_of_alpha);
		System.out.println("The count of numeric-->" + count_of_numeric);
		System.out.println("The count of space-->" + count_of_space);
		
		int count_of_splchar= name.length()-(count_of_alpha+count_of_numeric+count_of_space);
		System.out.println("The count of splchar-->" + count_of_splchar);
	}
	

}
