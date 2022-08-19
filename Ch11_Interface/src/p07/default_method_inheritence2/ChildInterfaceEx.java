package p07.default_method_inheritence2;

/*
 �θ� interface���� ����� default method�� �ڽ� interface���� ����ϴ� �������� ���
 
 - �θ� interface���� ����� default method�� �ܼ� ���
 - �θ� interface���� ����� default method�� �ڽ� interface���� override�Ͽ� default method ������ ���
 - �θ� interface���� ����� default method�� �ڽ� interface���� abstract method�� override�Ͽ� ���
 */
public class ChildInterfaceEx {

	public static void main(String[] args) {
		ChildInterface ci = new ChildInterface() {
			
			@Override
			public void method1() {
				System.out.println("�͸� method1 ����");
			}
			
			@Override
			public void method3() {
				System.out.println("�͸� method3 ����");
			}
			
			@Override
			public void method2() {
				System.out.println("�͸� method2 ����");
			}
		};
		
		ci.method1();
		ci.method2();
		ci.method3();
	}
}
