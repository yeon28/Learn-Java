package p04.polymorphism2;

public class Driver {
	// method parameter의 데이터 타입으로 인터페이스 사용 가능함.
	// promtion발생 - 자식 클래스에서 부모인 인터페이스타입으로 변환
	public void driver(Vehicle vehicle) {
		vehicle.run();	// polymorphism
	}
	
}
