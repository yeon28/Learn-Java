package p01.basic;

/*
 Interface�� ����
 - ����� abstract method�� ����ϴ� ���� ��Ģ��
   - 2016�� Java1.8 ���� default static�޼ҵ带 �߰���.
 ����
 - field�� ������ ��, public static final�� ������� �ʰ� �ڵ� ����� �������.
 - method�� ������ ��, public abstract�� ������� �ʾƵ� �ڵ����� �ٿ���
 - �������̽� ����� �⺻�� ���������� ������� ����ϴ� ���� �⺻��
   - �������̽� ������ = �������̽�����Ŭ���� �ν��Ͻ� 
   		���� �̸�. �߻�޼ҵ屸���޼ҵ� -- ���Ļ��
   		
 - �θ� ������ �ϴ� �������̽��� �⺻������ ���޸𸮿� �������� ����. 
 */
public class RemoteControlEx {

	public static void main(String[] args) {
		// RemoteControl �������̽� �̸��� ������ Ÿ������ ������.
		RemoteControl rc;
		
		rc = new Audio();	// promotion
		
		rc.turnOn();		// polymorphism
		rc.setVolume(7);
		rc.turnOff();
		
		rc = new Television();	// promotion
		
		rc.turnOn();		// polymorphism
		rc.setVolume(7);
		rc.turnOff();
	}

}
