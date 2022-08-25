package p01.using_generic;

/*
 Box<String> 자체가 데이터 타입이면서 클래스명임.
 Box.java에서 Box<T>가 Box<String>이라는 의미
  -> JVM이 실행할 때, Box<String>에 대한 class를 만들어 놓음. 
  -> Box<Apple> Box<Integer>도 JVM이 시행할 때, 별도로 클래스를 만들어 놓음
 단점은 class가 메모리에 여러개 만들어 짐.
 
 - 컴파일 시 데이터 타입이 결정됨
   - 어떠한 데이터 타입을 사용하더라도 캐스팅 없이 사용 가능함.
 - Generic 타입을 클래스뿐만 아니라 Interface와 method에 대해서도 사용 가능함.
 */
public class BoxEx {

	public static void main(String[] args) {
		Box<String> b1 = new Box<String>();
		b1.setT("Hello");
		String str = b1.getT();
		
		Box<Apple> a1 = new Box<Apple>();
		a1.setT(new Apple());
		Apple apple = a1.getT();
		
		Box<Integer> i1 = new Box<Integer>();
		i1.setT(new Integer(10));
		Integer ii = i1.getT();
	}
}
