package q01.quiz04;

/*
 15. MemberService class에 메소드 선언하기.
 
 리턴 타입		: void			boolean			
 메소드 이름	: logout		login				
 매개변수(타입)	: id(String)	id(String),password(String)
 
 1) login() id가 "hong" password가 "12345" 경우에만 true 리
 	아니면, false 리턴하기.
 2) logout() "로그아웃 되었습니다." 출력하기 
 
 */

public class Quiz09_MemberService {

	public boolean Login(String id, String password) {
		if ((id == "hong") && (password == "12345")) {
			return true;
		}
		return false;
	}

	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

	public static void main(String[] args) {

		Quiz09_MemberService memberService = new Quiz09_MemberService();

		boolean result = memberService.Login("hong", "12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("id또는 password가 올바르지 않습니다.");
		}

	}

}
