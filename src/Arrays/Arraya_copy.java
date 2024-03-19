package Arrays;

public class Arraya_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] Array1= new int[4];//declaration
		
		Array1[0]=10;//initialization
		Array1[1]=20;
		Array1[2]=30;
		Array1[3]=40;
		
		int[] Array2 = new  int [4]; //declaration of a2=a1		
		for (int i=0;i<=3;i++) {
			
			Array2[i]= Array1[i]; //condition a2=a1
		}
			System.out.println(Array2[0]);
			System.out.println(Array2[1]);
			System.out.println(Array2[2]);
			System.out.println(Array2[3]);
		
			
			
					}
		


	}


