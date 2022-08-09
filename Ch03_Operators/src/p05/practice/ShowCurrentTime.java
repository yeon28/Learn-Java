package p05.practice;

public class ShowCurrentTime {

	public static void main(String[] args) {

		long totalMilliSeconds = System.currentTimeMillis();
		System.out.println( "totalMilliSeconds"+ totalMilliSeconds);
		
		long totalSeconds = totalMilliSeconds / 1000; 
		// ms는 10^-3;
		System.out.println("totalSeconsds = "+ totalSeconds);
				
		long currentSecond = totalSeconds % 60;
		
		System.out.println("currentSecond = "+ currentSecond);
		
		long totalMininte = totalSeconds / 60;
		System.out.println("totalMininte = "+ totalMininte);
		
		
		long currentMininte = totalMininte % 60;
		System.out.println("currentMininte = "+ currentMininte);
		
		long totalHours = totalMininte / 60;
		
		long currentHours = totalHours % 24;
		System.out.println("현재시간은 " + currentHours + "시" + 
							currentMininte + "분" + currentSecond +"초 입니다" );

	}

}
