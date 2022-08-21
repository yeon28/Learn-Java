package p08.import_ex.mycompany;

import p08.import_ex.hankook.SnowTire;
import p08.import_ex.hankook.Tire;
import p08.import_ex.hyndai.Engine;
import p08.import_ex.kumho.BigWidthTire;

//1. 다른 패키지에 있는 클래스를 사용하려면 임폴트 키워드를 사용해야함.
//2. 클래스 이름은 패키지에 이름과 결합되어 있음
//  - 같은 클래스 이름이라도 패키지가 틀리면 다른 클래스로 인식됨.

public class Car {

	public static void main(String[] args) {
		
		Engine engine = new Engine();
		SnowTire snowtire = new SnowTire();
		BigWidthTire bigtire = new BigWidthTire();
		
		Tire hankookTire = new Tire();
		
//		p08.inport_ex.hankook.Tire kumhoTire = new p08.inport_ex.kumho.Tire();
//		--> error) Type mismatch: cannot convert from p08.inport_ex.kumho.Tire to p08.inport_ex.hankook.Tire
//		타입이 맞지 않아서 에러 발생, 한국과 금호가 같은 이름을 갖는 Tire()클래스를 갖음. 하지만 서로 패키지가 다르기 때문에 다른 클래스로 인식함.
//		결론 : 같은 클래스 이름이라도 패키지가 틀리면 다른 클래스로 인식됨.

		
		
	}

}
