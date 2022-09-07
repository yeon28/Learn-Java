package q08;

import java.util.Scanner;

public class Quiz08_MainEx {

	public static void main(String[] args) {
		Quiz08_CasioCal cc = new Quiz08_CasioCal();
		Scanner input = new Scanner(System.in);
		boolean run = true;
		int command = 0;

		int a;
		int b;

		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.더하기 | 2.빼기 | 3.나누기 | 4.곱하기 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택>>");
			command = input.nextInt();
	
			switch (command) {
			case 1:
				System.out.println("\n첫번째 숫자를 입력하세요.");
				a = input.nextInt();
				System.out.println("두번째 숫자를 입력하세요.");
				b = input.nextInt();
				cc = new Quiz08_CasioCal(a, b);
				cc.add();
				break;
			case 2:
				System.out.println("\n첫번째 숫자를 입력하세요.");
				a = input.nextInt();
				System.out.println("두번째 숫자를 입력하세요.");
				b = input.nextInt();
				cc = new Quiz08_CasioCal(a, b);
				cc.sub();
				break;
			case 3:
				System.out.println("\n첫번째 숫자를 입력하세요.");
				a = input.nextInt();
				System.out.println("두번째 숫자를 입력하세요.");
				b = input.nextInt();
				cc = new Quiz08_CasioCal(a, b);
				cc.divide();
				break;
			case 4:
				System.out.println("\n첫번째 숫자를 입력하세요.");
				a = input.nextInt();
				System.out.println("두번째 숫자를 입력하세요.");
				b = input.nextInt();
				cc = new Quiz08_CasioCal(a, b);
				cc.multiple();
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램이 종료");

	}

}
