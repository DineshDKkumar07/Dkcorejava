package dkprograms;

public class NewAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="jhony";
		String name1="jon";
		
		assert (name.length() == name1.length()):"This is exception";
		
		boolean ans =name.equals(name1);
		System.out.println(ans);
	}

}
