package Assignments_Corejava;

class mot{               // super calling statement is known as calling parent constructor with child constructor
	
	mot(){
		System.out.println("Hi");
	}
	
}
class dot extends mot  {
	
     dot(){
		super();//explicit 
		System.out.println("Bye");
	}
}

public class Assignment_34 extends dot{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new dot();
		
	
		
	}

}
