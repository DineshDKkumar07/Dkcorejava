package dkprograms;

class parent{
	
	public static void main(String[] args) {
		System.out.println("DK");
	}
		
	}


class Constructor extends parent {

	Constructor(){
		System.out.println("Con Program");
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.out.println("c");
		
		new Constructor();
		new Constructor();
		new Constructor();
		new Constructor();
		new Constructor();
	}

}
