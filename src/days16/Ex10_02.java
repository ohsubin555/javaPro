package days16;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex10_02 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		//Calendar c = new GregorianCalendar();

		System.out.println(c.get(1));
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_YEAR)); // 1/1 부터 몇 일 지났는지
		System.out.println(c.get(Calendar.DAY_OF_MONTH));// 데이트랑 같음
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));  //24 시 기준
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.MILLISECOND));
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); // sun: 1 ~ sat:7 , differnet with date : sun:0 ~ sat:6
		
		
		// c객체의 그 달의 마지막 날짜가 몇 일까지 있는가?
		
		int lastDate = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);
		
	
		
	}//main

}//class
