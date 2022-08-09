package p03.while_prac;

import java.util.Scanner;

/*
 * 0~9 사이에 2개의 random number 숫자를 생성하여 
 * 합계를 만든 후
 * 사용자로부터 합계를 입력받아 내부적으로 생성한 뎃셈결과와 일치할 때까지 while문 수행
 * 
 */
public class RepeatAdditionQuiz {

	public static void main(String[] args) {

		int num1 = (int) (Math.random()*10);
		int num2 = (int) (Math.random()*10);
		
		Scanner input =new Scanner(System.in);
		System.out.println(num1 +"과"+num2+"의 합계는?");
		
		int answer=input.nextInt();
		
		
		// while문 내부 조건 : 정답이 틀리면 while문 반복수행
		while ((num1+num2) != answer) {
			System.out.println("정답이 아닙니다. 다시 시도하세요.");
			System.out.println(num1 +"과"+num2+"의 합계는?");
			answer = input.nextInt();
		}
		
		System.out.println("정답입니다.");
	}

}
