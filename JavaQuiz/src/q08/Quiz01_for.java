package q08;

public class Quiz01_for {

	public static void main(String[] args) {

		int num = 1;

		for (int i = 0; i < 4; i++) {
			for (int k = 4; k > i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j < num; j++) { //
				System.out.print("*");
			}

			num += 2;
			System.out.println();

		}

		num = 9;

		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}

			for (int j = num; j > 0; j--) { //
				System.out.print("*");
			}

			num -= 2;
			System.out.println();

		}
	}

}
