package q04;

/*
 6. BMI class 만들기

 
 체지방 측정 BMI class 만들고 테스트 하시오.
 
▪ fields
• name (private String type), age (private int type)
• weight, height (private double type, kgram, meter)

▪ constructor
• BMI (String name, double weight, double height) => age는 default 20
• BMI (String name, int age, double weight, double height)

▪ methods
• public double getBMI() : BMI 계산 = 체중 / (키 * 키)
• public String getStatus() :
	- bmi < 18.5 인 경우 “저체중 입니다.”, 18.5 <= bmi < 25 인 경우 “정상 체중 입니다.”출력
	- 25 <= bmi < 30 인 경우 “과체중 입니다., - 30 <= bmi 인 경우 “비만 입니다.” 라는 내용 출력
• getName(), getAge(), getWeight(), getHeight()

▪ TestBMI class
• 2개의 constructor에 대한 parameter설정하여 BMI 인스턴스 생성하여 getBMI(),
getStatus()를 호출하여 비만도 결과 출력
 */

public class Quiz06_TestBMI {

	public static void main(String[] args) {

		Quiz06_BMI bmi1 = new Quiz06_BMI("패트", 65, 170);

		System.out.println("이름\t: " + bmi1.getName());
		System.out.println("나이\t: " + bmi1.getAge());
		System.out.println("키\t: " + bmi1.getHeight() + "kg");
		System.out.println("몸무게\t: " + bmi1.getWeight() + "m");
		System.out.println("BMI\t: " + bmi1.getBMI() + " [" + bmi1.getStatus() + "]");

		System.out.println("------------------------------------------");

		Quiz06_BMI bmi2 = new Quiz06_BMI("매트", 28, 69, 175);

		System.out.println("이름\t: " + bmi2.getName());
		System.out.println("나이\t: " + bmi2.getAge());
		System.out.println("키\t: " + bmi2.getHeight() + "kg");
		System.out.println("몸무게\t: " + bmi2.getWeight() + "m");
		System.out.println("BMI\t: " + bmi2.getBMI() + " [" + bmi2.getStatus() + "]");

	}

}
