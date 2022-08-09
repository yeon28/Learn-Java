package p03.realnumber_problem;

public class RealNumberCrossUseEx2 {

	public static void main(String[] args) {

		int apple =1;
		
		int totalPieces = apple * 10;
		int num = 7;
		int temp = totalPieces - num;
		
		double result = temp / 10.0;
		
		System.out.println("사과 1개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남음 ");
		
	}

}
