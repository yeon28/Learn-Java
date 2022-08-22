package p02.runtime_exception;
/*
NumberFormatException
- String ���ڿ��� ������ �� ���ڷ� ��ȯ�� �� ���� �� �߻�
   ex) Integer.parseInt("a100")
 */
public class NumberFormatExceptionEX {
	
	public static void main(String[] args) {
		
//		String data1 = "100";
//		String data2 = "a100";
//
//		int val1 = Integer.parseInt(data1);
//		
//		int val2 = Integer.parseInt(data2);
//		//--> error : java.lang.NumberFormatException: For input string: "a100"
//		//String ���ڿ��� ������ �� ���ڷ� ��ȯ�� �� ���� �� �߻���.
//
//		int result = val1 + val2;
//		System.out.println(data1 + " + " + data2 + " = " + result);

//		-----------------------------------------------------------------
		
		String data1 = "100";
		String data2 = "a100";
		
		try {
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			
			int result = val1 + val2;
			System.out.println(data1 + " + " + data2 + " = " + result);
			
		} catch (NumberFormatException e) {
			
			System.out.println("���ڿ��� ���ڷ� ��ȯ�� �� �����ϴ�.");
		}
		
		
	}
}
