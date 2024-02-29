package Assignments_Corejava;

public class Assignment_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="mom";
		String reverse ="";
		
		
		for(int i=2; i>=0; i--) {
			
			char answer = name.charAt(i);//string function
			
			reverse=reverse+answer;//operation
			
			
		}
		
		
		boolean a1=name.equals(reverse);
		System.out.println(a1);
		
		
	
		if (a1==true) {
			
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
		
	}

}
