package p01.basic5;

/*
 * 모든 클래스들은 최소한 1개의 생성자가 존재해야함
 * - 만약 클래스에서 생성자 선언한 것이 없으면 jvm이 default 생성자를 만들어 줌
 *   -->하지만 디폴트 생성자 외에 다른 생성자가 이미 존재하면,
 *    jvm이 디폴트 생성자를 자동으로 만들어 주지 않음.
 *   
 */
public class Student {
	String name;
	int age;
	boolean isComputerMajor;
	char gender;
//	int i; --> 초기 값이 없어서 에러

	public Student() {

	}

}
