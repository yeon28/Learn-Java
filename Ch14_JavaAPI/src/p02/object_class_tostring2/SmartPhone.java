package p02.object_class_tostring2;

/*
 * toString 메소드 사용 목적
 * - 클래스를 뉴로 인스턴스 만들어 사용할 때, 현재 인스턴스의 모든 필드 정보를 얻고자 할 때 사용함.
 *   - 필드가 private로 선언된 경우 public인 getter메소드를 통해 필드 정보를 개별적으로 알 수 있는데ㅡ
 *   - toString은 모든 필드 정보를 한번에 알 수 있음(println을 사용하면 됨.)
 */
public class SmartPhone {

	private String company;
	private String os;
	
	public SmartPhone(String company,  String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		
		return (company +" , "+ os );
	}
	
	
}
