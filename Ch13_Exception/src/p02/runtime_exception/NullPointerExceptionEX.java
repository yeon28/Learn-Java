package p02.runtime_exception;

/*
NullPointerException
- null��ü�� '.'�� ����Ͽ� �޼ҵ带 ����� ��� �߻��ϴ� ����
 */
public class NullPointerExceptionEX {

	public static void main(String[] args) {
		
//		String data = null;
//		
//		// ptintln method���� parameter�� �Ѿ���� String �ν��Ͻ��� null�̸� null���
//		System.out.println(data);
//		System.out.println(data.toString());
//		//--> error : Cannot invoke "String.toString()" because "data" is null
//		//null��ü�� '.'�� ����Ͽ� �޼ҵ带 ����� ��� �߻��ϴ� ���� 
		
//		----------------------------------------------------------
		
		String data = null;
		try {
			System.out.println(data);
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer error �߻�");
		}
		
		
	}
}
