package p01.basic;

//Circle c�� �ǹ�
//Circle�� Ŭ���� �̸��̸鼭 ������ Ÿ���� 
// -> Circle ���ο��� field�� radius�� �ְ� �޼ҵ��� getArea getPerimeter setRadius����
//c, c2 : circle �ν��Ͻ�(instance)/objest�� ����Ű�� ����
//
//new Circle() ��ɾ� ����� ��ȯ�� ����
//- new�� ������ : ���޸𸮿� Circle Ŭ������ �ν��Ͻ��� ����� �ν��Ͻ��� ���޸� �ּҸ� ����
//  - .instance �ȿ��� �ʵ�鸸 ���� ����. ��, radius�ʵ常 ���� ����, �޼ҵ�� ���޸𸮿� ����
//- Cricle Ŭ������ ������(constructor) �޼ҵ��� public Circle()�� ������
//- �� �޸𸮿��� ������ �ν��Ͻ��ּҸ� ���ø޸𸮿� �ִ� ���� c�� �־���
//
//Circle class�� �ν��Ͻ��� c c2�� ����Ͽ� Circle Ŭ������ �ʵ�� �޼ҵ带 ���

public class TestCircle {

	public static void main(String[] args) {

		Circle c = new Circle();
		
		System.out.println("Circle class ��ü(�ν��Ͻ�)�� c�� ������ : " + c.radius);
		System.out.println(" Circle class ��üc�� ���� : " + c.getArea());
		System.out.println(" Circle class ��üc�� �ѷ� : " + c.getPerimeter());
		
		System.out.println();
		
		c.setRadius(3);
		System.out.println("Circle class ��ü(�ν��Ͻ�)�� c�� ������ : " + c.radius);
		System.out.println(" Circle class ��üc�� ���� : " + c.getArea());
		System.out.println(" Circle class ��üc�� �ѷ� : " + c.getPerimeter());
		
		System.out.println();
		
		Circle c2 = new Circle(2);
		System.out.println("Circle class ��ü(�ν��Ͻ�)�� c�� ������ : " + c2.radius);
		System.out.println(" Circle class ��üc�� ���� : " + c2.getArea());
		System.out.println(" Circle class ��üc�� �ѷ� : " + c2.getPerimeter());
		
		
	}

}
