package Assignments_Corejava;


class achu{
	//parent class
	
	public static void main(String[] args) {	
	}
		// TODO Auto-generated method stub
		void dk() {
			
		
      System.out.println("Bye");
	}	
}
public class Assignment_35 extends achu {
	
	//child class
	void dk() {
			super.dk();
		System.out.println("HI");
	}
public static void main(String[] args) {
	Assignment_35 s1 = new Assignment_35();
		s1.dk();
	}

}
