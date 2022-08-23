package p02.object_class_tostring;

import java.util.Date;

/*
 * println(obj)�޼ҵ� ���������� obj�� Ŭ������ �ν��Ͻ���� , obj.toString() ����
 * - Object Ŭ������ toString() �޼ҵ� ������
 *   - ��Ű���� + Ŭ������ + @ + ���޸��ּ�(16����)
 * - String, Date class�� Object class�� toString()�޼ҵ带 override�Ͽ� Ŀ���͸���¡
 */
public class ToString {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		String name = "ȫ�浿";
		Date date = new Date();
		
		System.out.println(System.identityHashCode(obj)); // ���޸� 10���� �ּ� ���
		System.out.println(System.identityHashCode(obj.toString()));
		
		System.out.println(obj.toString()); // toString()�޼ҵ� 16������ ���
		System.out.println(obj);			// obj.toString() method ����
		
		System.out.println(name.toString()); 
		System.out.println(name);
		
		System.out.println(date.toString());
		System.out.println(date);
		
	}
	
}
