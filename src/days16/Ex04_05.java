package days16;

import java.awt.SecondaryLoop;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Ex04_05 {

	public static void main(String[] args) {
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		t = t.truncatedTo(ChronoUnit.SECONDS);
		System.out.println(t);
		t = t.truncatedTo(ChronoUnit.MINUTES);
		System.out.println(t);
		
	
		LocalDate now = LocalDate.now();
		
		System.out.println(now); // 2026-06-02
		now =now.withDayOfMonth(1);
		System.out.println(now);
		now = now.plusMonths(1);
		System.out.println(now);
		now = now.minusDays(1);
		System.out.println(now);
		System.out.println(now.getDayOfMonth());
        
	}//main

}//class
