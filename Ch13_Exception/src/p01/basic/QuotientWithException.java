package p01.basic;

import java.util.Scanner;

/*
�и� 0���� ������ ������ ���� ����ϱ�.

1. 2���� ���� ���� �Է� �޾�, 2���� ������ ���Ͽ� ������ ���� ����
2. �и�� �Էµ� ���� ���� 0�̸� ���ܿ��� �߻��ϰ� ���α׷� ���� ����Ǵ� ���� �߻�
*/
/*
Java - Exception class ����Ͽ� ���� ó���ϱ�.

1. try{} catch{} ���� ���
2. try �ȿ��� ������ �޼ҵ� �����ϸ鼭 exception�ν��Ͻ� �߻��ϸ� catch �ȿ� �ִ� �ڵ� ����
3. try �ȿ� exception �߻��Ͽ� catch�� ����Ǵ��� ������ �ڵ���� ���� �����.
 */
public class QuotientWithException {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("2���� ������ �Է�");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		
		try {
			int result = quotient(num1, num2);
			System.out.println(num1 + " / " + num2 + " = " + quotient(num1, num2));
		} catch (ArithmeticException e) { // catch ����
			System.out.println(e.getMessage());
		}
		

		System.out.println(">> ���α׷� ����");
	}

	public static int quotient(int num1, int num2) {
		if (num2 == 0) {
			// ������ exception �߻� 
			// (ArithmeticException class�� �ν��Ͻ��� �����Ͽ� exception �߻�)
			throw new ArithmeticException("�и� �ش��ϴ� ������ 0�� ����� �� �����ϴ�.");
			// throw ����
			//���ڿ��� �޴� ArithmeticException ������
		}
		return (num1 / num2);
	}
}
