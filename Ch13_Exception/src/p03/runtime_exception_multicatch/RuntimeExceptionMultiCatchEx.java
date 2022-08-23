package p03.runtime_exception_multicatch;

/*
 Exception ó�� ��ü ����
 - try ������ catch ������ ��� ������.
   - try - multi catch - finally
   - finally�� ��� ������.
- finally�� try���� Exception�� �߻����� �ʴ��� ������ �����.   
 */
public class RuntimeExceptionMultiCatchEx {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;

		try {
			// ArrayIndexOutOfBoundsException �߻�
			data1 = args[0];	// args[0] = null;
			data2 = args[1];	// args[1] = null;

			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;

			System.out.println(data1 + " + " + data2 + " = " + result);

			Class cls = Class.forName("java.lang.String2");

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("���� �Ű� ������ ���� ����");
			System.out.println("[���� ���]");
			System.out.println("eclipse Run - Run Configuration �޴��� ���� num1 num2 �Է��ϼ���");

		} 
		
		//  Run Configuration���� 10 10a�� �־��� ��
		catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ �Ұ� ");

		} 
		
		//  Run Configuration���� 10 20�� �־��� ��, Class cls = Class.forName("java.lang.String2"); �̸�
		catch (ClassNotFoundException e) {
			System.out.println("compile time ���� exception ���� ó��");

		} 
	//  Run Configuration���� 10 20�� �־��� ��, Class cls = Class.forName("java.lang.String"); �̸�
		finally {
			System.out.println("���� ���� ó�� ���α׷� ����");
		}

	}
}
