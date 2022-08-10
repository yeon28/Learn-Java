package p05.encaosulation;

public class TestCircleWithPrivateFields {

	public static void main(String[] args) {
		
		Circle circle = new Circle(5.0);
		
		System.out.println("circle radius : " + circle.getRadius() + ", area : " 
						+ circle.getArea()+", 생성된 인스턴스 : " +circle.getNumberObjects());
		
		System.out.println();
		
		System.out.println("circle radius : " + circle.getRadius() + ", area : " 
				+ circle.getArea()+", 생성된 인스턴스 : " +circle.getNumberObjects());
		
	}

}
