package p01.using_generic;

/*
<T> : (T;template)

- class명 바로 다음에 사용함.
- T는 class Box에서 사용하는 데이터 타입임-> 가상의 데이터 타입(아직 결정되지 않음 데이터 타입)
- T 대신 다른 글자를 사용해도 됨.-> 꼭 T를 사용해야하는 것은 아님.
  - 통상 한 글자의 영물 대문자를 사용함.
- Box<T> 전체가 데이터 타입이면서 클래스명으로 간주함.
*/

public class Box<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

/*
 public class Box<String> {
	private String t;

	public String getT() {
		return String;
	}

	public void setT(String t) {
		this.t = t;
	}

}
 */
