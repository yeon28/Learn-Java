package p04.final_method;

public class SuperCar extends Car {
	
	@Override
	public void speedUp() {
		speed +=10;
	}
	
	// final로 선언된 부모 메소드를 자식 클래스에서 override 선언 불가
//	public void stop() {}
}
