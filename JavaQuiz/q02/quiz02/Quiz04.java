package quiz02;

import java.util.Scanner;

/*
 * 
 */

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int computerNum = (int) (Math.random() * 2+1);
		
		System.out.println("가위(0), 바위(1), 보(2)입니다. 숫자 0, 1, 2 중 하나의 숫자를 입력하세요."); 
		int inputNum = input.nextInt();
		
		System.out.println("컴퓨터 = " + computerNum);
		System.out.println("사용자 = " + inputNum);
		
		if (computerNum == inputNum) {
			System.out.println("비겼습니다.");
		}else{
			if ((inputNum ==0) && (inputNum ==1 )) {
				System.out.println("당신이 이겼습니다.");
			}else {
				System.out.println("당신이 졌습니다.");
			}
		}
		
	}

}
