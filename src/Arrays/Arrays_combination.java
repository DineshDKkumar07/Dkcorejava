package Arrays;

public class Arrays_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Dinesh          Kumar12";
		char[] a1=name.toCharArray();
		
		for (int i=0;i<name.length(); i++) {
			
			boolean result=Character.isAlphabetic(a1[i]);
			boolean result1=Character.isDigit(a1[i]);
			boolean result2=Character.isSpaceChar(a1[i]);
			
			if(result==true) {
				
				System.out.println("alpha");
			}
			if(result1==true) {
				System.out.println("numeric");
			}
			if(result2==true) {
			System.out.println("space");
		}

	}

}
}