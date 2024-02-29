package dkprograms;

abstract class parentclass {

	abstract void subclass();

	abstract void newclass();

	void add() {
		System.out.println("one");
	}

	void sub() {
		System.out.println("two");
	}

}

abstract class childclass extends parentclass {

	abstract void rightclass();

	abstract void wrongclass();

	void multi() {
		System.out.println("three");

	}

	void div() {
		System.out.println("four");

	}
}

public class security extends childclass {

	void sum() {
		System.out.println("five");

	}

	void base() {
		System.out.println("six");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		security s1 = new security();
		s1.add();
		s1.sub();
		s1.multi();
		s1.div();
		s1.sum();
		s1.base();
		s1.subclass();
		s1.newclass();
		s1.rightclass();
		s1.wrongclass();

	}

	void subclass() {
		// TODO Auto-generated method stub
		System.out.println("seven");

	}

	void newclass() {
		// TODO Auto-generated method stub
		System.out.println("eight");

	}

	void rightclass() {
		// TODO Auto-generated method stub
		System.out.println("nine");

	}

	void wrongclass() {
		// TODO Auto-generated method stub
		System.out.println("ten");

	}

}
