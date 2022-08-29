package p01.basic2;

/*
lambda expression 사용 규칙

- 메소드 본문 내용 코딩을 가능하면 1개 명령어로 코딩할 것.
  - 추상메소드 바디에 있는 명령어가 1개이면 {} 제거 가능함.
 */

public class MyFuntionalInterfaceEx {

	public static void main(String[] args) {
		MyFuntionalInterface fi;
		
		// lambda 방법1
		fi = () -> {
			String str = "method call";
			System.out.println(str);
		};
		fi.method();
		
		// lambda 방법2
		fi = () -> {System.out.println("method call2");};
		fi.method();
		
		// lambda 방법3
		fi = () -> System.out.println();
		fi.method();
	}
	
}
