package p07.break_continue;

public class ContinueEX {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {	// 홀수인 경우
				continue;
			}
			sum += i;
		}
		System.out.println("1~10 사이의  짝수의 합 = " + sum);

	}

}
