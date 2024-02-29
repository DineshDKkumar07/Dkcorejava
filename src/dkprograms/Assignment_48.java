package dkprograms;

public class Assignment_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "DineshKumar12";
		char[] a1=name.toCharArray();
		int count_of_alpha=0;              //to count the alpha
		int count_of_numeric=0;            //to count the numeric
				
		for (int i=0;i<name.length();i++) {
			
			
			boolean ans=Character.isAlphabetic(a1[i]);
			
			if(ans==true) {
			
			 count_of_alpha++;
			//System.out.println("alpha");
		}
			else {
				count_of_numeric++;
				//System.out.println("numeric");
			}
			
			
			
		}
		System.out.println("The count of alpha is-->" + count_of_alpha);
		System.out.println("The count of numeric is-->"  + count_of_numeric);
		
	}
}
