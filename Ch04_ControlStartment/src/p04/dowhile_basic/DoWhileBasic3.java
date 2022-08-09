package p04.dowhile_basic;

public class DoWhileBasic3 {

	public static void main(String[] args) {

		char a = 'a';

		do {
			System.out.print(a);
			a = (char) (a + 1);
		} while (a <= 'z');

		System.out.println();

		a = 'A';

		do {
			System.out.print(a);
			a = (char) (a + 1);
		} while (a <= 'Z');

	}

}
