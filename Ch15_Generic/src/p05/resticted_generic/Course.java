package p05.resticted_generic;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		this.students = (T[]) new Object[capacity];
		// new로 인스턴스를 만들면 모든 필드의 초기 값은 null로 초기화됨.
		
//		this.students = new T[capacity];
//		--> Cannot create a generic array of T
//		오브젝트로 만든 후 캐스팅해서 사용해야함.
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
			
		}
	}
}
