package Arrays;

public class Arrays_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int count_of_even = 0;
		int count_of_odd=0;
		int[] number= new int[5];//By using array
		number[1]=0;
		number[1]=2;
		number[1]=4;
		number[1]=5;
		number[1]=3;*/
		int count_of_even = 0;
		int count_of_odd=0;
		
		for (int i=0;i<=100;i++) {//by normal iteration
			
			if(i%2==0) {
				
				count_of_even++;
				//System.out.println("That is even number");
			}
			else {
				count_of_odd++;
				//System.out.println("That is odd number");
			}
		}
		System.out.println("The count of even is --> " + count_of_even);
		System.out.println("The count of odd is  --> " + count_of_odd);
	}

}
