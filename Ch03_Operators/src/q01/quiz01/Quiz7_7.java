package q01.quiz01;

public class Quiz7_7 {

	public static void main(String[] args) {

		int x = 10;
		int y = 5;

		System.out.println((x > 7) && (y <= 5));
		// x가 7보다 크고, y가 5보다 작거나 같으면 --> true

		System.out.println((x % 3 == 2) || (y % 2 != 1));
		// x를 3으로 나눈 나머지가 2이고, y를 2로 나눈 나머지가 1이 아니면 --> true

	}

}
