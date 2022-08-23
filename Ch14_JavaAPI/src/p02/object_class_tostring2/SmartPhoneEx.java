package p02.object_class_tostring2;

public class SmartPhoneEx {

	public static void main(String[] args) {

		SmartPhone phone = new  SmartPhone("구글", "안드로이드");
		
		System.out.println(phone);
//		System.out.println(phone.toString()); 
		// 이렇게 만들 필요 없음. SmartPhone클래스에 toString이 오버라이드 되어있음.
		
		
	}

}
