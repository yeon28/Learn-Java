package p05.practice;

import java.util.Scanner;

/*
 * 화씨를 섭씨로 바꾸기
 */
public class FahrenheitToCelcius {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("화씨를 입력하세요");
		double fahrenheit = input.nextDouble();
		
		double celcius = (5.0/9) * (fahrenheit - 32);
//		double celcius = ((double)5/9) * (fahrenheit - 32); //위와 같은 표현임.
		System.out.println("입력된 화씨 " + fahrenheit + "는 섭씨" + celcius + "도 입니다.");
		
	}

}
