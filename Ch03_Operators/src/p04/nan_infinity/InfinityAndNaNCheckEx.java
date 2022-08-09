package p04.nan_infinity;

/*
 *  Infinity : 부모를 0으로 나눌 경우
 *  NaN : Not a Number
 */

public class InfinityAndNaNCheckEx {

	public static void main(String[] args) {

		int x = 5;
		double y = 0.0;
		double z;
		
		z = x/y; // infinity
		
		System.out.println("z = " + z);
		
		if ((Double.isInfinite(z)) || (Double.isNaN(z))) {
			System.out.println("z의 값을 산출 할 수 없습니다.");
		}else {
			z = z+2;
		}
		
//		------------------------------------------------
		
		z = x%y; // NaN
		
		System.out.println("z = " + z);
		
		if ((Double.isInfinite(z)) || (Double.isNaN(z))) {
			System.out.println("z의 값을 산출 할 수 없습니다.");
		}else {
			z = z+2;
		}
		
	}

}
