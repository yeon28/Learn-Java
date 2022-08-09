package p01.basic5;

/*
 * new Student()를 실행할 때 , new Student클래스의 필드는 초기화 된다
 * 
 * int , short byte char long은 0
 * float double 은 0.0
 * string, 배열  등 참조객체는 null로 초기화
 * 
 */
public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student();

		System.out.println("name :" + student.name);
		System.out.println("age :" + student.age); // 0 출력 --> 아스키 코드 값 0= null
		System.out.println("컴퓨터 전공 :" + student.isComputerMajor);
		System.out.println("성별 :" + student.gender);
		
//		System.out.println("i : "+ i); --> 초기 값이 없어서 에러

	}

}
