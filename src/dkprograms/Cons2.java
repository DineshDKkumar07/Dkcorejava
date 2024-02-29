package dkprograms;

class by{
	
	
	void add() {
		System.out.println("h");
	}
}
class br extends by{
	
	void sub() {
		
		super.add();
		System.out.println("l");
	}
}

public class Cons2 extends br {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Cons2 c1= new Cons2();
		c1.sub();
		

	}

}
