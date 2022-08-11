package p07.singleton_usage;

// - 컨스트럭터를 프라이빗으로 선언 
//- 클래스 내에서 필드 선언할 때 본인 클래스 타입으로 선언 가능하고 , 인스턴스 생성할 수 있음.
//- 싱글톤 : 인스턴스를 클래스 내에서 1번만 생성하고, 다른 클래스에서느 뉴로 인스턴스 새로 만들 필요 없이 생성된 인스턴스 사용 가능하게 하려는 의도 있음 

public class Singleton {
	// 자기 자신의 클래스에 대한 필드 선언하고 인스턴스 생성함 
	private static Singleton singleton = new Singleton();
	
	

	private  Singleton() {
		
		
		
	}
	public static Singleton getIntance() {
		return singleton;
	}
	
	public void printSingletonHello() {
		System.out.println("hello singleton instance method");
	}
	
	
}
