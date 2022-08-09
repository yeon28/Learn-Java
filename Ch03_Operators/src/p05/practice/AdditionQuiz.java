package p05.practice;

import java.util.Scanner;

/*
 * 2개의 숫자를 프로그램 내부에서 자동 생성하는 더하기 퀴즈 내는 프로그램
 */

public class AdditionQuiz {

	public static void main(String[] args) {
		//1970.1.1 0시 0분 0초 기준으로 현재까지 1/1000초단위 숫자 리턴	
		long currentTimeMillisecond = System.currentTimeMillis();
		
		int num1 = (int) (currentTimeMillisecond % 10) ;// num :  0~9
		int num2 = (int) (currentTimeMillisecond / 100 % 10) ;
		/*
		 *  % 10 --> 마지막 숫자 자져옴
		 *  / 10 % 10 --> 마지막에서 두번째 숫자 가져옴
		 *  / 100 % 10 --> 마지막에서 세번째 숫자 가져옴
		 */
		
		System.out.println("currentTimeMillisecond = " + currentTimeMillisecond);
		// 1970년1월1일 0시0분0초를 기준으로 현재까지 1/1000초 단위 숫자 return한 값 출력	
		System.out.println("num1 =" + num1);
		System.out.println("num2 =" + num2);
		
		System.out.println("숫자"+ num1 + "과 숫자"+ num2 + "의 합계는 얼마인가?");
		// 숫자 2개를 콘솔창에 제시함.
		
		Scanner input = new Scanner(System.in); 
		// 콘솔창에 사용자로부터 값을 받음.
		
		int answer = input.nextInt(); 
		// 콘솔에서 받은 값을 answer에 넣음.
		
		boolean bCorrect = ((num1+num2) == answer); 
		//boolean 참/거짓을 구별해 출력함.
		//num1과 num2를 더한 값이 콘솔에서 입력 받은 값과 같은지 구별해 참/거짓 출력.
		System.out.println(num1 + "+" + num2 + "=" + answer + "가 맞는가요?" + bCorrect);
	}

}
