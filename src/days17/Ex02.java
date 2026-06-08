package days17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @author subin
 * @date 2026. 6. 4. 오전 9:08:58
 * @subject [TemporalAdjusters 클래스]
 * @content 
 * 
 */
public class Ex02 {
	
	

	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		//이번달 첫번째 월요일? 6/1
		
		d = d.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(d);		
		
		d = d.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
		System.out.println(d);		

	}

}
