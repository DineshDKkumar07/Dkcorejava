package dkprograms;

public class Assignmnet_19ConstrcutorDif {
	
	Assignmnet_19ConstrcutorDif(){
		System.out.println("method1");
		
	}
	Assignmnet_19ConstrcutorDif(int a, int b)
	
{
		System.out.println("method2");
		
	}
	Assignmnet_19ConstrcutorDif(String name){
		
		System.out.println("method3");
	}
    Assignmnet_19ConstrcutorDif(float a){
		
		System.out.println("method4");
	}
     Assignmnet_19ConstrcutorDif(char c){
	
	System.out.println("method5");
}
    Assignmnet_19ConstrcutorDif( int a,int k,char f){
	
	System.out.println("method6");
}
    Assignmnet_19ConstrcutorDif(int a){
	
	System.out.println("method7");
}
    Assignmnet_19ConstrcutorDif(int d, float s){
	
	System.out.println("method8");
}
    Assignmnet_19ConstrcutorDif(float q, int a){
	
	System.out.println("method9");
} 
    Assignmnet_19ConstrcutorDif(char s, int f){
	
    	
	System.out.println("method10");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new Assignmnet_19ConstrcutorDif();//new class name();
		
		new Assignmnet_19ConstrcutorDif(10,20);
		
		new Assignmnet_19ConstrcutorDif("DK");
		
		new Assignmnet_19ConstrcutorDif(10.24f);
		
		new Assignmnet_19ConstrcutorDif('s');
		
		new Assignmnet_19ConstrcutorDif(10,20,'s');
		
		new Assignmnet_19ConstrcutorDif(10);
		
		new Assignmnet_19ConstrcutorDif(10, 12.23f);
		
		new Assignmnet_19ConstrcutorDif( 12.23f, 10);
		
		new Assignmnet_19ConstrcutorDif('x', 10);
		
	}

}
