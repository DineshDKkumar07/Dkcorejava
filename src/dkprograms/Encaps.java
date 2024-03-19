package dkprograms;

class importantinfo{
	
	private String un="customer@gmail.com";
	

	
	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}
}

public class Encaps {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		importantinfo i1= new importantinfo();
		i1.setUn("dineshdkssm@gmail.com");
		System.out.println(i1.getUn());

		
	}

}

