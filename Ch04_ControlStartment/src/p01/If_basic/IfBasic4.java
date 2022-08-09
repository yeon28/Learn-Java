package p01.If_basic;

public class IfBasic4 {

	public static void main(String[] args) {

		int score = 85;

		if (score >= 90) {
			System.out.println("A등급입니다.");
		} else if (score >= 80) {
			System.out.println("B등급입니다.");
		} else if (score >= 70) {
			System.out.println("C등급입니다.");
		} else if (score >= 60) {
			System.out.println("D등급입니다.");
		} else if (score >= 50) {
			System.out.println("E등급입니다.");
		} else {
			System.out.println("F등급입니다.");
		}

	}

}
