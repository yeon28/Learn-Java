package p01.not_generic;

/*
- Box class 만든 목적
  - 모든 클래스의 인스턴스를 사용하고 싶음
    - object field의 데이터타입을 Object 클래스로 선언
- Box class 한계와 문제점
  - getObject 메소드를 사용할 때 항상 자식 클래스로 강제형변환 해야함
    - 수행시간이 소요, 불필요한 자동형변환, 강제형변환이 반복
 */
public class BoxEx {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObject("홀길동");	// promotion
		String name = (String) box.getObject();	// casting
		
		box.setObject(new Apple());	// promotion
		Apple apple =  (Apple) box.getObject();	// casting
		
//		box.setObject(new Integer(10));	// promotion
		box.setObject(10);	// auto boxing(int -> Integer로 변환) 후 promotion
		Integer i = (Integer) box.getObject();	// casting
		
	}
}
