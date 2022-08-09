package p07.break_continue;

public class BreakEx {

	public static void main(String[] args) {

		int num = 0;
		
		while (num != 6) {	// 무한 루프
			num = (int) (Math.random() * 6 + 1); // 1,2,3,4,5,6 중에 랜덤
			System.out.println("주사위번호 =" + num);
			}
		
	
		//---------------------------------------------------------------
		
		// break 사용하기.
		while (true) {	// 무한 루프
			num = (int) (Math.random() * 6 + 1); // 1,2,3,4,5,6 중에 랜덤
			System.out.println("주사위번호 =" + num);
			if (num == 1) { // 조건식 역할
				break;
			}
		}

		System.out.println("주사위 게임 종료.");
		
		//----------------------------------------------------------
		
		/*
		 * 음식 메뉴 화면 display
		 * 주문한 음식 메뉴 입력 받기
		 * 주문된 음식 조리하기
		 * 고객에에 음식 완성 메시지 display
		 */
		
		int error =0;		// 기계에서 발생한 에러
		if (error !=0) {	// 기게어서 에러가 발생하면
//			break;			// 종료
			System.out.println("주사위 게임 종료.");
		}
		
	}

}
