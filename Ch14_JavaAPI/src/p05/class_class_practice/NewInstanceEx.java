package p05.class_class_practice;

/*
 Class class의 newInstance() 메소드
- 힙메모리에 인스천스를 만들려면 new를 사용해야함. 
  - newInstance() 매소드를 사용해도 힙메모리에 인스턴스 생성 가능
    -> new SendAction();
- new를 사용한것과 newInstance() 메소드를 사용한 것의 차이점
  - new를 사용한 것은 소스코드에서 인스턴스를 만들 클래스가 이미 결졍됨.
  - newInstance() 메소드를 사용하면, 프로그램 내부에서 가변적으로 인스턴스를 만들 클래스 변경 가능
   -> Spring framework에서 사용하는 방식
- newInstance() 메소드를 사용하명서 처리해야하는 exception
  - InstantiationException : 클래스가 abstract 이거나 interface인 경우 발생
  - IllegalAccessException : 클래스 modifier가 인스턴스를 만들수 없는 경우(private) 접근제한자인 경우 예외 발생
 */
public class NewInstanceEx {

	public static void main(String[] args) {

		Action action;
		String sendName = "p06.class_class_practice.SendAction";
		String recvName = "p06.class_class_practice.ReceiveAction";
		String name;

		try {
//			name = sendName;
			name = recvName;
			Class cls = Class.forName(name);
			
			action = (Action) cls.newInstance(); // 예외 모두 처리

			action.excecute();
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스명을 찾을 수 없음");
		} catch (InstantiationException e) {
			System.out.println("new로 인스턴스 생성 실패");
		} catch (IllegalAccessException e) {
			System.out.println("new로 인스턴스 생성 불가");
		}

	}

}
