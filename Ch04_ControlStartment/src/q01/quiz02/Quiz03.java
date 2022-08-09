package q01.quiz02;

import java.util.Scanner;

/*
 * 3개의 정수를 오름차순으로 정렬하기.
 * 
 * 3개의 정수값을 키보드로 읽기.
 * 중복 if문 이용해 오름차순으로 정렬하기.
 */

public class Quiz03 {

	public static void main(String[] args) {
		
		int numbers[] = new int[3]; //int열 배열 선언
		
		Scanner in = new Scanner(System.in);		
		System.out.println("정수값 3개를 입력하세요.");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
        }


		
		 for (int i = 0; i < numbers.length; i++) {
	            for (int j = i + 1; j < numbers.length; j++) {
	                if (numbers[i] > numbers[j]) {
	                    int tmep = numbers[i];
	                    numbers[i] = numbers[j];
	                    numbers[j] = tmep;
	                }
	            }
	        }

		 
		 for (int i = 0; i < numbers.length ; i++) {
	            System.out.print(numbers[i] + " ");
	        }


/*				
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();

		if (num1 <= num2) {
			if (num2 <= num3) {
				System.out.println(num1 + num2 + num3);
			} else {
				System.out.println(num1 + num3 + num2);
			}
		} else if (num2 <= num3) {
			if (num1 <= num3) {
				System.out.println(num2 + num1 + num3);
			} else {
				System.out.println(num2 + num3 + num1);
			}
		} else {
			if (num3 <= num2) {
				System.out.println(num3 + num1 + num2);
			} else {
				System.out.println(num3 + num1 + num2);
			}
		}
*/
	}
}
