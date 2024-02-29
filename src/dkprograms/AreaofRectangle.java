package dkprograms;

public class AreaofRectangle {
	
	static int l;//global variable need to mention static or non static 
	
	
	static void area_of_rectangle() {
		
		int l=10;
		int b=10;
		int h=20;
		System.out.println(l*h*b);
		
	}
	/* static void add() {
		
		int a=20;   These two are static cannot differentiate static or non static since comes inside method 
		int b=30;
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		area_of_rectangle();
			
	}

}
