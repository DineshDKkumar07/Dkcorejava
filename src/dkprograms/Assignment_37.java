package dkprograms;

abstract class w{
	
	abstract void add();
}

public class Assignment_37 extends w{
	
	static void sub() {
		
		System.out.println("this is concrete method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sub();
		Assignment_37 a1= new Assignment_37();
		a1.add();		
	}
	void add() {
		// TODO Auto-generated method stub
		
		System.out.println("this is abstarct method");
		
	}

}
