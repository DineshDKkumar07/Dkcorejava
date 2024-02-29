package dkprograms;

public class Fast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0; i<=100; i++) {
			
			if(i%3==0) {
				
				System.out.println("SUN"  + i);
				
			}
			if(i%5==0) {
				
				System.out.println("Moon"  + i);
			}
			if(i%3 %5==0) {
				System.out.println("gun"  +  i);
			}
		}
		

	}

}
