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

public class Quiz06_BMI {
	private String name;
	private int age;
	private double weight;
	private double height;

	public Quiz06_BMI(String newName, double newWeight, double newHeight) {
		age = 20;
		this.name = newName;
		this.weight = newWeight;
		this.height = newHeight;

	}

	public Quiz06_BMI(String newName, int newAge, double newWeight, double newHeight) {
		this.name = newName;
		this.age = newAge;
		this.weight = newWeight;
		this.height = newHeight;
	}

//	-----------------------------

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public double getBMI() {
		return weight / (height * height) * 10000;
	}

	public String getStatus() {
		if (getBMI() < 18.5) {
			return "저체중 입니다.";
		} else if ((18.5 <= getBMI()) && (getBMI() < 25)) {
			return "정상 체중 입니다.";
		} else if ((25 <= getBMI()) && (getBMI() < 30)) {
			return "과체중 입니다.";
		} else {
			return "비만 입니다.";
		}

	}

}
