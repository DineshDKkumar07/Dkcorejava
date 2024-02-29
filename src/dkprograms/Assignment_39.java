package dkprograms;
//write a program for multiple level inheritance with 4 parents  using interface?
interface ok{
	void hi();
	
}
interface ck{
	void bye();
	
}
interface sk{
	void gone();
}
interface pk {
	void tell();
}

public class Assignment_39 implements pk, ok, sk, ck  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment_39 a1= new Assignment_39();
		a1.hi();
		a1.bye();
		a1.gone();
		a1.tell();
	}
	public void bye() {
		// TODO Auto-generated method stub
		System.out.println("1");	
	}
	public void gone() {
		// TODO Auto-generated method stub
		System.out.println("2");	
	}
	public void hi() {
		// TODO Auto-generated method stub
		System.out.println("3");
	}
	public void tell() {
		// TODO Auto-generated method stub
		System.out.println("4");
		
	}

}
