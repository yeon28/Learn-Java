package p01.basic;

public class RelationalOperatorEx2 {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'B';
		
		boolean bResult = (ch1 <ch2);
		System.out.println("bResult = " + bResult);
		
		double d1 =0.1;
		float f1 = 0.1f;
		
		bResult = (d1 == f1);
		System.out.println("bResult = " + bResult);
		
		bResult = (d1 == 0.1); //0.1이 double타입으로 저장됨.--> 실행가능
		System.out.println("bResult = " + bResult);//--> 권장하지 않음.
		
		bResult = ((int)(d1*10) == 1); //0.1이 double타입으로 저장됨.--> 실행가능
		System.out.println("bResult = " + bResult);
		
		bResult = ((float)d1 == f1);
		System.out.println("bResult = " + bResult);
		
	}

}
