package p01.basic2;

public class TestCircle {
	/*
	 * �ڹ� Ŭ������ ���� �޼ҵ尡 �ִ� Ŭ������ ���� �޼ҵ尡 ���� Ŭ������ ���� ������.
	 * 
	 * �ڹ� ���α׷��ָ� �Ѵٴ� ���� - 1���� ���� �޼ҵ尡 �ִ� Ŭ����+���θ޼ҵ尡 ���� �������� Ŭ������ - ���� �޼ҵ尡 �ִ� Ŭ������
	 * ���� �޼ҵ尡 ���� Ŭ���� ���� ��� - ���� �޼ҵ尡 ���� Ŭ���� ���� ���� �޼ҵ尡 ���� �ٸ� Ŭ�������� ����� �� ����
	 * 
	 * ���� �޼ҵ尡 ���� Ŭ���� ���� �Ϲ������� �ڹ� ���̺귯�� ��� �θ� - �ڹ� ���� �⺻������ �����ϴ� ���̺귯�� : scanner
	 * system ... - jsp spring���� �����ϴ� �����α׷��� Ŭ���� ���̺귯�� - �ڹ� �����ڰ� ���� Ŭ������ -->Ŭ����
	 * ���̺귯��
	 * 
	 * Ŭ���� �ϳ��� OOP ��ü ���� ���α׷����� �ϳ��� ������ �ǹ���
	 * 
	 */
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "�÷�������");
		double area = pizza.getArea();

		System.out.println(pizza.name + "�� ���� : " + area);

		// ���������� ������ 12
		pizza.radius = 12;
		pizza.name = "����������";
		System.out.println(pizza.name + "�� ���� : " + area);

		Circle pineApplePizza = new Circle(11, "���ο�������");
		area = pineApplePizza.getArea();
		System.out.println(pineApplePizza.name + "�� ���� : " + area);

		Circle dounut = new Circle(5, "����");
		area = dounut.getArea();
		System.out.println(dounut.name + "�� ���� : " + area);


	}

}
