package q08;

public class Quiz08_CasioCal implements Quiz08_Calculator {
	int a;
	int b;

	public Quiz08_CasioCal() {
	}
	public Quiz08_CasioCal(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void add() {
		System.out.println(a+b);
	}

	@Override
	public void sub() {
		System.out.println(a-b);
	}

	@Override
	public void divide() {
		System.out.println(a/b);
	}

	@Override
	public void multiple() {
		System.out.println(a*b);
	}

}
