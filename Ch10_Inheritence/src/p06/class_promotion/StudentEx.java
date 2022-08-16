package p06.class_promotion;

/*
 class에서 자동형변환(promotion) 정의
 1. 부모 자식 클래스간에서만 발생함
 2. 자식 인스턴스를 부모 데이터 타입으로 넘길 때 발생되는 현상
 		- Person p = new Child(); 와 같은 개념
 3. 힙메모리 사용 관점에서 보면, promotion은 자식 인스턴스가 생성한 자식 인스턴스 2개 중 부모만 사용함
 4. 자식 인스턴스를 부모 인스턴스로 promotion하면, 부모 클래스에서 선언된 field method만 사용 가능
 */
public class StudentEx {

	public static void main(String[] args) {

		Person p;
		Student s = new Student("홍길동");
		s.printPersonInformation();
		s.printStudentInformation();
		
		// promotion 발생
		// - 자식 클래스 인스턴스를 부모 클래스 인스턴스로 자동 형변환
		p=s;
		p= new Student("김길동"); // --> 이런 식으로도 사용 가능
		
		s.printPersonInformation(); 
//		s.printStudentInformation(); // p에서는 자식 인스턴스의 method 사용 불가능
		
		 
		 
		
	}

}
