package p01.basic;

import java.util.Scanner;

/*
 �и� 0���� ������ ������ ���� ����ϱ�.
 
 1. 2���� ���� ���� �Է� �޾�, 2���� ������ ���Ͽ� ������ ���� ����
 2. �и�� �Էµ� ���� ���� 0�̸� ���ܿ��� �߻��ϰ� ���α׷� ���� ����Ǵ� ���� �߻�
 */
public class QuotientWithIf {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("2���� ������ �Է�");
		int num1 = in.nextInt();
		int num2 = in.nextInt();

		
		if (num2 != 0) {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		}else {
			System.out.println("�и� 0�� ����� �� �����ϴ�.");
			System.out.println("2��° �Է��� ���������� 0�� �ƴ� ������ �Է��ϼ���");
		}
		

		System.out.println(">> ���α׷� ����");
	}
}
