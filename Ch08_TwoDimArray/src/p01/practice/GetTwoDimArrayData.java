package p01.practice;

import java.util.Scanner;

public class GetTwoDimArrayData {

	public static void main(String[] args) {

		int[][] numbers = new int[2][3];
		
		Scanner in =  new Scanner(System.in);
		System.out.println("2행 3열 데이터에 대하여 행 단위로 space로 구분된 데이터를 엔터키를 쳐서 입력하세요.");
		
		for (int row = 0; row < numbers.length; row++) {
			for (int colum = 0; colum < numbers[row].length; colum++) {
				numbers[row][colum] = in.nextInt();
			}
		}
		
		for (int row = 0; row < numbers.length; row++) {
			for (int colum = 0; colum < numbers[row].length; colum++) {
				System.out.print(numbers[row][colum]+ " ");
			}
			System.out.println();
		}
	}

}
