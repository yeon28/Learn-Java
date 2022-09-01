package q04;

/*
 5. Fan class 만들기
 
 선풍기 Fan class 만들고 테스트 하시오
 
▪ fields
• constant(상수) : SLOW (1), MEDIUM (2), FAST (3)
• speed (private int type, 초기값 SLOW)
• on (private boolean type, 초기값 false)
• radius (private double type, 초기값 5)
• color (String type, 초기값 “blue”)

▪ constructor
• default constructor 생성

▪ methods
• Getter/setter 만들기 : 전체 fields 변수
• public void printFanInformation() 
	: on 이 true이면 speed, radius, color 출력하고,
	on이 false이면 “선풍기가 꺼져 있습니다.”라는 내용 출력

▪ TestFan class
• 첫번째 인스턴스 생성후에, speed(FAST), radius는 10, color는 “yellow”로 설정
• 두번째 인스턴스 생성후에, speed(MEDIUM), radius는 5, color는 “blue”로 설정
• 출력내용 : 2개의 인스턴스에 대하여 printFanInformation() 메소드 실행
 */

public class TestFan {

	public static void main(String[] args) {
		
		Quiz05_Fan fan1 = new Quiz05_Fan();
		
		fan1.on();
		
		fan1.setSpeed(fan1.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		
		fan1.printFanInformation();
		
		System.out.println("------------------------------");
		
		Quiz05_Fan fan2 = new Quiz05_Fan();
		
		fan2.on();
		
		fan2.setSpeed(fan2.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		
		fan2.printFanInformation();
		
	}

}
