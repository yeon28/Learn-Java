package Quiz02;

/*
 * 2. Lendable polymorphism 실습
 * ❖ MS Word 문서 참조하여 코딩 및 테스트 하시오

▪ Interface : Lendable

▪ Class : SeperateVolume, CDInfo, AppCDInfo, InterfacePoly

▪ MS word 문서의 소스코드의 빈칸을 코딩하여 출력 결과 예시대로 나오게 하시오
 */
public interface Lendable {
	void checkOut(String borrower, String data);
	void checkIn();

	
	
}
