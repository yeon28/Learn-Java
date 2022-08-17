package p11.practice2;

public class PolymophismEx {

	public static void main(String[] args) {
		displayObject(new Circle("red", false, 1));
		displayObject(new Rectangle("red", false, 3,4));
		
		DummyClass dummy = new DummyClass();
		System.out.println(dummy.toString());
	}
	
	//paramter에서 promotion이 발생됨.
	public static void displayObject(GeometricObject geoObj) {
		System.out.println("Object : " + geoObj.toString());	// polymophism
	}

}
