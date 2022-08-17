package p10.abstract_method;

//abstract method를 사용하려면 반드시 클래스는 abstract클래스이여야 함.
public abstract class Animal {
	public String kind;
	
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상메소드 : 메소드 바디에 대한 코딩이 없음
	public abstract void sound();
}	
