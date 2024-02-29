
package Assignments_Corejava;//hierarichal inhaeritance

class parenta {

	static void s() {

		System.out.println("parent class");
	}
}
class childb extends parenta {

	static void n() {

		System.out.println("sub class 1 class");
	}
}
public class Assignment_33 extends parenta {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("subclass 2 class");
		s();
		childb c1 = new childb();
		c1.n();

	}

}
