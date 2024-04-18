package dkprograms;

public class EncapsN {

	private int salary = 3000;

	public void setsal(int salary) {

		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EncapsN e1 = new EncapsN();
		e1.setsal(100000);
		
		System.out.println(e1.getSalary());
	}

}
