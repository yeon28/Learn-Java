package q01.quiz02;

/*
 * 월출력하기
 * 
 * Math.random()을 이용하여 1~12 숫자를 생성
 * switch문을 사용해 해당 월을 출력하시오.
 * 
 */

public class Quiz01 {

	public static void main(String[] args) {

		int monthNum = (int) (Math.random() * 12 + 1);

		System.out.println("monthNum = " + monthNum);
		
		switch (monthNum) {
		case 1:
			System.out.println("1월입니다.");
			break;
		case 2:
			System.out.println("2월입니다.");
			break;
		case 3:
			System.out.println("3월입니다.");
			break;
		case 4:
			System.out.println("4월입니다.");
			break;
		case 5:
			System.out.println("5월입니다.");
			break;
		case 6:
			System.out.println("6월입니다.");
			break;	
		case 7:
			System.out.println("7월입니다.");
			break;
		case 8:
			System.out.println("8월입니다.");
			break;
		case 9:
			System.out.println("9월입니다.");
			break;
		case 10:
			System.out.println("10월입니다.");
			break;
		case 11:
			System.out.println("11월입니다.");
			break;
		default:
			System.out.println("12월입니다.");
			break;
		}

	}

}
