package Quiz02;

/*
 * 2. Lendable polymorphism 실습
 * ❖ MS Word 문서 참조하여 코딩 및 테스트 하시오

▪ Interface : Lendable

▪ Class : SeperateVolume, CDInfo, AppCDInfo, InterfacePoly

▪ MS word 문서의 소스코드의 빈칸을 코딩하여 출력 결과 예시대로 나오게 하시오
 */
public class SeperateVolume implements Lendable {

	String requestNo; // 청구번호
	String bookTitle; // 제목
	String wirter; // 저자
	String borrower; // 대출인
	String checkOutDate; // 대출일
	byte state; // 대출상태

	public SeperateVolume() {
	}

	public SeperateVolume(String bookTitle) {
		this.bookTitle = bookTitle;
	}


//	-------------------------

	@Override
	public void checkOut(String borrower, String data) {
		if (state != 0) {
			return;
		}

		this.borrower = borrower;
		this.checkOutDate = data;
		this.state = 1;

		System.out.println("* " + bookTitle + " 이(가) 대출되었습니다.");
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + data + "\n");
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("* " + bookTitle + "이(가) 반납되었습니다.");

	}

}
