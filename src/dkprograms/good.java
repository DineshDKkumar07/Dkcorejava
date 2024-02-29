package dkprograms;


class kd{
	
	void add() {
		
		System.out.println("added");
	}
}
public class good extends kd {
    void tell () {
		
		System.out.println("told");
	}
void avoid() {
	
	System.out.println("avoided");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		good g1= new good();
		g1.tell();
		g1.add();
		g1.avoid();
		
	}

}
