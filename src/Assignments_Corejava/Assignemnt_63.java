package Assignments_Corejava;

public class Assignemnt_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Dinesh";
		String name2 = "DK";

		assert (name.length()== name2.length()): "This is exception because both the sting does not match or both are not equal";

		boolean answer = name.equals(name2);

		System.out.println(answer);

	}

}
