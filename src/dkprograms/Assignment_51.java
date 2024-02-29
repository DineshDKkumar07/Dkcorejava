package dkprograms;

public class Assignment_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Dinesh Kumar";
		char[] a1=name.toCharArray();
	//	System.out.println(ans)        ;//to check whether true or false
		
		//checking whole String name with iteration
		
		for (int i=0;i<=11;i++) {
			
			boolean ans=Character.isSpaceChar(a1[i]);
			
			if(ans==true) {
				
				System.out.println("space is der");
			}
			/*else {
				System.out.println("no space");
			}*/
		}
	}

}
