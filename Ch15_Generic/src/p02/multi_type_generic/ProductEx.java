package p02.multi_type_generic;

class Tv {}
class Car {}

public class ProductEx {

	public static void main(String[] args) {
		Product<Tv, String> p = new Product<Tv, String>();
		p.setKind(new Tv());
		p.setModel("스마트TV");
		
		Tv tv = p.getKind();
		String tvModel = p.getModel();
		
		Product<Car, String> p2 = new Product<Car, String>();
		p2.setKind(new Car());
		p2.setModel("스마트TV");
		
		Car car = p2.getKind();
		String carModel = p2.getModel();
	}
	
}
