package days16;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex14_02 {

	public static void main(String[] args) {
		//1.
		LocalDate d = LocalDate.now(); //날짜 정보만 가지고 있는 객체
		System.out.println(d.toString());

		//년
		System.out.println(d.get(ChronoField.YEAR));
		System.out.println(d.getYear());
		//월
		System.out.println(d.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(d.getMonthValue());
		//일
		System.out.println(d.get(ChronoField.DAY_OF_WEEK));
		System.out.println(d.getDayOfMonth());
		//요일
		System.out.println(d.get(ChronoField.DAY_OF_WEEK));// mon:1 sun:7
		System.out.println(d.getDayOfWeek());
		//윤년체크하는 메서드
		System.out.println(d.isLeapYear());

	}//m

}//c
