package p04.system_class;

/*
 * System class�� exit(int status) method
 
 - �������� ���α׷� ���� ����
 
 - exit method���� �Ű������� status ���� 
   - status ���� �����̵��� ���α׷� ���������δ� �ƹ� �ǹ� ����
   - ��� status ���� 0�̸�, ���� �����Ѵٴ� �ǹ�
   - 0�� �ƴ� �ٸ� ������� ���α׷��� ������������ ����Ǿ��ٴ� �ǹ�(���� �������� ���ο��� �ǻ����)
     ex) Hardware error�� 0, network error�� 1... �̷������� 
   - java���� System.exit()�޼ҵ带 ���� status���� ��� ���� ������ ���α׷��� ���� ����
 
 - System.setSecurityManager �޼ҵ�� status���� Ư�� �������� ��츸 ���α׷��� ���� ����ǵ��� �ڵ� ������.
   - ���: setSecurityManager�� �Ű������� SecurityManager Ŭ������ �͸�ü�� �Ű������� �ѱ��,
   - SecurityManager �͸�ü�� checkExit �޼ҵ带 override�Ͽ� �ڵ���
   - ����: exit()�޼ҵ带 �����ϸ� JVM �ý����� ���� �����ϱ� ���� checkExit() �޼ҵ� �ڵ� ������.
 
 - �� �������� ����� ����
   - �ڽ� Ŭ������ �͸�ü�� �����Ͽ� �޼ҵ��� �Ű������� �ѱ�
   - �޼ҵ��� �Ű����� Ÿ���� �θ�Ŭ�������� �ڽ��� �͸�ü�� �θ� Ŭ������ �ڵ�����ȯ(promotion)
   - �͸�ü���� �θ� Ŭ������ �޼ҵ带 override�߱� ������, �θ� �ν��Ͻ����� �θ� �޼ҵ带 ������ ��
     override�� �͸�ü�� �޼ҵ尡 �����(polymorphism)
 */
public class ExitEx {

	public static void main(String[] args) {

		System.setSecurityManager(new SecurityManager() {
			
			@Override
			public void checkExit(int status) {
				if (status != 5) {
					throw new SecurityException();
				}
			}
		});
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			try {
				System.exit(i);
			} catch (SecurityException e) {
				System.out.println("Security Exception ȣ���.");
			}
		}
		
	}

}
