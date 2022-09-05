package p07.object_io_stream;

import java.io.Serializable;

/*
Class로 선언된 인스턴스(new로 힙메모리에 생성된)는 기본적으로 file에 read/write 가능, 네트워크 송신 가능
 - field만 가능(생성자, 메소드 제외)
 - field에서도 static은 제외함.
 - transient는 Serializable 인터페이스를 implemet한 크래스에서 사용함
   -> file에 write하거나, 네트워크에서 송수신 대상에서 제외할 목적으로 사용함.
     ex) password를 관리하는 field인 경우 사용함.
 */
/*
file에 read/write나 네트워크상에서 데이터 송수신용으로 Serializable을 선언한 이유
1.ObjectOutputStream을 사용하여 write할 때, byte단위로 직열화함(serialization)
  -> file에 write할 때, encoding하는 것과 동일함.
2. ObjectIntputStream을 사용하여 read할 때, 원래 클래스 인스턴스로 변환(decoding)하는 역직렬화(re-serialization)
3. 송수신할 클래스를 변경하는 것을 막기 위해 or 송수신할 클래스가 변경되지 않았다는 것을 guarantee하기 위해 Serializable 선언
4. serialVersioUID
  - UID는 class가 변경될 때 새로 생성되는 난수
5. 만약 class에서 serialVersioUID를 명시적으로 값을 부여하면,
  - 클래스에서 필드 추가 등의 변화가 있더라도 file read/write나 데이터 송수신시 에러 발생 안 함.
 */
public class ClassA implements Serializable {
	static final long serialVersionUID = 1;
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;
	int field5;
}
