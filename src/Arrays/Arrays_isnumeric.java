package Arrays;



public class Arrays_isnumeric{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Dhanush123";
		char n[]=name.toCharArray();
		
	//	System.out.println(Arrays.toString(n));
		
		
		
		for(int i=0;i<=9;i++) {
			
			boolean ans=Character.isDigit(n[i]);
			
			if(ans==true) {
				System.out.println("numeric");
			}else {
				System.out.println("alpha");
			}
		}
		
	}

}
