package days22.sec05;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

/**
 * @author subin
 * @date 2026. 6. 11. 오전 11:11:25
 * @subject OptionalXXX  클래스 
 * @content  1) 집계값만 저장 X
 *           2) 집계값이 유무 -> 처리
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		// 제네릭 T 는 기본형 X
		List<Integer> list = new ArrayList<>();
		
		 list.stream()                    // Stream<Integer>
		    .mapToInt(Integer::intValue)     // IntStream   클래스명::정적메소드
		    .average()	
//		    .orElse(0)  최종 메소드 
		    .ifPresent(  System.out::println  );
		
		// [3]
//		double avg  = list.stream()                    // Stream<Integer>
//			    .mapToInt(Integer::intValue)     // IntStream   클래스명::정적메소드
//			    .average()			    
//			    .orElse(0); // 집계값이 존재하지 않으면 0으로 초기화
		
		// [2]
//		OptionalDouble opAvg = list.stream()                    // Stream<Integer>
//	    .mapToInt(Integer::intValue)     // IntStream   클래스명::정적메소드
//	    .average();
//		
//		if ( opAvg.isPresent() ) {  // 집계한 평균값이 존재 true/false
//			System.out.println( opAvg.getAsDouble() );
//		} else {
//			System.out.println("0.0");
//		}
		
		
		// [1]
		if ( !list.isEmpty() ) {
			// list 요소가 1개도 없다.
			/*
//		java.util.NoSuchElementException: No value present
		double avg = list.stream()                    // Stream<Integer>
		    .mapToInt(Integer::intValue) // IntStream   클래스명::정적메소드
		    .average()
		    .getAsDouble();
		    
		System.out.println( avg );
			 */
			
		} // if
		
		

	} // main

}
