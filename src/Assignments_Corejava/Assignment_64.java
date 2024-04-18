package Assignments_Corejava;



class importantinfo{
	
	private String un="customer@gmail.com";
	
	
	public void setUn(String un) {
		this.un = un;
	}
	
	public String getUn() {
		return un;
	}

	
}

public class Assignment_64 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		importantinfo i1= new importantinfo();
		i1.setUn("dineshdkssm@gmail.com");
		System.out.println(i1.getUn());

		
	}

}

