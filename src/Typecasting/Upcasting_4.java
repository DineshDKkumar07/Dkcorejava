package Typecasting;
class teacher1{
	
	void add() {
		
	}
}
class mentor1 extends teacher1{
	
	void sub() {
		
	}
}
class expstud extends mentor1{
	
	void mul(){
		
	}
}

public class Upcasting_4 extends mentor1  {
	
	void div() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		                     mentor1 m1  = new  Upcasting_4();
		                     m1.add();
		                     m1.sub();
		                    
	}

}
