package dkprograms;

public class NonStatic {
	
	static int a;
	
	static void add() {
		a=10;
		int b=20;
		int c=30;
		System.out.println(b+c+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	NonStatic n1=new NonStatic();
		n1.add(); */
		
		add();
		
	}

}
