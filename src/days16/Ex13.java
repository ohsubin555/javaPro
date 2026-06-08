package days16;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author subin
 * @date 2026. 6. 2. 오후 4:05:53
 * @subject 
 * @content 
 * 
 */


public class Ex13 {

	public static void main(String[] args) {
		
		
		
		Calendar c = Calendar.getInstance();
		String pattern =  "yyy/MM/dd a hh:mm:ss.SSS E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String strDate =  sdf.format(c.getTime());
		System.out.println(strDate);
		
		
		
		
		
//		1번
//		Date d = new Date();
//		System.out.println(d.toLocaleString());
//		System.out.println(d.toGMTString());
//		
//		// 출력형식)  2025/02/28 a 04:48:00 금요일
//		String pattern = "yyy/MM/dd a hh:mm:ss.SSS E요일";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		String strDate = sdf.format(d);
//		System.out.println(strDate);
	}

}
