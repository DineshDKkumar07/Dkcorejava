package Assignments_Corejava;
//Print the numbers from 1 to 1000, if the number is divisible by 3 print sun
//and if number is divisible by 5 then print moon,and again if the both numbers divisible (3&5) print sun and moon 
public class Assignment_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1;i<=1000; i++) {
			
			if(i%3==0) {
				
				System.out.println(i + " is SUN" );
			}
			if(i%5==0) {
				System.out.println(i + " is MOON");
			}
			if(i%3==0 && i%5==0){
				System.out.println(i + " is SUN and MOON");
				
			}
		}
	}

}
