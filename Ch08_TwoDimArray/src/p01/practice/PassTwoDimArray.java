package p01.practice;

import java.util.Scanner;

public class PassTwoDimArray {

	public static void main(String[] args) {
		int[][] numbers = getArray(2,3); // 2행 3열 2차원 배열 생성 --> 파일에서 배열을 읽어올 경우
//		int[][] numbers = getArray();
		
		for (int row = 0; row < numbers.length; row++) {
			for (int colum = 0; colum < numbers[row].length; colum++) {
				System.out.print(numbers[row][colum]+ " ");
			}
			System.out.println();
		}
		// 2차원 배열의 모든 원소 합 출력
		System.out.println("2차원 배열의 원소 합 : "+sum(numbers));
		
	}

	
	//--------------------------------------------------
	public static int[][] getArray(int row, int colum) {
		int[][] numbers = new int[row][colum];

		Scanner in = new Scanner(System.in);
		System.out.println(row+"행 "+colum+"열 데이터에 대하여 행 단위로 space로 구분된 데이터를 엔터키를 쳐서 입력하세요.");

		
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = in.nextInt();
			}
		}
		return numbers;
	}		
	// --> 파일에서 배열을 읽어올 경우
	
	//-------------------------------------------------------------
	
	public static int[][] getArray() {
		int[][] numbers = new int[2][3];

		Scanner in = new Scanner(System.in);
		System.out.println("2행 3열 데이터에 대하여 행 단위로 space로 구분된 데이터를 엔터키를 쳐서 입력하세요.");

		for (int row = 0; row < numbers.length; row++) {
			for (int colum = 0; colum < numbers[row].length; colum++) {
				numbers[row][colum] = in.nextInt();
			}
		}
		return numbers;
	}

	public static int sum(int[][] num) {
		int total = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				total += num[i][j];
			}
		}
		return total;

	}
}
