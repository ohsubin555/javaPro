package days17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author subin
 * @date 2026. 6. 4. 오전 9:43:26
 * @subject 
 * @content j.t.format 형식화 클래스 - DataTimeFormatter 형식화 클래스 
 * 
 */
public class Ex04 {

	public static void main(String[] args) {

		// [2] 시간정보 X, 날짜정보 O
//		//     s  -> LocalDate 변환
//		String s = "2025년 02월 17일 (월)";
//		// [C풀이]
//		String pattern = "yyyy년 MM월 dd일 (E)";
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
//		LocalDate d = LocalDate.parse(s, dtf);
//		System.out.println(d );
		
		/*
		// [B풀이]
		String regex = "(\\d{4})년 (\\d{2})월 (\\d{2})일";
		Pattern pattern = Pattern.compile(regex);		
		Matcher matcher = pattern.matcher(s);
		
		int year , month, date;
		year = month = date = -1;
		if ( matcher.find() ) {
//			System.out.printf("%s: %s-%s-%s \n", matcher.group()
//					                      , matcher.group(1)
//					                      ,  matcher.group(2)
//					                      , matcher.group(3));
			year = Integer.parseInt( matcher.group(1) );
			month = Integer.parseInt( matcher.group(2) );
			date = Integer.parseInt( matcher.group(3) );
		}
		LocalDate d = LocalDate.of(year, month, date);		
		System.out.println(d);
		*/
		// [A풀이]
//		int year = Integer.parseInt( s.substring(0, 4) );
//		int month = Integer.parseInt( s.substring(6, 8) );
//		int date = Integer.parseInt( s.substring(10, 12) );		
//		LocalDate d = LocalDate.of(year, month, date);		
//		System.out.println(d);
		
		
		 
		LocalDateTime dt = LocalDateTime.now();
		// 2026-06-04T10:03:42.489522200
		System.out.println( dt );
		// 2026-06-04
		System.out.println( dt.format(DateTimeFormatter.ISO_LOCAL_DATE) );
		// 20260604
		System.out.println( dt.format(DateTimeFormatter.BASIC_ISO_DATE) );

		// [2025/03/04 화요일 15:16:45.123]
		String pattern = "yyyy/MM/dd E요일 HH:mm:ss.SSS";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String s = dtf.format(dt);
		System.out.println( s );
		


	}//main

}//class
