package days16;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex04_03 {

	public static void main(String[] args) {
		
		LocalTime t = LocalTime.now();
		//System.out.println(t);  // ns 까지
		
		//시간
		System.out.println(t.get(ChronoField.HOUR_OF_DAY));
		System.out.println(t.getHour());
		//분
		System.out.println(t.get(ChronoField.MINUTE_OF_HOUR));
		System.out.println(t.getMinute());
		//초
		System.out.println(t.get(ChronoField.SECOND_OF_MINUTE));
		System.out.println(t.getSecond());
		//밀리초
		System.out.println(t.get(ChronoField.MILLI_OF_SECOND));
		//System.out.println(t.get());
		//나노초
		System.out.println(t.get(ChronoField.NANO_OF_SECOND));
		System.out.println(t.getNano());
		
	

	}

}
