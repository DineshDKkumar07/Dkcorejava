package dkprograms;

public class Method_overloading {

	static void add() 
	{
		System.out.println("method1");
	}
	static void add(int a) 
	{
		System.out.println("method2");
	}
	void add(String b) 
	{
		System.out.println("method3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		add();
		add(10);
		Method_overloading M1=new Method_overloading ();
		M1.add("Dk");
		
		
	}

}
