package p07.default_method_inheritence2;

// 부모 interface의 default method2를 추상메소드로 override 가능
public interface ChildInterface extends ParentInterface {

	void method3();
	
	@Override
	void method2();
}
