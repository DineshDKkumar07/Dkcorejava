package inheritance;

 class parent {
	
	 static void print(){
		 
		 System.out.println("Print");
	 }
}

 class child extends parent{
	 
	  void tell(){
		 System.out.println("tell");
		 
	 }
 }
 
public class Hierarchical extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print();
		child c1= new child();
		c1.tell();
		
		

		
	}

}
