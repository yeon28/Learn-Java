package p04.catch_order;

/*
 Exception multi catch ó�����
 - catch ������ �ſ� �߿���.
   - catch���� �ֻ��� class�� Exception�� �� ó���� ������ catch���� Exception blockdló�� �ȵ�
   - �ڵ�����ȯ�� �߻��ϱ� ����
 - �ֻ��� �θ� Ŭ������ exception�� multi-catch block�� �� �������� ����
 
 */
public class CatchOrderEX {

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

//				Class cls = Class.forName("java.lang.String2");
				Class cls = Class.forName("java.lang.String");
			
				
//			// Exception class�� ��� runtimeException, compile���� ����� �θ���.
//			// --> promotion �߻�
//			}catch (Exception e) {// ��� Exception ����Ǵ� ���� �߻�}	

				
			} catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("���� �Ű� ������ ���� ����");
				System.out.println("[���� ���]");
				System.out.println("eclipse Run - Run Configuration �޴��� ���� num1 num2 �Է��ϼ���");

			} 
			catch (NumberFormatException e) {
				// Run Configuration���� 10 10a�� �־��� ��
				System.out.println("���ڷ� ��ȯ �Ұ� ");
				
			} 
			catch (ClassNotFoundException e) {
				// Run Configuration���� 10 20�� �־��� ��, 
				// Class cls = Class.forName("java.lang.String2"); �̸�
				System.out.println("compile time ���� exception ���� ó��");

			} catch (Exception e) { // Exception�� ��ȣ�� ����
				System.out.println("���� ����� Exception �̿ܿ� �ٸ� Exception �߻�");
			}
			finally {
				// Run Configuration���� 10 20�� �־��� ��, 
				// Class cls = Class.forName("java.lang.String"); �̸�
				System.out.println("���� ���� ó�� ���α׷� ����");
			}
		
	}

}
