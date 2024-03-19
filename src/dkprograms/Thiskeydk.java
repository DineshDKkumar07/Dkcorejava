package dkprograms;

public class Thiskeydk{
	
	int a;
	int b;
	
	void add(int a, int b) {
		
		this.a= a;
		this.b= b;
		System.out.println(a);
		System.out.println(b);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Thiskeydk t1 = new Thiskeydk();
		t1.add(10, 20);
	
		

	}

}
