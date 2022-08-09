package p01.practice;

public class Carculator {
// 프로그램 외부에서 입력되는 프로그램.
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println("arge[" + i + "] : " + args[i]);
		}

		if (args.length != 3) {
			System.out.println(" 사용법 예 : 2+3");
			return; // 메소드에 리턴타입이 보이드인 경우 리턴값이 업는 상태로 리턴 가능
		}

		int result = 0;

		switch (args[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			break;
		case '-':
			result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			break;
		case '.':
			result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			break;
		case '/':
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			break;
		}
		System.out.println(args[0] + " " + args[1] + " " + args[2] + "=" + result);

		System.out.println("end of calculator");

	}

}
