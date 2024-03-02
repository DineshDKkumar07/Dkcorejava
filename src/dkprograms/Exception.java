package dkprograms;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	
		int a=10;
		int b=10;
		int  c=10/10;
		 
		System.out.println(c);

	}
	catch(ArithmeticException exception) {
		
		System.out.println("expecion has be handled");
	}
	finally {//this will always execute....
		
		System.out.println("this will always exceute");
	}

}
}