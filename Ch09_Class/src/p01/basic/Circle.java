package p01.basic;

//Ŭ���� �̸� : Circle(ù���ڴ� �빮��)
//- field(�Ӽ�) : radius
//- constructor(������): Circle() Circle(double newRadius)
//  - ������ �̸��� Ŭ���� �̸��� ������
//  - �����ڴ� Ư���� ��쿡 ����ϴ� �޼ҵ� 
//    (�����ڴ� new Cricle()���� ������� ���޸𸮿� �ν��Ͻ� ���� ��, �ڹ� ���������� �� ���� �����)
//  - ������ �����ε� : �޼ҵ� �����ε��� ���� ������
//  - Ŭ���� ���� �����ڴ� ������ ����� �� �� ����
//- class method : getArea() getPerimeter() setRadius(double newRadius)

  
public class Circle {
	double radius = 1;
	
	public Circle() {
		System.out.println("Circle defalt costructor ȣ��");
	}
	
	public Circle(double newRadius) {
		System.out.println("Circle defalt(double newRadius) costructor ȣ��");
		radius = newRadius;
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
