package p01.basic2;

public class Circle {
	double radius = 1;
	String name = "�÷�������";
//	Scanner input; // Ŭ���� �ȿ� �ٸ� Ŭ������ ���� ����� �� ����
	
	public Circle() {
		System.out.println("Circle defalt costructor ȣ��");
	}
	
	public Circle(double newRadius) {
		System.out.println("Circle defalt(double newRadius) costructor ȣ��");
		radius = newRadius;
	}
	
	public Circle(String newName) {
		name = newName;
	}
	
	public Circle(double newRadius, String newName) {
		radius = newRadius;
		name = newName;
	}
	
//	������ ��
//-------------------------------------------------------------------
//	�޼ҵ� �Ʒ�
	
	// ���� ���� ���ϴ� �޼ҵ�
	public double getArea() {
		return radius*radius*Math.PI;
	}
	// ���� �ѷ��� ���ϴ� �޼ҵ�
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

}
