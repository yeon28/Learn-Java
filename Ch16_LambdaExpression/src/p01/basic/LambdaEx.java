package p01.basic;

/*
Lambda Expression 정의
1. Interface의 추상메소드로만 사용 가능
2. Interface의 추상메소드가 1개만 있을 경우 사용 가능함.
3. Lambda Expression(람다표현식)으로 생산된 인스턴스는 내부적으로 Interface를 자식 익명객체로 만드는 것과 동일함.
4. Lambda Expression(람다표현식) 예시 
  - () -> {System.out.println("hello, Lambda funtion MyInterface instance"); };
  -> sayHello()  추상메소드를 구현한 것을 표현
    - () : 괄호가 메소드 파라메터 리스트임. 
    - {System.out.println("hello, Lambda funtion MyInterface instance"); }
      : sayHello 메소드의 body를 코딩한 것.
 */
public class LambdaEx {

	public static void main(String[] args) {
		MyInterfaceImpl mi = new MyInterfaceImpl();
		mi.sayHello();
		
		// 인터페이스를 익명객체로 생성하여 사용
		MyInterface ma = new MyInterface() {
			
			@Override
			public void sayHello() {
				System.out.println("hello, Anonymous MyInterface instance");
				
			}
		};
		ma.sayHello();
		
		// Lambda 표기법
		MyInterface ml = () -> {
			System.out.println("hello, Lambda funtion MyInterface instance"); 
		};
		ml.sayHello();
	}
}
