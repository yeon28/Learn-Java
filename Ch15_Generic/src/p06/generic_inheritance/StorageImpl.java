package p06.generic_inheritance;

/*
 StorageImpl<T>는 부모 , Storage<T> 자식
 --> generic타입도 부모와 자식간에 상속할 수 있음.
 */
public class StorageImpl<T> implements Storage<T> {
	private T[] array;
	
	public StorageImpl(int capacity) {
		this.array = (T[]) new Object[capacity];
	}
	@Override
	public void add(T item, int index) {
		
	}

	@Override
	public T get(int index) {
		return null;
	}

}
