package inheritance;
interface d{
	
	void dinesh ();
}

interface  go {
	
	void kumar();
}
	


public class Multiple implements d , go{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Multiple m1= new Multiple();
		m1.dinesh();
		m1.kumar();

	}

	@Override
	public void kumar() {
		// TODO Auto-generated method stub
		System.out.println("kumar");
		
	}

	@Override
	public void dinesh() {
		// TODO Auto-generated method stub
		System.out.println("dinesh");
		
	}
}


	

