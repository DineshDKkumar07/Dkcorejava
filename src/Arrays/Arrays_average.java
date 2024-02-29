package Arrays;

public class Arrays_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] value= new int[5];
		value[0]=10;
		value[1]=10;
		value[2]=10;
		value[3]=10;
		value[4]=10;

	int sum=0;
	for(int i=0;i<=4; i++) {
		
		sum=sum+value[i];
		
		
	}
	System.out.println(sum);
		
	double average=sum/5;
	System.out.println(average);
	}

}
