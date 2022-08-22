package p02.runtime_exception;

/*
ArrayIndexOutOfBoundsException
- array���� ������ �� ���� index�� array�� ����ϸ� �߻���.
- RuntimeException�� ������ ���� �ɷ¿� ���ؼ� �Ǵ��Ͽ� try-catch���� ������ ��.
 */
public class ArrayIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		
		try {
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭���� ������ �� ���� index�Դϴ�.");
			
		}
//		
//		System.out.println("---------------------------------");
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
		//--> error : Index 3 out of bounds for length 3
		//�ε��� ���� ���� �� �� ���� �༭ �߻��� ����
	}
}
