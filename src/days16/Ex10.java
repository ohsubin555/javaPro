package days16;

import java.util.Date;

public class Ex10 {

	public static void main(String[] args) {
		
		
		Date d = new Date ();
		/*
		System.out.println(d.getYear()+1900);     // 년도 - 1900  
		System.out.println(d.getDate());     // 일 (1~31)

		System.out.println(d.getDay());      // 요일 (0~6)
		System.out.println(d.getHours());    // 시 (0~23)
		System.out.println(d.getMinutes());  // 분 (0~59)
		System.out.println(d.getSeconds());  // 초 (0~59)

		System.out.println(d.getTime());     // 1970-01-01부터 경과한 ms
		
		System.out.println( "일월화수목금토".charAt( d.getDay() ));
		*/
		    
		
		//개강일로 부터 몇일 지났는지 코딩
		
		Date startDate = new Date(2026-1900,5-1,11);
		System.out.println(startDate);
		
		Date today = new Date();
		//long dif = new Date() -  new Date(2026-1900,5-1,11);

	}

}
