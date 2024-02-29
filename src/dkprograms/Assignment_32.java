package dkprograms;
//Write a program for multi level inheritance by creating different class

class h{
	
	static void g1(){
	System.out.println("GrandParent class");
	
	}
}
class b extends h{
	
	static void g2(){
	
	System.out.println("Parent class");
	
	}
	
}
public class Assignment_32 extends b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Child class");
		g1();
		g2();
	}

}
