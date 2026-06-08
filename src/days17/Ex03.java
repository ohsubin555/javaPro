package days17;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author subin
 * @date 2026. 6. 4. 오전 9:20:38
 * @subject  날짜와 날짜 사이 간격 Period 클래스, 시간과 시간 사이 간격  Duration 클래스 
 * @content 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		
		//개강일로 부터 오늘날짜까지 수업일수 몇 일 이 지났는지 일수 파악? 24
		
		LocalDate od = LocalDate.of(2026, 5, 11);
		LocalDate td = LocalDate.now();
		
		Period p = Period.between(od, td); // od 이상 td 미만
		System.out.println(p.getYears());
		System.out.println(p.get(ChronoUnit.YEARS));
		System.out.println(p.getMonths());
		System.out.println(p.get(ChronoUnit.MONTHS));
		System.out.println(p.getDays());
		System.out.println(p.get(ChronoUnit.DAYS));
	}//main

}//class
