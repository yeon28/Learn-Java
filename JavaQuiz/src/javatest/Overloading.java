package javatest;

public class Overloading {
	public void test() {}
	public void test(String str) {}
	public void test(int i) {}
	public void testS(String s) {} //
	public void test(char ch) {}
	public void test(String str, int i) {}
	public void test(int i, String str) {}
	private void test1(int i) {}//
	public int test0() {return 0;}//
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.test1(1);
		o.test0();
	}
}
