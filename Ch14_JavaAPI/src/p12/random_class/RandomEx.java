package p12.random_class;

import java.util.Random;

/*
Math.random()은 0~0.99999 사이의 값을 리턴함
Random class에서 nextInt(45)는 (int)(Math.random()*45) -> 0 ~ 44사이 정수값
 */
public class RandomEx {

	public static void main(String[] args) {
		int[] selectNum = new int[6];
//		Random random = new Random();
		Random random = new Random(2); 
		// Random(seed) Random생성자에 seed값을 정해주면 같은 난수가 나옴
		
		System.out.println("선택번호 : ");
		for (int i = 0; i < 6; i++) {
			selectNum[i] = random.nextInt(45) +1; // 1 ~ 44사이 난수 정수값
			System.out.print(selectNum[i]+ " ");
		}
		System.out.println();
		
//		---------------------------------
		
		int[] winNum  = new int[6];
//		random = new Random();
		random = new Random(2);
		
		System.out.println("당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			winNum[i] = random.nextInt(45) +1;
			System.out.print(winNum[i]+ " ");
		}
		System.out.println();
	}
	
}
