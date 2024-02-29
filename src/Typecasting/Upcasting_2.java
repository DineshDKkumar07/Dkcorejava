package Typecasting;

class teacher {
	
	void add(){
		
	}
}

class mentor extends teacher
{
	void sub() {
		
	}
}

public class Upcasting_2 extends mentor{

	void dk() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
					mentor m1 = new Upcasting_2();
					m1.add();
					m1.sub();

	}

}
