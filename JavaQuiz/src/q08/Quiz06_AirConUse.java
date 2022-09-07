package q08;

public class Quiz06_AirConUse {

	public static void main(String[] args) {
		// 객체생성
		Quiz06_AirCon airCon = new Quiz06_AirCon();

		// 변수 사용
		airCon.color = "White";
		airCon.temp = 10;
		airCon.price = 10000;

		// 메소드 사용
		airCon.tempUp();
		System.out.println("airCon.temp = " + airCon.temp + ", airCon.color = " + airCon.color + ", airCon.price = "
				+ airCon.price + "원 ");

		airCon.powerOn();
		airCon.powerOff();

		airCon.tempDown();
		System.out.println("airCon.temp = " + airCon.temp + ", airCon.color = " + airCon.color + ", airCon.price = "
				+ airCon.price + "원 ");
	}

}
