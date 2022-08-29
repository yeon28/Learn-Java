package p01.basic4;

/*
lambda expression 사용 규칙
- 추상메소드의 body가 return 키워드를 포함하면, return 키워드와 {}를 제거 가능함.
- 
 */
public class MyFuntionalInterfaceEx {

	public static void main(String[] args) {
		MyFuntionalInterface fi;
		
		fi = (x,y) -> {
			int result = x+y;
			return result;
		};
		System.out.println(fi.method(5, 2));
		
		fi = (x,y) -> {return x+y;};
		System.out.println(fi.method(5, 2));
		
		fi = (x,y) -> x+y;
		System.out.println(fi.method(5, 2));
		
		fi = (x,y) -> sum(x,y);
		System.out.println(fi.method(5, 2));
	}
	
	public static int  sum(int x, int y) {
		return (x+y);
	}
	
}
