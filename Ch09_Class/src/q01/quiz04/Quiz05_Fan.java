package q01.quiz04;

import java.util.Iterator;

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

public class Quiz05_Fan {
	
	static final int SLOW = 1;
	static final int MEDIUM = 2;
	static final int FAST = 3;

	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";

	public Quiz05_Fan() {
		// default constructor 생성
	}

	public void on() {
		on = true;
	}

//	-------------------getter method
	public int getSpeed() {
		return speed;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

//	-------------------setter method

	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	public void printFanInformation() {
		if (on) {
			System.out.println("speed\t: " + speed);
			System.out.println("radius\t: " + radius);
			System.out.println("color\t: " + color);
		}else {
			System.out.println("선풍기가 꺼져 있습니다.");
		}
		
	}

}
