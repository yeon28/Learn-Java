package p01.switch_basic;

public class SwitchBasic4 {

	public static void main(String[] args) {

		char grade = 'A';

		switch (grade) {
		case 'A':
		case 'E':
		case 'B':
			System.out.println("우수 회원입니다.");
			break;
		case 'C':
		case 'D':
			System.out.println("일반 회원입니다.");
			break;
		}

//		----------------------------------------------------
		
		//if문으로 바꿔주면 
		
		if ((grade == 'A')||(grade == 'E' ) ||(grade == 'B' )) {
			System.out.println("우수 회원입니다.");
		}else if ((grade == 'C')||(grade == 'D' )) {
			System.out.println("일반 회원입니다.");
		}
		
	}

}
