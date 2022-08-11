package p06.method_parameter_object;

//메소드 리턴 타입을 클래스로 선언한 경우 (리턴값이 힙메모리에 생성된 인스턴스 주소 임 )

public class TestPassObject2 {

	public static void main(String[] args) {
		 Circle circle = createCicleInstance(1);
		 
		 System.out.println("circle 주소 : "+ System.identityHashCode(circle));
		 
		 int times = 5;
		 
		 System.out.println("Radius \t\t Area");
		while (times >=1 ) {
			System.out.println(circle.getRadius() + "\t\t" + circle.getArea());
			circle.setRadius(circle.getRadius()+1);
			times--;
		}
		
	}

	public static Circle createCicleInstance(double radius) {
		if (radius < 0 ) {
			
		}
		Circle c = new Circle(radius);
		System.out.println("c 주소 : "+ System.identityHashCode(c));
		
		return c;
	}
	
}
