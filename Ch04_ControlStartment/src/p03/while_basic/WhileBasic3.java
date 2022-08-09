package p03.while_basic;

public class WhileBasic3 {

	public static void main(String[] args) {

		int sum = 0;
		int num = 1;

		// 1~10사이의 짝수의 합(2+4+6+8+10)
		while (num <= 10) {
			if ((num % 2) == 0) {
				sum += num;
				System.out.println("sum = " + sum);
			}
			num++;
		}

		System.out.println("1~10사이의 짝수의 합 :" + sum);

//-----------------------------------------------------------

		sum = 0;// 초기화 필수
		num = 1;// 초기화 필수
		// 1~10사이의 홀수의 합
		while (num <= 10) {
			if ((num % 2) == 1) {
				sum += num;
			}
			num++;
		}

		System.out.println("1~10사이의 홀수의 합 :" + sum);

	}

}
