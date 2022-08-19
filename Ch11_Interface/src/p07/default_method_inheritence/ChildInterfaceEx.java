package p07.default_method_inheritence;

public class ChildInterfaceEx {

	public static void main(String[] args) {
		ChildInterface ci = new ChildInterface() {
			
			@Override
			public void method1() {

				System.out.println("anony method1 실행");
			}
			
//			@Override
//			public void method2() {
//				System.out.println("anony method2 실행");;
//			}
			
			@Override
			public void method3() {
				System.out.println("anony method3 실행");
				
			}
		};
		
		ci.method1();
		ci.method2();
		ci.method3();
	}
}
