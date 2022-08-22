package p03.anonymous_class;
/*
 부모 클래스와 자식 클래스 간에도 자식 클래스를 익명객체로 만들어 부모 클래스 타입으로  promotion하여 사용 가능
 */
public class AnonyClassEx {

	public static void main(String[] args) {
		AnonyClass ac = new AnonyClass();
		
		ac.person.wake(); // AnonyClass() 안에 person의 wake() 실행
		
		ac.method1();
		
		// 자식 익명 객체를 method2의 파라메터로 넘김.
		ac.method2(new Person() {
			void study() {
				System.out.println("공부를 합니다.");
			}
			@Override
			void wake() {
				System.out.println("9시에 일어납니다.");
				study();
			}
		});
	}
}
