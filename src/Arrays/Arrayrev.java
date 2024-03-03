
package Arrays;

import java.util.Arrays;

public class Arrayrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "This is dinesh and arbind";
		char a1[] = name.toCharArray();
		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			char answer = name.charAt(i);//// very very important line

			reverse = reverse + answer;

		}
		System.out.println(reverse);
		char[] res = reverse.toCharArray();
		System.out.println(Arrays.toString(res));

	}

}
