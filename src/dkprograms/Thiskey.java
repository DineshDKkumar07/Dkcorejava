package dkprograms;

public class Thiskey {

	
	int a;
	int b;
	
	
	void display(int a, int b) {
		
		//this. a= a;
		//this.b=b;
		System.out.println(a );
		System.out.println(b );
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thiskey t1 = new Thiskey();
		t1.display(10, 20);
		

	}

}
