package p01.basic;

/*
 Interface의 정의
 - 상수와 abstract method만 사용하는 것이 원칙임
   - 2016년 Java1.8 부터 default static메소드를 추가함.
 문법
 - field를 선언할 때, public static final을 사용하지 않고 자동 상수로 만들어줌.
 - method를 선언할 때, public abstract를 사용하지 않아도 자동으로 붙여쥼
 - 인터페이스 사용의 기본은 폴리모피즘 방식으로 사용하는 것이 기본임
   - 인터페이스 변수명 = 인터페이스구현클래스 인스턴스 
   		변수 이름. 추상메소드구현메소드 -- 형식사용
   		
 - 부모 역할을 하는 인터페이스는 기본적으로 힙메모리에 생성되지 않음. 
 */
public class RemoteControlEx {

	public static void main(String[] args) {
		// RemoteControl 인터페이스 이름이 데이터 타입으로 간주함.
		RemoteControl rc;
		
		rc = new Audio();	// promotion
		
		rc.turnOn();		// polymorphism
		rc.setVolume(7);
		rc.turnOff();
		
		rc = new Television();	// promotion
		
		rc.turnOn();		// polymorphism
		rc.setVolume(7);
		rc.turnOff();
	}

}
