package dkprograms;


interface ab{
	
	void come();
	void go();
}


class read implements ab{
	
	void display(){
		
		System.out.println("displayed");
	}

	
	public void come() {
		// TODO Auto-generated method stub
		System.out.println("came");
		
	}

	
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("gone");
		
	}
}
public class Security_1 extends read{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Security_1 s1 = new Security_1();
		s1.display();
		s1.go();
		s1.come();

		
	}

}
