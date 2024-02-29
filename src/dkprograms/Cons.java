package dkprograms;
class mor{
	
	mor(){
		System.out.println("i");
	}
	mor(int v){
		System.out.println("n");
	}
}
class gowd extends mor{
	
	gowd(){

		super(10);
		System.out.println("f");
	}
}
class upen extends gowd{
	
	upen(){
		
		super();
		System.out.println("g");
		
	}
	
	
	
}
public class Cons extends upen{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new Cons();

		
		
	
		
	}

}
