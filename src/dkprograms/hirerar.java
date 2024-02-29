package dkprograms;

class ff {
	
	void s() {
		
		System.out.println("hello");
	}
}
 class gg extends ff {
	 
	 void ff(){
		 
		 System.out.println("bye");
	 }
	 
 }

public class hirerar extends ff{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		hirerar h1= new hirerar();
		h1.s();
		gg g1 = new gg();
		g1.ff();
		

		
		
		
	}

}
