package p02.array;

import java.util.Scanner;

public class ArrayAverage {

	public static void ArraySumPrint(int[] arrayLIst, int length) {

		int sum = 0;

		for (int i = 0; i < length; i++) {
			sum = sum + arrayLIst[i];
		}
		System.out.println("원소의 합 : " + sum);

	}

	public static void ArrayAvgPrint(int[] arrayLIst, int length) {

		int sum = 0;

		for (int i = 0; i < length; i++) {
			sum = sum + arrayLIst[i];
		}
		System.out.println("원소의 평균 : " + (sum / length));

	}

	public static void ArrayListPrint(int[] arrayLIst) {

		for (int i = 0; i < arrayLIst.length; i++) {
			System.out.print(arrayLIst[i] + " ");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("원소의 갯수를 입력하세요.");
		int arrLength = input.nextInt();
		int[] arrList = new int[arrLength];

		System.out.println("배열에 들어갈 원소를 입력하세요.");
		for (int i = 0; i < arrLength; i++) {
			arrList[i] = input.nextInt();
		}

		ArrayListPrint(arrList);
		ArraySumPrint(arrList, arrLength);
		ArrayAvgPrint(arrList, arrLength);
		
		
	}

}
