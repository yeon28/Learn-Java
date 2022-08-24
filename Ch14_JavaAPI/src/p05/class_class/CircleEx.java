package p05.class_class;


public class CircleEx {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		Class cls1 = circle.getClass();
		
		System.out.println(cls1.getName());
		System.out.println(cls1.getSimpleName());
		System.out.println(cls1.getPackage().getName());
		
		System.out.println();
		
		try {
			Class cls2 = Class.forName("p05.class_class.Circle");
			System.out.println(cls2.getName());
			System.out.println(cls2.getSimpleName());
			System.out.println(cls2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			System.out.println("해당클래스 찾을 수 없음.");
		}
		
	}

}
