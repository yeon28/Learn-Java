package q04;

/*
13. Member class로 모델링 하기.
 
 다음 데이터를 갖는 Member class를 선언해보세요.
 
 데이터 이름 	: 이름 	아이디 	패스워드 		나이
 필드 이름	 	: name 	id 		password 	age 
 타입 		: 문자열 	문자열 	문자열 		정수 
 */

/*
14. Member class에 생성자 추가히기.
 
 Member user1 = new Member("홍길동", "hong");
 Member user2 = new Member("강자바", "java");
 
 다음과 같이 멤버 객체를 생성할 때 name field와 id field를 외부에서 받은 값으로 초가화 선언해보세요.
 */

public class Quiz08_Member {

	String name;
	String id;
	String password;
	int age;

	public Quiz08_Member(String newName, String newID) {
		this.name = newName;
		this.id = newID;
	}

	public static void main(String[] args) {

		Quiz08_Member user1 = new Quiz08_Member("홍길동", "hong");
		Quiz08_Member user2 = new Quiz08_Member("강자바", "java");

	}

}
