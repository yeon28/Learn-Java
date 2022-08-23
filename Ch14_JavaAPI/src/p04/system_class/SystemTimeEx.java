package p04.system_class;

/*
 * System.nanoTime()
 * - 현재시간을 나노(1/1000000000) 초(nano second) 단위로 환산한 정수 값
 *   - 1970년 1월 1일 0시 0분 0초 기준으로 계산된 정수 값
 * - 사용 용도 : 프로그램 실행 소요시간 계산
 * 
 * System.currentTimeMillis()
 * - 현재시간을 mili(1/1000) second 단위로 환산한 정수 값
 */
public class SystemTimeEx {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		int sum = 0;

		for (int i = 0; i < 1000000; i++) {
			sum += i;
		}

		long engTime = System.nanoTime();
		
		System.out.println("sum : " + sum);
		System.out.println("1~백만 숫자 합계 소요시간 : " + (engTime - startTime));
		
		
		System.out.println("----------------------------------------");
		
		
		startTime = System.currentTimeMillis();

		sum = 0;

		for (int i = 0; i < 1000000; i++) {
			sum += i;
		}

		engTime = System.currentTimeMillis();
		
		System.out.println("sum : " + sum);
		System.out.println("1~백만 숫자 합계 소요시간 : " + (engTime - startTime));
	}
}
