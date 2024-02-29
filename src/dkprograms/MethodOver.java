package dkprograms;

class u{
	void add() {
		System.out.println("j");
	}
}
class d extends u{
void add() {
		
	super.add();
	System.out.println("m");
	}
	
}



public class MethodOver  extends d{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MethodOver m1= new MethodOver();
		m1.add();
		
		

		
	}

}
