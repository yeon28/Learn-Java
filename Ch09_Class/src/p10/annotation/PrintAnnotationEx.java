package p10.annotation;

import java.lang.reflect.Method;

public class PrintAnnotationEx {

	public static void main(String[] args) {
		// service clss에 선언된 메소드 정보를 갖는 프로그램
		// reflection : 클레스에서 존재하는 메소드 정보를 가져오는 것
//			--> Method[] declaredMethod = Service.class.getDeclaredMethods();
		
		
		Method[] declaredMethod = Service.class.getDeclaredMethods();

		for (Method method : declaredMethod) {
			// 메소드 위에 @PrintAnnotation이 존재하는지체크
			if (method.isAnnotationPresent(PrintAnnotation.class)) {

				// @PrintAnnotation 정보 가져오기 
				PrintAnnotation printAnnotation 
							= method.getAnnotation(PrintAnnotation.class);
				System.out.println("[" + method.getName() + "]");
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();

				try {
					method.invoke(new Service());
				} catch (Exception e) {
					System.out.println();

				}
			}
		}

	}

}
