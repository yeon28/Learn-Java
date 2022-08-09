package p02.enumtype;

import java.util.Calendar;

public class EnumWeek {

	public static void main(String[] args) {
		// week: enum type
		Week today = null;

//		today = 3; --> Type mismatch: cannot convert from int to Week

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 오늘 날짜를 가져오는 메소드

		switch (week) {
		case 1: // 일요일은 1부터 시작(서양식)
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENSDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		default:
			today = Week.SATURDAY;
			break;
		}
	}

}
