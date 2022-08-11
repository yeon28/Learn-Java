package p08.inport_ex.mycompany;

import p08.inport_ex.hankook.SnowTire;
import p08.inport_ex.hankook.Tire;
import p08.inport_ex.hyndai.Engine;
import p08.inport_ex.kumho.BigWidthTire;

//1. 다른 패키지에 있는 클래스를 사용하려면 임폴트 키워드를 사용해야함.
//2. 클래스 이름은 패키지에 이름과 결합되어 있음
//  - 같은 클래스 이름이라도 패키지가 틀리면 다른 클래스로 인식됨.

public class Car {

	public static void main(String[] args) {
		
		Engine engine = new Engine();
		SnowTire snowtire = new SnowTire();
		BigWidthTire bigtire = new BigWidthTire();
		Tire hankookTire = new Tire();
		p08.inport_ex.hankook.Tire kumhoTire = new p08.inport_ex.kumho.Tire();
		
		
	}

}
