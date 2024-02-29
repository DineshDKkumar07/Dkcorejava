package dkprograms;

public class Mthd2 {

	static void add() 
	{
		int a=10;
		int b=20;
		
		System.out.println(a+b);
		
	}
	static void add(int a) 
	{
		int k=100;
		int b=200;
		
		System.out.println(k+b);
		
	}
	void add(String b) 
	{
		
	
				System.out.println("dk");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		add();
		add(10);
		Mthd2 M1=new Mthd2();
		M1.add("K");
		
		
	}

}