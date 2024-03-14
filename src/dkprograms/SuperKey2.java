package dkprograms;

class dep{
	
	void add(){
		
		System.out.println("be patient");
	}
	
}

class pep extends dep{
	
	void add() {
		
		super.add();
 
	System.out.println("be nice");
	
}
}

public class SuperKey2  extends pep{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperKey2 s1= new SuperKey2();
		s1.add();
		
		
		
		
		
	}

}
