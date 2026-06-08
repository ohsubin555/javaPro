package days17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*
 * 
 * Date, Calendar + 형식화 클래스
 *          j.t 핵심클래스
 *          LocalDate
 *          LocalTime
 *          LocalDateTime 클래스
 */
public class Ex01 {
	

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		
		dt =  dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt);
		
		LocalDate d = dt.toLocalDate();
		System.out.println(d);
		
		LocalTime t = dt.toLocalTime();
		System.out.println(t);
		


	}

}
