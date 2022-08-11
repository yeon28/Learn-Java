package p06.method_parameter_object_array;
/*
  private 키워드
  - 대상 : field, 메소드 에서 사용가능 (컨스트럭터도 사용 가능)
  - 사용목적 :
    - 클래를 사용하는 다른 클래스에서 사용하지 못하게 하는 것이 목적  
    			-> 하지만 클래스에서 제한없이 사용 가능
    - 일반적으로 오브젝트 오리엔티드 프로그래밍을 할 때, 필드는 프라이빗으로 선언하는 것이 일반적
      			-> 대신 프라이빗으로 선언한 필드들에 대해서 다른 클래스 에서 해당 필드를 사용하기 위해 퍼블릭으로 선언한 getter/ setter메소드를 제공함
       - 메소드에 대해서 만약 프라이빗으로 선언한 것은 클래스 내부적으로만 사용하고 외부에 공개하지 않겠다는 의미 
  - Encapsulation(캡슐화) : 클래스 필드,메소드 등을 프라이빗으로 선언해서 외부에 공개하지 않는 것을 의미함 
 */
public class Circle {
	private double radius = 1;
	private String name;
	private static int numberObjects = 0;
	// 위 필드 들은 가급적 오픈하지 않음,
	// 

	public Circle() {
		this.radius = 1;
		numberObjects++;
	}

	public Circle(double newRadius) {
		this.radius = newRadius;
		numberObjects++;
	}

	// getter method
	public double getRadius() {
		return radius;
	}

	// setter method
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
	}

	// getter method
	public static int getNumberObjects() {
		return numberObjects;
	}

	// 원의 면적 구하는 메소드 선
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// 원의 둘레 구하는 메소드 선
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	private void printPrivateHello() {
		System.out.println("hello private method");
	}

}
