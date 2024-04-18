
public class Encapsull {

	private int otp = 100;
	
	public void setotp(int otp) {
		this.otp = otp;
	}

	
	public int getotp() {
		return otp;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsull e1 = new Encapsull();
		e1.setotp(333);

		System.out.println(e1.getotp());

	}



}
