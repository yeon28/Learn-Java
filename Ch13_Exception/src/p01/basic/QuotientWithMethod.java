package p01.basic;

import java.util.Scanner;

/*
�и� 0���� ������ ������ ���� ����ϱ�.

1. 2���� ���� ���� �Է� �޾�, 2���� ������ ���Ͽ� ������ ���� ����
2. �и�� �Էµ� ���� ���� 0�̸� ���ܿ��� �߻��ϰ� ���α׷� ���� ����Ǵ� ���� �߻�
*/
public class QuotientWithMethod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("2���� ������ �Է�");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		System.out.println(num1 + " / " + num2 + " = " + quotient(num1, num2));

		System.out.println(">> ���α׷� ����");
	}

	public static int quotient(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("�и� �ش��ϴ� ������ 0�� ����� �� �����ϴ�.");
			System.exit(1);
		}
		return (num1 / num2);
	}
}
