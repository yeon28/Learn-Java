package p01.basic3;

/*
lambda expression 사용 규칙

- 추상메소드의 파라메터 갯수가 1개이면 ()괄호 제거 가능함.
 */
public class MyFuntionalInterfaceEx {

	public static void main(String[] args) {
		MyFuntionalInterface fi;
		
		fi = (x) -> {
			int result = x*5;
			System.out.println(result);
		};
		fi.method(5);
		
		fi = (x) -> {System.out.println(x*5);};
		fi.method(5);
		
		//추상메소드의 파라메터 갯수가 1개이면 ()괄호 제거 가능함.
		fi = x -> System.out.println(x*5);
		fi.method(5);
	}
	
}
