package quiz04;

import java.util.Scanner;

/*
 2차원 테이블 행 합계 구하기
 3*4 2차원 배열을 만들고 콘솔로 실수 값을 읽어온 후 각 합계를 구하여 출력하기
 
 3행 4열 double type의 실수 값을 읽어올 것
 각 행의 합계를 구하여 결과 콘솔에 출력
 "첫번째 행의 합계는 - 입니다" 출력 
 */

public class Quiz01 {

	public static void main(String[] args) {
		
		double[][] dimTable = new double[3][4];
		
		Scanner in =  new Scanner(System.in);
		
		
		for (int row = 0; row < dimTable.length; row++) {
			System.out.println((row+1) +"행의 4가지 실수 값을 입력하세요.");
			for (int colum = 0; colum < dimTable[row].length; colum++) {
				dimTable[row][colum] = in.nextInt();
			}
		}
		
		for (int i = 0; i < dimTable.length; i++) {
			
			int rowSum = 0;
			
			for (int j = 0; j < dimTable[i].length; j++) {
				rowSum += dimTable[i][j];
			}
			
			System.out.println((i+1)+"번째 행 원소의 합은 "+ rowSum + "입니다.");
		}
		
	}

}
