package dkprograms;

class oo{
	
	void add() {
		
		System.out.println("add");
	}
}

class po extends oo{
	void sub() {
		
		System.out.println("hi");
	}
	
}

public class HiraeryDk extends oo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HiraeryDk h1 = new HiraeryDk();
		h1.add();
		po p1 = new po();
		p1.sub();
	}

}
