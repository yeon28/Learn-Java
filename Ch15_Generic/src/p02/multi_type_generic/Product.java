package p02.multi_type_generic;

/*
Product<T, M>
: Generic 타입으로 T M을 사용하겠다는 의미(generic multi type)

- generic type뿐만 아니라, primitive 타입, 다른 클래스도 사용 가능함.
- 대부분의 class들은 최대 3개까지 generic 타입 사용함.
 */
public class Product<T, M> {
	private T kind;
	private M model;
	
	private int age;
	//generic type뿐만 아니라, primitive 타입, 다른 클래스도 사용 가능함.
	
	
//	----------------getter setter
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
