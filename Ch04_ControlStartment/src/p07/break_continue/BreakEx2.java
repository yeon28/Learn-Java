package p07.break_continue;

import java.util.Scanner;

public class BreakEx2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num = 0;

		while (true) { // 무한 루프
			if (in.nextInt() == -1)
				break;
			num++;
		}

		System.out.println("입력된 숫자 개수는 " + num);
	}

}
