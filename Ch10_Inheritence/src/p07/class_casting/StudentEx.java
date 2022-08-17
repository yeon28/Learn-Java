package p07.class_casting;
/*
 casting(강제형변환)의 정의
 - 부모 자식 클래스 간에 사용 가능
 - 자식 클래스타입 변수이름(인스턴스명) = (자식클래스타입) 부모 인스턴스; 형식
   - ex) Student s = (Student) p;
 - 힙메모리 관점에서 보면,
   - p는 힙 메모리에 원래 자식 인스턴스와 부모인스턴스가 존재, 형변환에 의해서 부모 인스턴스만 사용하는 경우
   - s로 강제형변환(casting)하면, 부모인스턴스 뿐만 아니라, 힙메모리에 있는 자식 인스턴스도 사용
 */
public class StudentEx {

	public static void main(String[] args) {

		Person p;
		Student s = new Student("홍길동");
		s.printPersonInformation();
		s.printStudentInformation();
		
		
		p=s;
		s.printPersonInformation(); 
		
		Student s1 = null;
		s1= (Student) p;	// casting
		s1.printPersonInformation(); 
		s1.printStudentInformation();
		
		Person p1= new Person("홍길동");
		s = (Student) p1;	// casting
		s.printPersonInformation();
//		s.printStudentInformation();
//		--> error) runtime error (Exception) 발생함. 
		
	}

}
