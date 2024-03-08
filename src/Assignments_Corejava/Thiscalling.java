package Assignments_Corejava;

public class Thiscalling {
	
	Thiscalling(){//this calling statement used to call parent class constructor from child class class constructor within class
		//with one object we can call all object using this calling statement
		
		this(10);
		System.out.println(1);
		
	}
Thiscalling(int a){
	
    this(10,20);
	System.out.println(2);
		
	}
Thiscalling(int a , int b){
	

	System.out.println(3);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thiscalling t1 = new Thiscalling();
		
	}

}
