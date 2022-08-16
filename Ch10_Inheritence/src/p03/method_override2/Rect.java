package p03.method_override2;

/*
 1. 부모와 자식 클래스가 동시에 같은 이름으로 필드를 선언한 경우,
  	자식에서 선언한 필드 이름을 먼저 사용
 */
public class Rect extends Shape {
	String name;
	
	@Override	// annotation
	public void draw() {
		System.out.println("name :  " + name);
	}
	
}
