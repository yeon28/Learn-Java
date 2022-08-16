package p03.method_override2;

/*
  자식 클래스에서 부모 클래스를 override 하더라도 
  명시적으로 부모 클래스의 super객체 인스턴스를 사용하여 부모 클래스의 필드와 메소드 호출 가능
 */
public class Circle extends Shape {
	String name;
	
	@Override	// annotation
	public void draw() {
		this.name = "Circle";
		// 부모 클래스의 필드 호출
		super.name = "Shape_New";
		// 부모 클래스의 메소드 호출
		super.draw();
		System.out.println("name :  " + name);
	}
	
}
