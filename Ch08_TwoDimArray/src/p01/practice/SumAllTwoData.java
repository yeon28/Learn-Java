package p01.practice;

public class SumAllTwoData {

	public static void main(String[] args) {
		int[][] numbers = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}		
		};
		
		int sum =0;
		
		// 배열 원소의 합
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				sum += numbers[i][j];
			}
			
			System.out.println("2차원 배열 원소의 합 : "+ sum);
		}
		System.out.println();
		
		
		//각 행의 합
		for (int i = 0; i < numbers.length; i++) {
			int rowSum = 0;
			
			for (int j = 0; j < numbers[i].length; j++) {
				rowSum += numbers[i][j];
			}
			
			System.out.println((i+1)+"번쩨 행 원소의 합 : "+ rowSum);
		}
		
		System.out.println();
		
		// 각 열의 합
		int colLength = numbers[0].length;
		for (int col = 0; col < colLength; col++) {
			int columSum = 0;
			
			for (int row = 0; row < numbers.length; row++) {
				columSum += numbers[row][col];
			}
			
			System.out.println((col+1)+"번쩨 행 원소의 합 : "+ columSum);
		}
		
		
	}

}
