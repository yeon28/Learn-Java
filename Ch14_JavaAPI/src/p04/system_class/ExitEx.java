package p04.system_class;

/*
 * System class의 exit(int status) method
 
 - 사용목적은 프로그램 강제 종료
 
 - exit method에서 매개변수인 status 값이 
   - status 값이 무엇이든지 프로그램 내부적으로는 아무 의미 없음
   - 통상 status 값이 0이면, 정상 종료한다는 의미
   - 0이 아닌 다른 정수라면 프로그램이 비정상적으로 종료되었다는 의미(개별 프로젝팀 내부에서 의사결정)
     ex) Hardware error는 0, network error는 1... 이런식으로 
   - java에서 System.exit()메소드를 통해 status값이 어느 값이 오더라도 프로그램이 강제 종료
 
 - System.setSecurityManager 메소드로 status값이 특정 정수값인 경우만 프로그램이 강제 종료되도록 코딩 가능함.
   - 방법: setSecurityManager의 매개변수로 SecurityManager 클래스의 익명객체를 매개변수로 넘기고,
   - SecurityManager 익명객체의 checkExit 메소드를 override하여 코딩함
   - 이유: exit()메소드를 실행하면 JVM 시스템을 강제 종료하기 전에 checkExit() 메소드 자동 실행함.
 
 - 위 예제에서 사용한 개념
   - 자식 클래스로 익명객체를 생성하여 메소드의 매개변수로 넘김
   - 메소드의 매개변수 타입이 부모클래스여서 자식인 익명객체가 부모 클래스로 자동형변환(promotion)
   - 익명객체에서 부모 클래스의 메소드를 override했기 때문에, 부모 인스턴스에서 부모 메소드를 실행할 때
     override된 익명객체의 메소드가 실행됨(polymorphism)
 */
public class ExitEx {

	public static void main(String[] args) {

		System.setSecurityManager(new SecurityManager() {
			
			@Override
			public void checkExit(int status) {
				if (status != 5) {
					throw new SecurityException();
				}
			}
		});
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			try {
				System.exit(i);
			} catch (SecurityException e) {
				System.out.println("Security Exception 호출됨.");
			}
		}
		
	}

}
