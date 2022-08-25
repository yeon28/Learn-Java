package p13.time_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date date = new Date();
		
		String strNow = date.toString();
		System.out.println(strNow);
		System.out.println(date);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 DD일 hh시 mm분 ss초");
		//"yyyy년 MM월 dd일 hh시 mm분 ss초"
		// yyyy : year 4자리 , MM : month 2자리, dd : day 2자리 ...
		// MM은 month , mm은 minute
		
		String strNow2 = sdf.format(date);
		System.out.println(strNow2);
		
	}
	
}
