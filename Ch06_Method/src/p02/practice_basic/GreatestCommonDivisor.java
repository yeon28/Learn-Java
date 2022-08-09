package p02.practice_basic;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("첫번째 정수를 입력");
		int n1 = in.nextInt();

		System.out.println("두번째 정수를 입력");
		int n2 = in.nextInt();

		System.out.println("첫번째 정수" + n1 + " ,두번째 정수 " + n2 + " 최대 공약수" + gcd(n1, n2));
	}

	// 최대 공약수 구하는 메소드
	// 2개의 입력정수 n1 n2에 대하여 2부터시작 하여 1씩 증가시키면서, n1 n2 모두 나머지가 0인지 확인
	public static int gcd(int n1, int n2) {
		int gcd = 1;
		int k = 2;

		while ((k <= n1) && (k <= n2)) {
			if ((n1 % k == 0) && (n2 % k == 0)) {
				gcd = k;
				System.out.println("임시 gcd 확인 : " + gcd);

			}
			k++;
		}

		return gcd;
	}

}
