package p02.practice_basic;

import java.util.Scanner;

//PrimeNumber : 소수
public class PrimeNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("가장 작은 수 ");
		printPrimeNumbers(20);
	}
	
	// return 값이 없는 경우 ; void사용함.
	public static void printPrimeNumbers(int numerOfPrimes) {
		int count = 0;
		int number = 2; // 특정 숫자가 소수인지 판단하기 위한 시작 숫자 2

		while (count < numerOfPrimes) {
			if (isPrime(number)) {
				count++;
				System.out.println(count + "번째 소수 : " + number);
			}
			number++;
		}

	}

	public static boolean isPrime(int number) {

		// 특정 숫자가 소수인지 판별하기 위해서는
		// 2부터 시작하여 number/2까지 for문 수행하여
		// 나머지가 0인지 판단함.
		for (int divisor = 2; divisor < number / 2; divisor++) {
			// number / 2 
			// 예시) 56%(56/2) = 56%28 = 0,
			// (56/2)부분이 28이상이라면(29라면)--> 항상 1.xxx... 임.
			// 위 같이  표기하는 이유는, 결과는 같지만 출력 속도가 더 빠름.
			if (number % divisor == 0) { // 소수 아님.
				return false;
			}
		}
		return true; 
		// if문에 있는 return문이 시행되지 않을 수 있기 때문에, 
		// return true; 없으면 에러남.
	}
}
